package main;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JCheckBox;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField uname;
	private JTextField pass;
	private JTextField Theme;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 137, 224));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setBounds(587, 120, 95, 17);
		contentPane.add(lblUsername);
		
		uname = new JTextField();
		uname.setBounds(664, 118, 114, 21);
		contentPane.add(uname);
		uname.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setBounds(587, 160, 70, 17);
		contentPane.add(lblPassword);
		
		pass = new JTextField();
		pass.setBounds(664, 158, 114, 21);
		contentPane.add(pass);
		pass.setColumns(10);
		
		JButton btn1 = new JButton("Login");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = uname.getText();
				String password = pass.getText();
				String theme = Theme.getText();
				if(username.equals("Admin")&&password.equals("password")) {
					JOptionPane.showMessageDialog(btn1, "You are logged in as Admin");
					
					if(theme.equals("Dark")) {
						MainUI second = new MainUI();
						second.setVisible(true);
					}
					else if(theme.equals("Light")) {
						MainUILight second = new MainUILight();
						second.setVisible(true);
					}
					
				}
				else {
					JOptionPane.showConfirmDialog(btn1, "Incorrect Password: ");
				}
			}
		});
		btn1.setBounds(664, 248, 105, 27);
		contentPane.add(btn1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 46, 156));
		panel.setBounds(0, 487, 984, 61);
		contentPane.add(panel);
		
		JLabel lblTheme = new JLabel("Theme:");
		lblTheme.setForeground(new Color(255, 255, 255));
		lblTheme.setBounds(587, 199, 60, 17);
		contentPane.add(lblTheme);
		
		Theme = new JTextField();
		Theme.setBounds(664, 197, 114, 21);
		contentPane.add(Theme);
		Theme.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource(""));
		lblNewLabel.setIcon(new ImageIcon("/home/bakasoggy/Pictures/forest.png"));
		lblNewLabel.setBounds(12, 12, 954, 524);
		contentPane.add(lblNewLabel);
		
		
		
	
	}
}
