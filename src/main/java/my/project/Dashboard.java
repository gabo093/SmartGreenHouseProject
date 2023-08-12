package my.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JTextArea;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	GrpcClient client;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Smart Green House");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(17, 0, 191, 34);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setToolTipText("");
		textArea.setBounds(53, 349, 480, 57);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Set climate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String degreecelcius=textField.getText();
				String huminitylevel=textField_2.getText();
				String response = client.setClimate(degreecelcius,huminitylevel);
				textArea.setText(response);
			}
		});
		btnNewButton.setBounds(10, 60, 161, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(181, 61, 27, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Climate Control");
		lblNewLabel_1.setBounds(41, 38, 86, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("°C");
		lblNewLabel_2.setBounds(217, 64, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("H level");
		lblNewLabel_3.setBounds(283, 64, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Active Threshold ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String degreecelcius=textField_3.getText();
				String huminitylevel=textField_4.getText();
				String response = client.activatethreshold(degreecelcius,huminitylevel);
				textArea.setText(response);
			}
		});
		btnNewButton_1.setBounds(10, 94, 161, 23);
		contentPane.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(246, 61, 27, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(181, 95, 27, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(246, 95, 27, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("°C");
		lblNewLabel_4.setBounds(217, 98, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("H level");
		lblNewLabel_5.setBounds(283, 98, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("Activate automatic\r\n climate change");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String response = client.activateAutomaticClimateChange();
				textArea.setText(response);
			}
		});
		btnNewButton_2.setBounds(329, 64, 204, 34);
		contentPane.add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(181, 129, 349, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Get current configuration");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentConfiguration = client.getCurrentConfiguration();
				textField_1.setText(currentConfiguration);
			}
		});
		btnNewButton_3.setBounds(10, 128, 161, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_6 = new JLabel("Sprinkler control");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(20, 162, 151, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_4 = new JButton("Activate Sprinckler");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Enumeration<AbstractButton> buttons = buttonGroup.getElements();
				while(buttons.hasMoreElements()) {
					JRadioButton jrd = (JRadioButton) buttons.nextElement();
					if(jrd.isSelected()) {
						String time = textField_7.getText();
						String numberOfSprinklers = "10";
						String response = client.activeSprinklers(jrd.getText(),numberOfSprinklers,time);
						textArea.setText(response);
					}
				}
				
			}
		});
		btnNewButton_4.setBounds(10, 241, 178, 23);
		contentPane.add(btnNewButton_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("water");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 183, 75, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("fertilizer");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(106, 183, 82, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton_5 = new JButton(" Automatic Irrigation");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String frequency = textField_8.getText();
				String time = textField_9.getText();
				String response = client.activateAutomaticIrrigation(frequency,time);
				textArea.setText(response);
				
			}
		});
		btnNewButton_5.setBounds(10, 315, 178, 23);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_7 = new JLabel("Gates Control");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(311, 160, 161, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_6 = new JButton("Set Gate");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Enumeration<AbstractButton> buttons = buttonGroup_1.getElements();
				while(buttons.hasMoreElements()) {
					JRadioButton jrd = (JRadioButton) buttons.nextElement();
					if(jrd.isSelected()) {
						String gateIdentifier = textField_5.getText();
						String state = jrd.getText();
						String response = client.setGate(gateIdentifier,state);
						textArea.setText(response);
					}
				}
				
			}
		});
		btnNewButton_6.setBounds(240, 207, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Status");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gatesStatus = client.getGatesStatus();
				textField_6.setText(gatesStatus);
			}
		});
		btnNewButton_7.setBounds(240, 241, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Open");
		rdbtnNewRadioButton_2.setSelected(true);
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(335, 207, 69, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Closed");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(406, 207, 67, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(477, 208, 53, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("N° Gate");
		lblNewLabel_8.setBounds(477, 187, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setBounds(343, 242, 187, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(64, 210, 42, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("min.");
		lblNewLabel_9.setBounds(116, 213, 27, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Time");
		lblNewLabel_10.setBounds(17, 213, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Frequency");
		lblNewLabel_11.setBounds(26, 270, 59, 14);
		contentPane.add(lblNewLabel_11);
		
		textField_8 = new JTextField();
		textField_8.setBounds(17, 284, 24, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("min");
		lblNewLabel_12.setBounds(53, 290, 21, 14);
		contentPane.add(lblNewLabel_12);
		
		textField_9 = new JTextField();
		textField_9.setBounds(106, 284, 27, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Time");
		lblNewLabel_13.setBounds(106, 270, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("hrs");
		lblNewLabel_14.setBounds(143, 290, 27, 14);
		contentPane.add(lblNewLabel_14);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 159, 510, 4);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(207, 329, 12, -167);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(207, 336, 1, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(207, 160, 1, 178);
		contentPane.add(separator_3);
		
		JButton btnNewButton_8 = new JButton("FIND SERVER");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				String target;
				  try {
				  // Service discovery part (Where's the gRPC server running?) 
				  JmDnsServiceDiscovery jmDnsServiceDiscovery = new JmDnsServiceDiscovery();
				  JmDnsServiceDiscovery.find("_gRPCserver._tcp.local.");	// service name
				  do {
					  target = jmDnsServiceDiscovery.getLocGrpc();
					  System.out.println("jmDnsServiceDiscovery: " + target);
				  } while (target.length()<2);		// wait for the service to be discovered

				  ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
						  .build();
				
					  client = new GrpcClient(channel);	
					  textField_10.setText(target);
					  
				  } 
				  catch(Exception exception){
					  System.out.println(exception.getMessage());
				  } 
				  finally {
					  //channel.shutdown().awaitTermination(30, TimeUnit.SECONDS);
				  }
			}
		});
		btnNewButton_8.setBounds(213, 9, 108, 23);
		contentPane.add(btnNewButton_8);
		
		textField_10 = new JTextField();
		textField_10.setEnabled(false);
		textField_10.setBounds(333, 10, 197, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
	
		
		JLabel lblNewLabel_15 = new JLabel("Results");
		lblNewLabel_15.setBounds(10, 349, 63, 14);
		contentPane.add(lblNewLabel_15);
	}
}
