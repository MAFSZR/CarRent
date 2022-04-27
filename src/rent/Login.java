package rent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtusername;
	private JPasswordField txtpass;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignOnBaseline(true);
		panel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel Username = new JLabel("Username");
		Username.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 14));
		Username.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(Username);
		
		txtusername = new JTextField();
		txtusername.setFont(new Font("Bookman Old Style", Font.PLAIN, 10));
		panel.add(txtusername);
		txtusername.setColumns(10);
		
		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 14));
		panel.add(Password);
		
		JButton Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String user = txtusername.getText();
		        String pass = txtpass.getText();
		        if(user.equals("MAFS") && pass.equals("123"))            
		        {
		            Main m = new Main();
		            m.setVisible(true);          
		        }
		        else
		        {
		        	JOptionPane.showInputDialog(this,"Username and Password do not match");
		        } 

		    }
			
		});
		
		txtpass = new JPasswordField();
		txtpass.setFont(new Font("SansSerif", Font.PLAIN, 10));
		txtpass.setColumns(10);
		panel.add(txtpass);
		Login.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 12));
		panel.add(Login);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 12));
		panel.add(Cancel);
		
		JLabel lblNewLabel = new JLabel("LOSRent Login");
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 24));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
	}

}
