package com.employee;


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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Profile extends JFrame {

	JFrame frame;
	private JPanel contentPane;
	String us;
	String pw;
	private JTextField name;
	private JTextField username;
	private JTextField dob;
	private JTextField desig;
	private JTextField addre;
	private JTextField ph;
	private JTextField gender;
	private JTextField fathern;
	private JTextField passco;
	private JTextField sal;
	private JTextField edu;
	private JTextField addhar;
	private JTextField bg;
	private JTextField em;
	private JLabel ei;

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
		setBounds(100, 100, 909, 712);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 238, 673);
		panel.setBackground(new Color(2, 4, 28));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel emp_img_name = new JLabel("Name");
		emp_img_name.setBounds(101, 187, 58, 31);
		emp_img_name.setForeground(new Color(255, 255, 255));
		emp_img_name.setBackground(new Color(255, 255, 255));
		emp_img_name.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		panel.add(emp_img_name);
		
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
		Emp_profile.setBounds(0, 287, 238, 79);
		Emp_profile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomPage li=new WelcomPage();
//				Employee Profile
				try {
					Connection co=DB.Datac();
					
					String us=li.user;
//					System.out.println(us);
					String pw=li.pwd;
//					System.out.println(pw);
					String sql="select * from employee1 where username=? AND pasword=?";
					PreparedStatement ps=co.prepareStatement(sql);
					ps.setString(1, us);
					ps.setString(2, pw);
//					String aadhar = null;
//					ps.setString(3, aadhar);
					try {
					ResultSet rs=ps.executeQuery();
					if(rs.next()){
//						System.out.println("its working");
					    name.setText(rs.getString(1));
					    fathern.setText(rs.getString(2));
					    dob.setText(rs.getString(3));
					    sal.setText(rs.getString(4));
					    addre.setText(rs.getString(5));
					    ph.setText(rs.getString(6));
					    em.setText(rs.getString(7));
					    edu.setText(rs.getString(8));
					    desig.setText(rs.getString(9));
					    addhar.setText(rs.getString(10));
					    bg.setText(rs.getString(11));
					    gender.setText(rs.getString(12));
					    ei.setText(rs.getString("empid"));
					    username.setText(us);
					    passco.setText(pw);
					    }
					else {
						System.out.println("Not working");
					}
					}catch (Exception e1) {
						// TODO: handle exception
						System.out.println(e1);
					}
					
//					
//					String Name=name.getText();
////					String Uname=username.getText();
//					String Dob=dob.getText();
//					String Desg=desig.getText();
//					String Addr=addre.getText();
//					String Gen=gender.getText();
//					String Father=fathern.getText();
//					String Pass=passco.getText();
//					String Salr=sal.getText();
//					String Edu=edu.getText();
//					String Aadh=addhar.getText();
//					String Bgr=name.getText();
//					String Pho=name.getText();
//					String ema=name.getText();
//					String Emi=name.getText();
////					
//				
				
					
					
				}catch(Exception e3)
				{
					System.out.println(e3);
				}
				
				
//				Salary_calculator rr=new Salary_calculator();
//				rr.frame.setVisible(true);
			}
		});
		Emp_profile.setForeground(new Color(0, 0, 0));
		Emp_profile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Emp_profile.setBackground(new Color(153, 255, 102));
		panel.add(Emp_profile);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 64));
		panel_1.setBounds(248, 0, 735, 673);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel ei = new JLabel("");
		ei.setFont(new Font("Tahoma", Font.BOLD, 16));
		ei.setForeground(new Color(128, 0, 0));
		ei.setBounds(509, 24, 115, 29);
		panel_1.add(ei);
		
		gender = new JTextField();
		gender.setColumns(10);
		gender.setBounds(150, 319, 115, 20);
		panel_1.add(gender);
		
		em = new JTextField();
		em.setColumns(10);
		em.setBounds(150, 525, 115, 20);
		panel_1.add(em);
		
		ph = new JTextField();
		ph.setColumns(10);
		ph.setBounds(150, 478, 115, 20);
		panel_1.add(ph);
		
		bg = new JTextField();
		bg.setColumns(10);
		bg.setBounds(476, 309, 125, 20);
		panel_1.add(bg);
		
		addhar = new JTextField();
		addhar.setColumns(10);
		addhar.setBounds(476, 268, 125, 20);
		panel_1.add(addhar);
		
		edu = new JTextField();
		edu.setColumns(10);
		edu.setBounds(476, 227, 125, 20);
		panel_1.add(edu);
		
		sal = new JTextField();
		sal.setColumns(10);
		sal.setBounds(476, 177, 125, 20);
		panel_1.add(sal);
		
		passco = new JTextField();
		passco.setColumns(10);
		passco.setBounds(476, 120, 125, 20);
		panel_1.add(passco);
		
		fathern = new JTextField();
		fathern.setColumns(10);
		fathern.setBounds(476, 71, 125, 20);
		panel_1.add(fathern);
		
		addre = new JTextField();
		addre.setColumns(10);
		addre.setBounds(150, 268, 115, 20);
		panel_1.add(addre);
		
		desig = new JTextField();
		desig.setColumns(10);
		desig.setBounds(150, 221, 115, 20);
		panel_1.add(desig);
		
		dob = new JTextField();
		dob.setColumns(10);
		dob.setBounds(150, 174, 115, 20);
		panel_1.add(dob);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(150, 120, 115, 20);
		panel_1.add(username);
		
		name = new JTextField();
		name.setBounds(150, 71, 115, 20);
		panel_1.add(name);
		name.setColumns(10);
		
		JLabel Profile_details = new JLabel("Profile Details");
		Profile_details.setForeground(new Color(255, 255, 255));
		Profile_details.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Profile_details.setBounds(10, 11, 152, 49);
		panel_1.add(Profile_details);
		
		JLabel emp_name = new JLabel("Name :");
		emp_name.setForeground(new Color(255, 255, 255));
		emp_name.setBackground(new Color(255, 255, 255));
		emp_name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_name.setBounds(35, 64, 110, 30);
		panel_1.add(emp_name);
		
		JLabel emp_username = new JLabel("Username :");
		emp_username.setForeground(new Color(255, 255, 255));
		emp_username.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_username.setBounds(35, 113, 95, 30);
		panel_1.add(emp_username);
		
		JLabel emp_DOB = new JLabel("Date of Birth :");
		emp_DOB.setForeground(new Color(255, 255, 255));
		emp_DOB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_DOB.setBounds(35, 167, 125, 30);
		panel_1.add(emp_DOB);
		
		JLabel emp_address = new JLabel("Address :");
		emp_address.setForeground(new Color(255, 255, 255));
		emp_address.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_address.setBounds(35, 261, 110, 30);
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
		emp_dsignation.setBounds(35, 209, 125, 41);
		panel_1.add(emp_dsignation);
		
		JButton emp_back = new JButton("Back");
		emp_back.setBackground(new Color(255, 0, 0));
		emp_back.setForeground(new Color(255, 255, 255));
		emp_back.setFont(new Font("Sylfaen", Font.BOLD, 18));
		emp_back.setBounds(418, 615, 110, 30);
		panel_1.add(emp_back);
		
		JLabel emp_name_1 = new JLabel("Father Name :");
		emp_name_1.setForeground(Color.WHITE);
		emp_name_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_name_1.setBackground(Color.WHITE);
		emp_name_1.setBounds(343, 64, 110, 30);
		panel_1.add(emp_name_1);
		
		JLabel emp_name_2 = new JLabel("Password:");
		emp_name_2.setForeground(Color.WHITE);
		emp_name_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_name_2.setBackground(Color.WHITE);
		emp_name_2.setBounds(343, 113, 110, 30);
		panel_1.add(emp_name_2);
		
		JLabel emp_name_3 = new JLabel("Salary:");
		emp_name_3.setForeground(Color.WHITE);
		emp_name_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_name_3.setBackground(Color.WHITE);
		emp_name_3.setBounds(343, 167, 110, 30);
		panel_1.add(emp_name_3);
		
		JLabel emp_name_4 = new JLabel("Education:");
		emp_name_4.setForeground(Color.WHITE);
		emp_name_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_name_4.setBackground(Color.WHITE);
		emp_name_4.setBounds(343, 220, 110, 30);
		panel_1.add(emp_name_4);
		
		JLabel emp_name_5 = new JLabel("Aadhar No:");
		emp_name_5.setForeground(Color.WHITE);
		emp_name_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_name_5.setBackground(Color.WHITE);
		emp_name_5.setBounds(343, 261, 110, 30);
		panel_1.add(emp_name_5);
		
		JLabel emp_name_6 = new JLabel("Emp Id:");
		emp_name_6.setForeground(Color.WHITE);
		emp_name_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_name_6.setBackground(Color.WHITE);
		emp_name_6.setBounds(438, 23, 75, 30);
		panel_1.add(emp_name_6);
		
		JLabel emp_name_7 = new JLabel("Gender:");
		emp_name_7.setForeground(Color.WHITE);
		emp_name_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_name_7.setBackground(Color.WHITE);
		emp_name_7.setBounds(35, 312, 110, 30);
		panel_1.add(emp_name_7);
		
		JLabel emp_name_8 = new JLabel("Blood Group:");
		emp_name_8.setForeground(Color.WHITE);
		emp_name_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emp_name_8.setBackground(Color.WHITE);
		emp_name_8.setBounds(343, 302, 110, 30);
		panel_1.add(emp_name_8);
	}
}
