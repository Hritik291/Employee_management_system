package com.employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.print.attribute.standard.MediaSize.Other;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Adminregisterform {

	JFrame frame;
	private JTextField firstname;
	private JTextField lastname;
	private JPasswordField conpass;
	private JPasswordField password;
	private JTextField buisness;
	private JTextField email;
	private JTextField mob;
	private JLabel lblNewLabel_2;
	private JTextField username;
	private JCheckBox male;
	private JCheckBox female;
	private JCheckBox others;
	private static String FirstName;
	//initialize variable
	String Gender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminregisterform window = new Adminregisterform();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Adminregisterform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		database connection
		Connection con=emp_Dao.Datac();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
//		application name
		frame.setTitle("Admin Registration");
		frame.setResizable(false);
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBackground(new Color(128, 255, 128));
		frame.setBounds(50, 70, 900, 500);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Register Portal");
		lblNewLabel.setForeground(new Color(152, 251, 152));
		lblNewLabel.setFont(new Font("Kalinga", Font.BOLD, 16));
		lblNewLabel.setBounds(89, 26, 207, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FirstName");
		lblNewLabel_1.setBounds(76, 77, 96, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gender");
		lblNewLabel_1_1.setBounds(76, 180, 49, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("LastName");
		lblNewLabel_1_2.setBounds(76, 132, 174, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Password");
		lblNewLabel_1_3.setBounds(76, 272, 71, 23);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Confirm Password");
		lblNewLabel_1_4.setBounds(76, 319, 207, 14);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_6 = new JLabel("Buisness Type");
		lblNewLabel_1_6.setBounds(447, 73, 89, 23);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Email:-");
		lblNewLabel_1_7.setBounds(447, 132, 78, 14);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Mobile No:-");
		lblNewLabel_1_8.setBounds(447, 180, 184, 14);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		firstname = new JTextField();
		firstname.setBounds(145, 74, 138, 20);
		frame.getContentPane().add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setBounds(145, 129, 138, 20);
		frame.getContentPane().add(lastname);
		lastname.setColumns(10);
		
		 male = new JCheckBox("Male");
		male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(male.isSelected())
				{
//					JOptionPane.showMessageDialog(male.getText(), "Male");
					female.setSelected(false);
					others.setSelected(false);
				}
			}
		});
		male.setBounds(145, 176, 65, 23);
		frame.getContentPane().add(male);
		
		female = new JCheckBox("Female");
		female.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(female.isSelected())
				{
//					JOptionPane.showMessageDialog(female, "Female");
					male.setSelected(false);
					others.setSelected(false);
				}
			}
		});
		female.setBounds(212, 176, 71, 23);
		frame.getContentPane().add(female);
		
		 others = new JCheckBox("Others");
		 others.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(others.isSelected())
				{
//					JOptionPane.showMessageDialog(others, "Others");
					female.setSelected(false);
					male.setSelected(false);
				}
		 	}
		 });
		others.setBounds(286, 176, 71, 23);
		frame.getContentPane().add(others);
		
		conpass = new JPasswordField();
		conpass.setBounds(186, 313, 128, 20);
		frame.getContentPane().add(conpass);
		
		password = new JPasswordField();
		password.setBounds(157, 275, 138, 20);
		frame.getContentPane().add(password);
		
		buisness = new JTextField();
		buisness.setBounds(546, 74, 146, 20);
		frame.getContentPane().add(buisness);
		buisness.setColumns(10);
		
		email = new JTextField();
		email.setBounds(546, 129, 146, 20);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		mob = new JTextField();
		mob.setBounds(546, 177, 140, 20);
		frame.getContentPane().add(mob);
		mob.setColumns(10);
		
		JButton regbtn = new JButton("Register");
		regbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(regbtn, "Register Successful");
//				db part && get and set data
				String FirstName=firstname.getText();
				String LastName=lastname.getText();
				 Gender= "";
				 if(male.isSelected())
					 {
					Gender= male.getText();
					 }
				 else if(female.isSelected())
				 {
				 Gender=female.getText();
				 }
				 else
				 {
				 Gender=others.getText();
				 }
				 String UserName=username.getText();
				String Password=password.getText();
				String Conpass=conpass.getText();
				String Buisness=buisness.getText();
				String Email=email.getText();
				String Mob=mob.getText();
				if(FirstName.equals("")|| LastName.equals("")|| Gender.equals("")|| UserName.equals("")|| Password.equals("")|| Conpass.equals("")|| Buisness.equals("")|| Email.equals("")|| Mob.equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill in all fields.");
				}
				else if(Password.equals(Conpass))
				{
							JOptionPane.showMessageDialog(null,"");
				}
						else {
							JOptionPane.showMessageDialog(null, "Password did not matched.Please try again!");
						}
				
				int len=Mob.length();
				if(len!=10)
				{
					JOptionPane.showMessageDialog(mob, "Enter a Valid Number");
				}
				
				
//				insert adminregistration into database
				
				try {
					String sql="insert into signup(FirstName,LastName,Gender,Username,Conpassword,Buisness,Email,Mobile_No) values(?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1, FirstName);
					ps.setString(2, LastName);
					ps.setString(3, Gender);
					ps.setString(4, UserName);
					ps.setString(5, Conpass);
					ps.setString(6,Buisness );
					ps.setString(7,Email );
					ps.setString(8,Mob );
					
					
					//execute
					 ps.executeUpdate();
					 JOptionPane.showMessageDialog(null, "Registered");
					firstname.setText("");
					lastname.setText("");
//					male.setText("");
//					female.setText("");
//					others.setText("");
					username.setText("");
					password.setText("");
					conpass.setText("");
					buisness.setText("");
					email.setText("");
					mob.setText("");
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				finally {
					try {
						con.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
			
		});
		regbtn.setForeground(new Color(128, 255, 128));
		regbtn.setBackground(new Color(240, 240, 240));
		regbtn.setBounds(385, 406, 89, 23);
		frame.getContentPane().add(regbtn);
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setIcon(new ImageIcon("D:/Softwear/EMS/src/pic2.png"));
		lblNewLabel_2.setBounds(45, 11, 40, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Username");
		lblNewLabel_3.setBounds(76, 223, 71, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		username = new JTextField();
		username.setBounds(156, 220, 140, 20);
		frame.getContentPane().add(username);
		username.setColumns(10);
	}
}
