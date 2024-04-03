package main;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JDesktopPane;
import java.awt.Image;
import javax.swing.ImageIcon;

public class MainUILight extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Temperature;
	private JTextField Humidity;
	private JButton btnClear;
	private JTextField CO2;
	private JTextField Weather;
	private JTextField Water;
	private JTextField Location;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
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
	public MainUILight() {
		setTitle("EMS Mark 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 624);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(242, 229, 188));
		contentPane.setBorder(new MatteBorder(5, 5, 1, 1, (Color) new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTest = new JLabel("EMS Software: ");
		lblTest.setFont(new Font("JetBrainsMono Nerd Font", Font.BOLD, 18));
		lblTest.setForeground(new Color(0, 0, 0));
		lblTest.setBounds(12, 27, 249, 17);
		contentPane.add(lblTest);
		
		JLabel lblTemperature = new JLabel("Temperature:");
		lblTemperature.setForeground(new Color(0, 0, 0));
		lblTemperature.setBounds(53, 56, 122, 17);
		contentPane.add(lblTemperature);
		
		Temperature = new JTextField();
		Temperature.setBounds(53, 79, 114, 21);
		contentPane.add(Temperature);
		Temperature.setColumns(10);
		
		JLabel lblHumidity = new JLabel("Humidity:");
		lblHumidity.setForeground(new Color(0, 0, 0));
		lblHumidity.setBounds(53, 123, 89, 17);
		contentPane.add(lblHumidity);
		
		Humidity = new JTextField();
		Humidity.setBounds(53, 141, 114, 21);
		contentPane.add(Humidity);
		Humidity.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "MAP", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(154, 153, 150));
		panel.setBounds(581, 27, 363, 297);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(187, 35, 1, 1);
		panel.add(desktopPane);
		
		JLabel Map = new JLabel("");
		Map.setIcon(new ImageIcon("/home/bakasoggy/Downloads/Map.png"));
		Map.setBounds(12, 22, 339, 263);
		panel.add(Map);
		
		JLabel lblAirQuality = new JLabel("CO2 Amount:");
		lblAirQuality.setForeground(new Color(0, 0, 0));
		lblAirQuality.setBounds(187, 56, 105, 17);
		contentPane.add(lblAirQuality);
		
		CO2 = new JTextField();
		CO2.setBounds(179, 79, 114, 21);
		contentPane.add(CO2);
		CO2.setColumns(10);
		
		Weather = new JTextField();
		Weather.setBounds(179, 141, 114, 21);
		contentPane.add(Weather);
		Weather.setColumns(10);
		
		Water = new JTextField();
		Water.setBounds(326, 79, 114, 21);
		contentPane.add(Water);
		Water.setColumns(10);
		
		Location = new JTextField();
		Location.setBounds(326, 141, 114, 21);
		contentPane.add(Location);
		Location.setColumns(10);
		
		JLabel lblWaterQuality = new JLabel("Water pH Value:");
		lblWaterQuality.setBackground(new Color(79, 91, 153));
		lblWaterQuality.setForeground(new Color(0, 0, 0));
		lblWaterQuality.setBounds(329, 56, 111, 17);
		contentPane.add(lblWaterQuality);
		
		JLabel lblWeather = new JLabel("Weather: ");
		lblWeather.setForeground(new Color(0, 0, 0));
		lblWeather.setBounds(179, 123, 82, 17);
		contentPane.add(lblWeather);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setForeground(new Color(0, 0, 0));
		lblLocation.setBounds(326, 123, 82, 17);
		contentPane.add(lblLocation);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(192, 97, 203));
		panel_2.setBorder(new TitledBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)), "Guide:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBackground(new Color(213, 196, 161));
		panel_2.setBounds(12, 280, 481, 297);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane Guide = new JTextPane();
		Guide.setForeground(new Color(0, 0, 0));
		Guide.setBackground(new Color(205, 171, 143));
		Guide.setBounds(12, 23, 233, 262);
		panel_2.add(Guide);
		
		JTextPane guide1 = new JTextPane();
		guide1.setBackground(new Color(205, 171, 143));
		guide1.setForeground(new Color(0, 0, 0));
		guide1.setBounds(257, 23, 212, 262);
		panel_2.add(guide1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(156, 181, 162));
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 5, true), "Suggestions", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(505, 333, 439, 244);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane Urgent = new JTextPane();
		Urgent.setForeground(new Color(224, 27, 36));
		Urgent.setBackground(new Color(156, 181, 162));
		Urgent.setBounds(12, 22, 110, 106);
		panel_1.add(Urgent);
		
		JTextPane Information = new JTextPane();
		Information.setForeground(new Color(192, 97, 203));
		Information.setBackground(new Color(156, 181, 162));
		Information.setBounds(266, 22, 161, 112);
		panel_1.add(Information);
		
		JTextPane Humiditytab = new JTextPane();
		Humiditytab.setForeground(new Color(255, 190, 111));
		Humiditytab.setBackground(new Color(156, 181, 162));
		Humiditytab.setBounds(133, 22, 121, 54);
		panel_1.add(Humiditytab);
		
		JTextPane WPollution = new JTextPane();
		WPollution.setForeground(new Color(51, 51, 51));
		WPollution.setBackground(new Color(156, 181, 162));
		WPollution.setBounds(12, 140, 110, 92);
		panel_1.add(WPollution);
		
		JTextPane APollution = new JTextPane();
		APollution.setForeground(new Color(255, 255, 255));
		APollution.setBackground(new Color(156, 181, 162));
		APollution.setBounds(133, 140, 294, 92);
		panel_1.add(APollution);
		
		JTextPane Disaster = new JTextPane();
		Disaster.setForeground(new Color(246, 97, 81));
		Disaster.setBackground(new Color(156, 181, 162));
		Disaster.setBounds(134, 88, 120, 42);
		panel_1.add(Disaster);
		
		
		
		Guide.setText("This is a guide to this software: \n" +
				"Range of Values:\n "+"============================="  + " Temperature(0-2)\n" + "| 0 = Cold  | \n" + "| 1 = Good|\n" + "| 2 = Hot    |\n"+
				"==============================\n" + "Humidity Range: \n" + "0 = Good \n"+"1 = Bad\n" + "Location [0=Low Lands(Flood) & 1 = High Land(Landslide Risk)]");
		guide1.setText(" Water Pollution Meter: \n" + "Checks Water Quality\n" +"Values Range from 0-14 pH Values.\n"+"----------------------------------------------------"+"Air Pollution Meter: \n"+
				"Checks for CO2 in the air: \n" + "Ranges from 0-3\n"+"-----------------------------------------------------------"+" Disaster Warning System: \n"  + "Rain Amount Range 0-1\n" + "0=Light rain or no rain\n" 
				+ "1 = Heavy Rain [Flooding Or Landslide Risk.]\n"  );
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = Temperature.getText();
				String humid = Humidity.getText();
				String co2 = CO2.getText();
				String water = Water.getText();
				String location = Location.getText();
				String weather = Weather.getText();
				
//For Temperature:
				
				if(temp.equals("0")){
					Information.setText("It is Cold! \n wear a Jacket.");
					Urgent.setText("Flora In Danger:\n Birch \n Cactus \nCaladiums\nPentas\nHibiscus");
				}else if(temp.equals("1")) {
					Information.setText("No Urgent things in Need:");
					Urgent.setText("");
				}else if(temp.equals("2")) {
					Information.setText("It is a hot day.");
					Urgent.setText("Flora in Danger: \n Pinus Wallichiana \n Spruce \n Willow \nRhododendrons\nJuniper");
				}else {
					Urgent.setText("Invalid Input");
				}
				
				//For Humidity:
				
				if(humid.equals("0")) {
					Humiditytab.setText("Low Humidity: ");
				}else if(humid.equals("1")) {
					Humiditytab.setText("High Humidity: ");
				}else {
					Humiditytab.setText("Invalid Input");
				}
				
				//For Water Pollution: 
				
				if(Integer.parseInt(water)>=0 && Integer.parseInt(water)<7) {
					WPollution.setText("Water Quality Bad: ");
					Information.setText("Warning: Acid Rain Probability\n");
					
				}else if(Integer.parseInt(water)==7){
					WPollution.setText("Water Quality Good.");
				}else {
					WPollution.setText("Invalid Input");
				}
				
				//Disaster Warning System
				
				if(weather.equals("1")) {
					if(location.equals("0")) {
						Disaster.setText("Potential Flood Warning!\n");
					}
				}
				if(weather.equals("1")) {
					if(location.equals("1")) {
						Disaster.setText("Potential Landslide");
					}
				}
				
				if(co2.equals("3")) {
					APollution.setText("Forest Fire Warning: High Amounts of C02 in the Air: [Potential Forest Fire] ");
				}else if(co2.equals("2")) {
					APollution.setText("High Pollution apply proper safety Measures");
				}else{
					APollution.setText("Air Quality Good: ");
				}
				
			}
		});
		btnDone.setBounds(53, 201, 105, 27);
		contentPane.add(btnDone);
		
		JButton btnClear_1 = new JButton("Clear");
		btnClear_1.setBounds(187, 201, 105, 27);
		contentPane.add(btnClear_1);
	}
}

