package airlineSystem;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginNew {

	JFrame frmUnitedAirlines;
	private JTextField username;
	private JPasswordField password;
	public Object frame;
	public Object frame1;

	/**
	 * Launch the application.
	 */
	public void dhanu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginNew window = new LoginNew();
					window.frmUnitedAirlines.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginNew() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnitedAirlines = new JFrame();
		frmUnitedAirlines.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmUnitedAirlines.setTitle("United Airlines");
		frmUnitedAirlines.getContentPane().setForeground(Color.BLACK);
		frmUnitedAirlines.setBounds(100, 100, 450, 300);
		frmUnitedAirlines.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnitedAirlines.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(62, 71, 106, 33);
		frmUnitedAirlines.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PassWord");
		lblNewLabel_1.setBounds(62, 134, 106, 23);
		frmUnitedAirlines.getContentPane().add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBounds(234, 74, 130, 26);
		frmUnitedAirlines.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(234, 131, 130, 26);
		frmUnitedAirlines.getContentPane().add(password);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname = username.getText();
				String pass = password.getText();
				if((uname.equals("dhanu") && pass.equals("2001")) || (uname.equals("gaurav") && pass.equals("2002")) || (uname.equals("harshit") && pass.equals("2003")) || (uname.equals("ragini") && pass.equals("2004")) || (uname.equals("bhanu") && pass.equals("2005"))){
					JOptionPane.showMessageDialog(btnNewButton, "You are sucessfully logined.");
				} else {
					JOptionPane.showMessageDialog(btnNewButton, "Invalid username or password.");
				} 
			}
		});
		btnNewButton.setBounds(154, 212, 117, 29);
		frmUnitedAirlines.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome To The Airlines!");
		lblNewLabel_2.setBounds(126, 17, 243, 16);
		frmUnitedAirlines.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Not registered ? Please SignUp");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUp windows = new SignUp();
				windows.frmUnitedAirlines.setVisible(true);
			}
		});
		lblNewLabel_3.setBounds(126, 184, 217, 16);
		frmUnitedAirlines.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Forgotten Password?");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Check your email for recovery mail.");
			}
		});
		lblNewLabel_4.setBounds(302, 154, 130, 18);
		frmUnitedAirlines.getContentPane().add(lblNewLabel_4);
	}
}
