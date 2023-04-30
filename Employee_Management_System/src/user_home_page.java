import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class user_home_page extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user_home_page frame = new user_home_page();
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
	public user_home_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 314);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(129, 10, 506, 343);
		panel.setBackground(new Color(0, 255, 153));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name:-");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel.setBounds(25, 23, 80, 21);
		panel.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email:-");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEmail.setBounds(25, 54, 80, 21);
		panel.add(lblEmail);
		
		JLabel lblDob = new JLabel("D.O.B:-");
		lblDob.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDob.setBounds(25, 85, 80, 21);
		panel.add(lblDob);
		
		JLabel lblEducation = new JLabel("Education:-");
		lblEducation.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEducation.setBounds(25, 116, 80, 21);
		panel.add(lblEducation);
		
		JLabel lblPost = new JLabel("Post:-");
		lblPost.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblPost.setBounds(25, 147, 80, 21);
		panel.add(lblPost);
		
		JLabel lblContactNo = new JLabel("Contact No:-");
		lblContactNo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblContactNo.setBounds(25, 178, 80, 21);
		panel.add(lblContactNo);
		
		JLabel lblLastName = new JLabel("Last Name:-");
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblLastName.setBounds(208, 23, 80, 21);
		panel.add(lblLastName);
		
		textField = new JTextField();
		textField.setBounds(102, 24, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(102, 55, 96, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(102, 86, 96, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(102, 118, 96, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(102, 148, 96, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(102, 178, 96, 19);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(287, 24, 96, 19);
		panel.add(textField_6);
		
		JLabel lblProfileImage = new JLabel("Profile Image:-");
		lblProfileImage.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblProfileImage.setBounds(208, 58, 80, 21);
		panel.add(lblProfileImage);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(287, 55, 96, 82);
		panel.add(textField_7);
		
		JButton btnNewButton_1 = new JButton("Update Info");
		btnNewButton_1.setBounds(208, 234, 85, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(10, 31, 109, 28);
		contentPane.add(btnNewButton);
		
		JButton btnApplyLeave = new JButton("Apply Leave");
		btnApplyLeave.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnApplyLeave.setBounds(10, 79, 109, 28);
		contentPane.add(btnApplyLeave);
		
		JButton btnNotification = new JButton("Notification");
		btnNotification.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNotification.setBounds(10, 127, 109, 28);
		contentPane.add(btnNotification);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnLogout.setBounds(24, 245, 71, 23);
		contentPane.add(btnLogout);
	}

}
