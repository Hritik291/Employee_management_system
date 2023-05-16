package com.employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Font;
import java.awt.Window;
import java.awt.Color;

public class WelcomPage {

	private JFrame frame;
	private JTextField username;
	private JPasswordField password;
	public static String user;
	public static String pwd;

	// Code to set the values of user and pwd variables


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomPage window = new WelcomPage();
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
	public WelcomPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
//		database connection
		Connection con=emp_Dao.Datac();
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("EMS");
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 778, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Login Adminstration");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Admin Login
				
				try {
					String user=username.getText();
					String pwd=String.valueOf(password.getPassword());
					String sql="select * from signup where Username=? and Conpassword=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1, user);
					ps.setString(2, pwd);
					ResultSet res=ps.executeQuery();
					if(res.next())
					{
					Admin_HomePage cn=new Admin_HomePage();
					cn.frame.setVisible(true);
					username.setText("");
					password.setText("");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Please enter correct Username and Password.");
						username.setText("");
						password.setText("");
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		btnNewButton.setBounds(561, 248, 148, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton login = new JButton("Login Employee");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				Employee Login
				try {
					Connection co=DB.Datac();
					 user=username.getText();
					 pwd=String.valueOf(password.getPassword());
					String sw="select * from employee1 where username=? and pasword=?";
					PreparedStatement ps=co.prepareStatement(sw);
					
					ps.setString(1, user);
					ps.setString(2, pwd);
					ResultSet rs=ps.executeQuery();
						
						if(rs.next())
						{
							frame.setVisible(false);
							 Profile f=new Profile();
							 f.setVisible(true);
							 username.setText("");
							 password.setText("");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Please enter correct Username and Password.");
						username.setText("");
						password.setText("");
					}
					
					} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		login.setBounds(389, 248, 148, 38);
		frame.getContentPane().add(login);
		
		JLabel lblNewLabel_1 = new JLabel("Username:-");
		lblNewLabel_1.setBounds(53, 293, 74, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password:-");
		lblNewLabel_1_2.setBounds(53, 345, 74, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		username = new JTextField();
		username.setBounds(125, 290, 136, 20);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(125, 342, 130, 20);
		frame.getContentPane().add(password);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Management System");
		lblNewLabel_2.setBackground(new Color(255, 255, 0));
		lblNewLabel_2.setForeground(new Color(128, 255, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic Light", Font.ITALIC, 22));
		lblNewLabel_2.setBounds(36, 79, 358, 117);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 17));
		lblNewLabel_3.setBounds(118, 240, 74, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Welcome to ");
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblNewLabel_4.setForeground(new Color(0, 255, 255));
		lblNewLabel_4.setBounds(125, 51, 234, 79);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:/Softwear/EMS/pic3.jpg"));
		lblNewLabel.setBounds(10, 11, 742, 215);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Register here>>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminregisterform reg=new Adminregisterform();
				 reg.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(204, 102, 0));
		btnNewButton_1.setBounds(587, 312, 130, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel img6 = new JLabel("");
		img6.setIcon(new ImageIcon("D:/Softwear/EMS/img6.png"));
		img6.setBounds(88, 234, 30, 30);
		frame.getContentPane().add(img6);
	}
}
