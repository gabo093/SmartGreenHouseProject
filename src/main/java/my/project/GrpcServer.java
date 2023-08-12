/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package my.project;

import io.grpc.BindableService;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;
import my.project.ClimateControlServiceGrpc.ClimateControlServiceImplBase;
import my.project.ActivateSprinklersRecuest;
import my.project.IrrigationScheculeRequest;
import my.project.SprinklerTypeRequest;
import my.project.SprinklerControlServiceGrpc.SprinklerControlServiceImplBase;
import my.project.GateControlServiceGrpc.GateControlServiceImplBase;
import my.project.GatesRequest;
import my.project.ChangeClimateConditionsRequest;
import my.project.ClimateRequest;
import my.project.CurrentConfigurationRequest;
import my.project.Empty;
import my.project.MsgReply;
import my.project.ThresholdRequest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.Random;

/**
 * Server code based on the helloWorld App
 * https://raw.githubusercontent.com/grpc/grpc-java/master/examples/src/main/java/io/grpc/examples/helloworld/HelloWorldServer.java
 */
public class GrpcServer {
	private static final Logger logger = Logger.getLogger(GrpcServer.class.getName());
	static Random rand = new Random();
	private Server server;

	private void start() throws IOException, InterruptedException {
		/* Grpc will find a suitable port to run the services (see "0" below) */
		server = Grpc.newServerBuilderForPort(0, InsecureServerCredentials.create())
				.addService((BindableService) new ClimateControlService())
				.addService((BindableService) new SprinklerControlService())
				.addService((BindableService) new GatesControlService())
				.build()
				.start();
		JmDnsServiceRegistration.register("_gRPCserver._tcp.local.", server.getPort());
		logger.info("Server started, listening on " + server.getPort());
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				// Use stderr here since the logger may have been reset by its JVM shutdown hook.
				System.err.println("*** shutting down gRPC server since JVM is shutting down");
				try {
					GrpcServer.this.stop();
				} catch (InterruptedException e) {
					e.printStackTrace(System.err);
				}
				System.err.println("*** server shut down");
			}
		});
	}

	private void stop() throws InterruptedException {
		if (server != null) {
			server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
		}
	  }

	/**
	 * Await termination on the main thread since the grpc library uses daemon threads.
	 */
	private void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	/**
	 * Main launches the server from the command line.
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		final GrpcServer server = new GrpcServer();
		server.start();
		server.blockUntilShutdown();
	}

	static class ClimateControlService extends ClimateControlServiceImplBase{
		
		int degreeCelcius;
		int humidityLevel;
		boolean activateAlerts = false;
		int temperatureThreshold = -1;
		int humidityThreshold = -1;
		

		@Override
		public void setClimateParameters(ClimateRequest request, StreamObserver<MsgReply> responseObserver) {
			System.out.println("Set Climate Parameters...");
			degreeCelcius = request.getDegreeCelcius();
			humidityLevel = request.getHumidityLevel();
			
			System.out.println("Degree Celcius: " + degreeCelcius);
			System.out.println("Humidity Level: " + humidityLevel);
			
			MsgReply.Builder response = MsgReply.newBuilder();
			response.setMessage("The climate parameters were setup successfully! Degree Celcius: "+ degreeCelcius + " | Humidity Level: " + humidityLevel);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		
		}

		@Override
		public void setThresholdAlerts(ThresholdRequest request, StreamObserver<MsgReply> responseObserver) {
			System.out.println("Set Threshold Alerts...");
			
			String climateParameter = request.getClimateParameter();
			int threshold = request.getThreshold();
			String message;
			
			if(climateParameter.equals("Degree Celcius") || climateParameter.equals("Humidity Level")) {
				if(climateParameter.equals("Degree Celcius")) {
					temperatureThreshold = threshold;
				}else {
					humidityThreshold = threshold;
				}
				System.out.println("Climate Parameter: " + climateParameter);
				System.out.println("Threshold: " + threshold);
				message = "The threshold for the " + climateParameter + " was setup successfully! Threshold value: " + threshold;
			}else {
				message = "Error! Invalid climate parameter (Allowed values: Degree Celcius | Humidity Level)";
			}
			
			MsgReply.Builder response = MsgReply.newBuilder();
			response.setMessage(message);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

		@Override
		public void activateAlerts(Empty request, StreamObserver<MsgReply> responseObserver) {
			System.out.println("Activate Alerts...");
			
			activateAlerts = true;
			
			MsgReply.Builder response = MsgReply.newBuilder();
			response.setMessage("Alerts activated successfullly!");
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

		@Override
		public void changeClimateConditions(ChangeClimateConditionsRequest request, StreamObserver<MsgReply> responseObserver) {
			System.out.println("Change Climate Conditions...");
			
			MsgReply.Builder response = MsgReply.newBuilder();
			response.setMessage("The Climate Conditions were changed successfully with the following climate parameters: | Temperature (Degree Celsius): " + degreeCelcius + " | Humidity Level: " + humidityLevel );
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

		@Override
		public void activateAutomaticClimateChange(Empty request, StreamObserver<MsgReply> responseObserver) {
			System.out.println("Activate Automatic Climate Change...");
			
			MsgReply.Builder response = MsgReply.newBuilder();
			response.setMessage("Automatic Climate Change activated successfullly!");
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

		@Override
		public void getCurrentClimateConditions(Empty request, StreamObserver<MsgReply> responseObserver) {
			System.out.println("Get Current Climate Conditions...");
			
			MsgReply.Builder response = MsgReply.newBuilder();
			response.setMessage("Current Climate Conditions | Temperature (Degree Celcius): " + degreeCelcius + " | Humidity Level: " + humidityLevel);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

		@Override
		public void getCurrentConfiguration(CurrentConfigurationRequest request, StreamObserver<MsgReply> responseObserver) {
			System.out.println("Get Current Configuration...");
			
			MsgReply.Builder response = MsgReply.newBuilder();
			response.setMessage("Current Configuration | Climate Parameters - Degree Celcius: " + degreeCelcius + " , Humidity Level: " + humidityLevel + " | Alerts activated -  " + activateAlerts + "| Thresholds - Temperature: " + temperatureThreshold + " Humidity: " + humidityThreshold);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

		
	}

	
	static class SprinklerControlService extends SprinklerControlServiceImplBase {

		@Override
		public void setSprinklerType(SprinklerTypeRequest request, StreamObserver<MsgReply> responseObserver) {
			System.out.println("Set type of Sprinklers...");
			
			String type = request.getType();
			String message;
			if(type.equals("water") || type.equals("fertiliziers")) {
				System.out.println("Setting Sprinklers for: " + type);
				message = "The sprinklers for "+ type + " were setup successfully!";
			}else {
				message = "Error! Invalid sprinkler type: "+ type + " (Allowed values: water | fertiliziers)";
			}
			

			
			MsgReply.Builder response = MsgReply.newBuilder();
			response.setMessage(message);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

		@Override
		public void activateSprinklers(ActivateSprinklersRecuest request, StreamObserver<MsgReply> responseObserver) {
		  System.out.println("Activate Sprinklers...");
		  
		   int sprinklersNumber = request.getNumberOfSprinklers();
		   System.out.println("Number of sprinklers to active: " + sprinklersNumber);
		   int time = request.getTime();
		   System.out.println("Operating time in minutes: " + time);

			MsgReply.Builder response = MsgReply.newBuilder();
			response.setMessage( sprinklersNumber + " sprinklers were activated successfully! They will be operating continuously for " + time + " minutes");
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

		@Override
		public void setAutomaticIrrigationSchecule(IrrigationScheculeRequest request, StreamObserver<MsgReply> responseObserver) {
			System.out.println("Set Automatic Irrigation Schecule...");
			
			int frequency = request.getFrequency();
			int time = request.getTime();
			System.out.println("Frecuency: Every " + frequency+ " minutes");
			System.out.println("Time: The automatic irrigation will work for " + time + " hours");
			System.out.println("Set Automatic Irrigation Schecule...");
			MsgReply.Builder response = MsgReply.newBuilder();
			response.setMessage("The sprinklers were configured for automatic irrigation successfully! They will be operating every " + frequency + " minutes for " + time + " hours" );
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}
		
		
	}


	static class GatesControlService extends GateControlServiceImplBase{

		@Override
		public void setupGates(GatesRequest request, StreamObserver<MsgReply> responseObserver) {
			System.out.println("Setup Gate...");
			
			String state = request.getState();
			int gateIdentifier = request.getGateIdentifier();
			
			String message = "";
			
			if(state.equals("Open") || state.equals("Closed")) {
				System.out.println("Changing state of gate: "+ gateIdentifier  + " to: " +  state);
				message = "The state of the gate: " + gateIdentifier + " was changed successfully. Current state: " + state;
			}else {
				System.out.println("Error while updating the state! Invalid state: " + state);
				message = "Error! Invalid state: " + state + " (Allowed states: Open | Closed)";
			}
			
			MsgReply.Builder response = MsgReply.newBuilder();
			response.setMessage(message);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

		@Override
		public void getGatesInformation(Empty request, StreamObserver<MsgReply> responseObserver) {
			System.out.println("Get gate information...");
			
			String gatesInformationMessage = "Gates: | Gate: 1, status: Open | Gate: 2, status: Open | Gate: 3, status: Closed ";
			
			System.out.println(gatesInformationMessage);
			
			MsgReply.Builder response = MsgReply.newBuilder();
			response.setMessage(gatesInformationMessage);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
			
		}
		
	}

}