package my.project;

import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Random;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Client code based on the helloWorld App
 * https://raw.githubusercontent.com/grpc/grpc-java/master/examples/src/main/java/io/grpc/examples/helloworld/HelloWorldClient.java
 */
public class GrpcClient {
	  private static final Logger logger = Logger.getLogger(GrpcClient.class.getName());
	  private final ClimateControlServiceGrpc.ClimateControlServiceBlockingStub blockingStubMyService1;
	  private final SprinklerControlServiceGrpc.SprinklerControlServiceBlockingStub blockingStubMyService2;
	  private final GateControlServiceGrpc.GateControlServiceBlockingStub blockingStubMyService3;
	  static Random rand = new Random();

	  /** Construct client for accessing HelloWorld server using the existing channel. */
	  public GrpcClient(Channel channel) {
	    // The sync calls (blocking)
	    blockingStubMyService1 = ClimateControlServiceGrpc.newBlockingStub(channel);
	    blockingStubMyService2 = SprinklerControlServiceGrpc.newBlockingStub(channel);
	    blockingStubMyService3 = GateControlServiceGrpc.newBlockingStub(channel); 
	    //MyService3Grpc.newBlockingStub(channel);
	  }

	  // Run function1Service1 from Service1 (Unary RPC)
	  public String setClimate(String degreecelcius, String huminitylevel) {
		  logger.info("Calling gRPC unary type (from the client side)");

		  try {
			  ClimateRequest request = ClimateRequest.newBuilder().setDegreeCelcius(Integer.parseInt(degreecelcius)).setHumidityLevel(Integer.parseInt(huminitylevel)).build();
			  MsgReply reply = blockingStubMyService1
					  .withDeadlineAfter(5, TimeUnit.SECONDS)
					  .setClimateParameters(request);
			  System.out.println("Client Received: " + reply.getMessage());
			  return reply.getMessage();
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return "";
		  }
	  }
	  public String activatethreshold(String degreecelcius,String huminitylevel){
		  logger.info("Calling gRPC unary type (from the client side)");
		  try {
			  ThresholdRequest request = ThresholdRequest.newBuilder()
					  .setThreshold(Integer.parseInt(degreecelcius)).setClimateParameter("Degree Celcius").build();
			  MsgReply reply = blockingStubMyService1
					  .withDeadlineAfter(5, TimeUnit.SECONDS)
					  .setThresholdAlerts(request);
			  
			  System.out.println("Client Received: " + reply.getMessage());
			  
			  	request = ThresholdRequest.newBuilder()
					  .setThreshold(Integer.parseInt(huminitylevel)).setClimateParameter("Humidity Level").build();
			  	reply = blockingStubMyService1
					  .withDeadlineAfter(5, TimeUnit.SECONDS)
					  .setThresholdAlerts(request);
			  
			  System.out.println("Client Received: " + reply.getMessage());
			  
			  Empty	emptyrequest = Empty.newBuilder().build();
				  	reply = blockingStubMyService1
						  .withDeadlineAfter(5, TimeUnit.SECONDS)
						  .activateAlerts(emptyrequest);
				  
			  System.out.println("Client Received: " + reply.getMessage());
			return reply.getMessage();
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return "";
		  }
	  }
	  
	  public String activateAutomaticClimateChange() {
		  logger.info("Calling gRPC unary type (from the client side)");

		  try {
			  Empty request = Empty.newBuilder().build();
			  MsgReply reply = blockingStubMyService1
					  .withDeadlineAfter(5, TimeUnit.SECONDS)
					  .activateAutomaticClimateChange(request);
			  System.out.println("Client Received: " + reply.getMessage());
			  return reply.getMessage();
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return "";
		  }
	  }
	  
	  public String getCurrentConfiguration() {
		  logger.info("Calling gRPC unary type (from the client side)");

		  try {
			  CurrentConfigurationRequest request = CurrentConfigurationRequest.newBuilder().setType("All").build();
			  MsgReply reply = blockingStubMyService1
					  .withDeadlineAfter(5, TimeUnit.SECONDS)
					  .getCurrentConfiguration(request);
			  System.out.println("Client Received: " + reply.getMessage());
			  return reply.getMessage();
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return "";
		  }
	  }
	  
	  public String activeSprinklers(String type,String numberOfStrinklers,String time) {
		  logger.info("Calling gRPC unary type (from the client side)");
		  String message = "";
		  try {
			  SprinklerTypeRequest request = SprinklerTypeRequest.newBuilder().setType(type).build();
			  MsgReply reply = blockingStubMyService2
					  .withDeadlineAfter(5, TimeUnit.SECONDS)
					  .setSprinklerType(request);
			  System.out.println("Client Received: " + reply.getMessage());
			  
			  
			  ActivateSprinklersRecuest activateRequest = ActivateSprinklersRecuest.newBuilder().setNumberOfSprinklers(Integer.parseInt(numberOfStrinklers)).setTime(Integer.parseInt(time)).build();
			  reply = blockingStubMyService2
					  .withDeadlineAfter(5, TimeUnit.SECONDS)
					  .activateSprinklers(activateRequest );
			  System.out.println("Client Received: " + reply.getMessage());
			  return reply.getMessage();
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return "";
		  }
	  }
	  
	  public String activateAutomaticIrrigation(String frequency, String time) {
		  logger.info("Calling gRPC unary type (from the client side)");

		  try {
			  IrrigationScheculeRequest request = IrrigationScheculeRequest.newBuilder().setFrequency(Integer.parseInt(frequency)).setTime(Integer.parseInt(time)).build();
			  MsgReply reply = blockingStubMyService2
					  .withDeadlineAfter(5, TimeUnit.SECONDS)
					  .setAutomaticIrrigationSchecule(request);
			  System.out.println("Client Received: " + reply.getMessage());
			  return reply.getMessage();
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return "";
		  }
	  }
	  
	  public String getGatesStatus() {
		  logger.info("Calling gRPC unary type (from the client side)");

		  try {
			  Empty request = Empty.newBuilder().build();
			  MsgReply reply = blockingStubMyService3
					  .withDeadlineAfter(5, TimeUnit.SECONDS)
					  .getGatesInformation(request);
			  System.out.println("Client Received: " + reply.getMessage());
			  return reply.getMessage();
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return "";
		  }
	  }
	  
	  public String setGate(String gateIdentifier,String state) {
		  logger.info("Calling gRPC unary type (from the client side)");

		  try {
			  GatesRequest request = GatesRequest.newBuilder().setGateIdentifier(Integer.parseInt(gateIdentifier)).setState(state).build();
			  MsgReply reply = blockingStubMyService3
					  .withDeadlineAfter(5, TimeUnit.SECONDS)
					  .setupGates(request);
			  System.out.println("Client Received: " + reply.getMessage());
			  return reply.getMessage();
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return "";
		  }
	  }

	  // Run function1Service2 from Service2 (Server streaming RPC)
	  public void clientSideFunction1Service2() {
		  logger.info("Calling gRPC server streaming type (from the client side)");

		  try {
			  SprinklerTypeRequest request = SprinklerTypeRequest.newBuilder().setType("water").build();
			  MsgReply reply = blockingStubMyService2
					  .withDeadlineAfter(1, TimeUnit.SECONDS)
					  .setSprinklerType(request);		
					System.out.println(reply.getMessage());		// print all messages from the server				
			  logger.info("End of server streaming");
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return;
		  }
	  }
	  

	  // Run function1Service3 from Service3 (Bi-directional streaming RPC)
	  public void clientSideFunction1Service3() {
		  logger.info("Calling gRPC server streaming type (from the client side)");

		  try {
			  GatesRequest request = GatesRequest.newBuilder().setState("Open").setGateIdentifier(1).build();
			  MsgReply reply = blockingStubMyService3
					  .withDeadlineAfter(1, TimeUnit.SECONDS)
					  .setupGates(request);
					System.out.println(reply.getMessage());		// print all messages from the server				
			  logger.info("End of server streaming");
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return;
		  }
	  }

	  /**
	   * 
	   */
	  public static void main(String[] args) throws Exception {
		  String target;

		  // Service discovery part (Where's the gRPC server running?) 
		  JmDnsServiceDiscovery jmDnsServiceDiscovery = new JmDnsServiceDiscovery();
		  JmDnsServiceDiscovery.find("_gRPCserver._tcp.local.");	// service name
		  do {
			  target = jmDnsServiceDiscovery.getLocGrpc();
			  System.out.println("jmDnsServiceDiscovery: " + target);
		  } while (target.length()<2);		// wait for the service to be discovered

		  ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
				  .build();
		  try {
			  GrpcClient client = new GrpcClient(channel);
			 // client.clientSideFunction1Service1();			// unary type
			 // client.clientSideFunction1Service2();		
			  //client.clientSideFunction1Service3();			
		  } finally {
			  channel.shutdown().awaitTermination(30, TimeUnit.SECONDS);
		  }
	  }
}