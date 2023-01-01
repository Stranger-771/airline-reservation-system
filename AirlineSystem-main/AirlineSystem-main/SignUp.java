package airlineSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class SignUp {

	JFrame frmUnitedAirlines;
	private JTextField fName;
	private JTextField lName;
	private JTextField conDel;
	private JTextField mail;
	private JPasswordField createPass;
	private JPasswordField confirmPass;

	/**
	 * Launch the application.
	 */
	public void dhanu1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp windows = new SignUp();
					windows.frmUnitedAirlines.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnitedAirlines = new JFrame();
		frmUnitedAirlines.setTitle("United Airlines");
		frmUnitedAirlines.setBackground(Color.GRAY);
		frmUnitedAirlines.setBounds(100, 100, 450, 300);
		frmUnitedAirlines.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnitedAirlines.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FirstName");
		lblNewLabel.setBounds(82, 27, 112, 16);
		frmUnitedAirlines.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LastName");
		lblNewLabel_1.setBounds(82, 55, 112, 16);
		frmUnitedAirlines.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ContactNo");
		lblNewLabel_2.setBounds(82, 83, 112, 16);
		frmUnitedAirlines.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("EMail");
		lblNewLabel_3.setBounds(82, 111, 112, 16);
		frmUnitedAirlines.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CreatePassword");
		lblNewLabel_4.setBounds(80, 134, 114, 16);
		frmUnitedAirlines.getContentPane().add(lblNewLabel_4);
		
		fName = new JTextField();
		fName.setBounds(242, 17, 130, 26);
		frmUnitedAirlines.getContentPane().add(fName);
		fName.setColumns(10);
		
		lName = new JTextField();
		lName.setBounds(242, 45, 130, 26);
		frmUnitedAirlines.getContentPane().add(lName);
		lName.setColumns(10);
		
		conDel = new JTextField();
		conDel.setBounds(242, 73, 130, 26);
		frmUnitedAirlines.getContentPane().add(conDel);
		conDel.setColumns(10);
		
		mail = new JTextField();
		mail.setBounds(242, 101, 130, 26);
		frmUnitedAirlines.getContentPane().add(mail);
		mail.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("ConfirmPassword");
		lblNewLabel_5.setBounds(82, 162, 112, 16);
		frmUnitedAirlines.getContentPane().add(lblNewLabel_5);
		
		createPass = new JPasswordField();
		createPass.setBounds(242, 124, 130, 26);
		frmUnitedAirlines.getContentPane().add(createPass);
		
		confirmPass = new JPasswordField();
		confirmPass.setBounds(242, 152, 130, 26);
		frmUnitedAirlines.getContentPane().add(confirmPass);
		
		JButton btnNewButton = new JButton("SignUp");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname = fName.getText();
				String uname1 = lName.getText();
				String contact = conDel.getText();
				String email = mail.getText();
				String pass = createPass.getText();
				String pass1 = confirmPass.getText();
				if(pass1 == null)
					JOptionPane.showMessageDialog(btnNewButton, "Invalid Details.");
				if(!pass.equals(pass1))
					JOptionPane.showMessageDialog(btnNewButton, "Invalid Password.");
				else
					JOptionPane.showMessageDialog(btnNewButton, "Sucessfully SignedUp.");
			}
		});
		btnNewButton.setBounds(161, 195, 117, 29);
		frmUnitedAirlines.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Already registered ? Please Login");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				LoginNew window = new LoginNew();
				window.frmUnitedAirlines.setVisible(true);
			}
		});
		lblNewLabel_6.setBounds(116, 236, 270, 16);
		frmUnitedAirlines.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Welcome To The Airlines!");
		lblNewLabel_7.setBounds(143, 0, 217, 16);
		frmUnitedAirlines.getContentPane().add(lblNewLabel_7);
		
		JButton btnNewButton_1 = new JButton("FB");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("http://wwww.facebook.com"));
				}
				catch(URISyntaxException err) {
					
				}
				catch(IOException err) {
					
				}
			}
		});
		btnNewButton_1.setBounds(279, 195, 81, 29);
		frmUnitedAirlines.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Gmail");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("https://drive.google.com/drive/my-drive"));
				}
				catch(URISyntaxException err) {
					
				}
				catch(IOException err) {
					
				}
			}
		});
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setBounds(358, 195, 86, 29);
		frmUnitedAirlines.getContentPane().add(btnNewButton_2);
	}
}
