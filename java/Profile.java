package Pro.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Profile extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 712);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 64));
		panel_1.setBounds(248, 0, 735, 959);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel emp_profile_setting = new JLabel("Profile Settings");
		emp_profile_setting.setFont(new Font("Tahoma", Font.PLAIN, 22));
		emp_profile_setting.setForeground(new Color(255, 255, 255));
		emp_profile_setting.setBounds(10, 10, 162, 41);
		panel_1.add(emp_profile_setting);
		
		JLabel Profile_details = new JLabel("Profile Details");
		Profile_details.setForeground(new Color(255, 255, 255));
		Profile_details.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Profile_details.setBounds(35, 83, 152, 49);
		panel_1.add(Profile_details);
		
		JLabel emp_name = new JLabel("Name :");
		emp_name.setForeground(new Color(255, 255, 255));
		emp_name.setBackground(new Color(255, 255, 255));
		emp_name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_name.setBounds(77, 153, 110, 30);
		panel_1.add(emp_name);
		
		JLabel emp_username = new JLabel("Username :");
		emp_username.setForeground(new Color(255, 255, 255));
		emp_username.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_username.setBounds(77, 206, 95, 30);
		panel_1.add(emp_username);
		
		JLabel emp_DOB = new JLabel("Date of Birth :");
		emp_DOB.setForeground(new Color(255, 255, 255));
		emp_DOB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_DOB.setBounds(77, 260, 125, 30);
		panel_1.add(emp_DOB);
		
		JLabel emp_address = new JLabel("Address :");
		emp_address.setForeground(new Color(255, 255, 255));
		emp_address.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_address.setBounds(77, 361, 110, 30);
		panel_1.add(emp_address);
		
		JLabel lblNewLabel_8 = new JLabel("Contact info ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(35, 420, 141, 30);
		panel_1.add(lblNewLabel_8);
		
		JLabel emp_phone = new JLabel("Phone :");
		emp_phone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_phone.setForeground(new Color(255, 255, 255));
		emp_phone.setBounds(77, 471, 81, 31);
		panel_1.add(emp_phone);
		
		JLabel emp_email = new JLabel("Email :");
		emp_email.setForeground(new Color(255, 255, 255));
		emp_email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_email.setBounds(77, 523, 110, 20);
		panel_1.add(emp_email);
		
		JLabel emp_dsignation = new JLabel("Dsignation :");
		emp_dsignation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_dsignation.setForeground(new Color(255, 255, 255));
		emp_dsignation.setBounds(77, 310, 125, 41);
		panel_1.add(emp_dsignation);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setBounds(236, 153, 203, 33);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(225, 207, 203, 33);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setBounds(225, 261, 203, 33);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setBounds(225, 316, 203, 33);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setBounds(221, 372, 203, 33);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setBounds(225, 472, 203, 33);
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setBounds(221, 519, 203, 33);
		panel_1.add(lblNewLabel_18);
		
		JButton emp_back = new JButton("Back");
		emp_back.setBackground(new Color(255, 0, 0));
		emp_back.setForeground(new Color(255, 255, 255));
		emp_back.setFont(new Font("Sylfaen", Font.BOLD, 18));
		emp_back.setBounds(418, 615, 110, 30);
		panel_1.add(emp_back);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 238, 969);
		panel.setBackground(new Color(2, 4, 28));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel emp_img_name = new JLabel("Name");
		emp_img_name.setBounds(101, 187, 58, 31);
		emp_img_name.setForeground(new Color(255, 255, 255));
		emp_img_name.setBackground(new Color(255, 255, 255));
		emp_img_name.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		panel.add(emp_img_name);
		
		JButton emp_project = new JButton("My projects");
		emp_project.setIcon(new ImageIcon("C:\\Users\\samal\\Downloads\\icons8-project-50.png"));
		emp_project.setBounds(0, 302, 238, 79);
		emp_project.setFont(new Font("Tahoma", Font.PLAIN, 17));
		emp_project.setForeground(new Color(0, 0, 0));
		emp_project.setBackground(new Color(153, 255, 102));
		panel.add(emp_project);
		
		JButton emp_password = new JButton("Password");
		emp_password.setIcon(new ImageIcon("C:\\Users\\samal\\Downloads\\icons8-password-50.png"));
		emp_password.setBounds(0, 456, 238, 79);
		emp_password.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		emp_password.setBackground(new Color(153, 255, 102));
		emp_password.setForeground(new Color(0, 0, 0));
		emp_password.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(emp_password);
		
		JButton Emp_logout = new JButton("Log out");
		Emp_logout.setBounds(59, 606, 108, 21);
		Emp_logout.setBackground(new Color(255, 0, 0));
		Emp_logout.setForeground(new Color(0, 0, 0));
		Emp_logout.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(Emp_logout);
		
		JLabel emp_img = new JLabel("");
		emp_img.setBounds(10, 0, 218, 178);
		panel.add(emp_img);
		emp_img.setIcon(new ImageIcon("D:\\fgg\\download.png"));
		emp_img.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton Emp_profile = new JButton("Profile");
		Emp_profile.setIcon(new ImageIcon("C:\\Users\\samal\\eclipse-workspace\\Employee_Management_System\\icons8-male-user-50.png"));
		Emp_profile.setBounds(0, 231, 238, 79);
		Emp_profile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Salary_calculator rr=new Salary_calculator();
//				rr.frame.setVisible(true);
			}
		});
		Emp_profile.setForeground(new Color(0, 0, 0));
		Emp_profile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Emp_profile.setBackground(new Color(153, 255, 102));
		panel.add(Emp_profile);
		
		JButton btnNewButton = new JButton("Apply Leave");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBackground(new Color(153, 255, 102));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\samal\\Downloads\\icons8-leave-50.png"));
		btnNewButton.setBounds(0, 380, 238, 79);
		panel.add(btnNewButton);
	}
}
