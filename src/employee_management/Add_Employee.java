package employee_management;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.util.*;


public class Add_Employee extends JFrame implements ActionListener {
	
	Random ran=new Random();
	int number=ran.nextInt(9999999);
	JButton add,Back;
	JTextField tfname,tfaddress,tfphone,tfdhar,tfsalary,tffname,tfemail,tfdesignation,tfdob,tfusername,tfpass;
	JComboBox comboBox1,comboBox,comboBox2;
	JLabel lblid;
	
	Add_Employee(){
		getContentPane().setBackground(Color.pink);
		setLayout(null);
		getContentPane().setForeground(Color.white);
		
		JLabel heading=new JLabel("ADD EMPLOYEE DETAILS");
		heading.setBounds(350,30,500,70);
		heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
		add(heading);
		
		JLabel labelname=new JLabel("NAME");
		labelname.setBounds(50,150,150,30);
		labelname.setFont(new Font("SERIF",Font.PLAIN,20));
		add(labelname);
		
		 tfname= new JTextField();
		tfname.setBounds(200,150,150,30);
		add(tfname); 
		
		JLabel labelfname=new JLabel("FATHER'S NAME");
		labelfname.setBounds(400,150,180,30);
		labelfname.setFont(new Font("serif",Font.PLAIN,20));
		add(labelfname);
		
		 tffname= new JTextField();
		tffname.setBounds(600,150,150,30);
		add(tffname); 
		
		
		  JLabel labeldob=new JLabel("DATE OF BIRTH");
		  labeldob.setBounds(50,200,200,30); labeldob.setFont(new
		  Font("serif",Font.PLAIN,20));
		  
		  add(labeldob);
		  
		  tfdob=new JTextField();
		 tfdob.setBounds(200,200,150,30);
		 tfdob.setFont(new Font("serif",Font.PLAIN,20));
			add(tfdob);
		 
		 
		 		
		JLabel labelsalary=new JLabel("SALARY");
		labelsalary.setBounds(400,200,150,30);
		labelsalary.setFont(new Font("serif",Font.PLAIN,20));
		add(labelsalary);
		
	tfsalary= new JTextField();
		tfsalary.setBounds(600,200,150,30);
		add(tfsalary); 
		
		JLabel labeladdress=new JLabel("ADDRESS");
		labeladdress.setBounds(50,250,150,30);
		labeladdress.setFont(new Font("serif",Font.PLAIN,20));
		add(labeladdress);
		
		 tfaddress= new JTextField();
		tfaddress.setBounds(200,250,150,30);
		add(tfaddress); 
		
		JLabel labelphone=new JLabel("PHONE");
		labelphone.setBounds(400,250,150,30);
		labelphone.setFont(new Font("serif",Font.PLAIN,20));
		add(labelphone);
		
		 tfphone= new JTextField();
		tfphone.setBounds(600,250,150,30);
	add(tfphone); 
	
	JLabel labelemail=new JLabel("EMAIL");
	labelemail.setBounds(50,300,150,30);
	labelemail.setFont(new Font("serif",Font.PLAIN,20));
	add(labelemail);
	
 tfemail= new JTextField();
	tfemail.setBounds(200,300,150,30);
add(tfemail); 

JLabel labeleducation=new JLabel("Highest Education");
labeleducation.setBounds(400,300,200,30);
labeleducation.setFont(new Font("serif",Font.PLAIN,20));
add(labeleducation);

 comboBox1 = new JComboBox();
comboBox1.setFont(new Font("serif",Font.PLAIN,20));
comboBox1.setModel(new DefaultComboBoxModel(new String[] {"MCA", "BCA","MBA","MSC","BTECH","MTECH","B-Pharma","M-Pharma","Bsc"}));
comboBox1.setBounds(600, 300, 150, 30);
add(comboBox1);

JLabel labeldesignation=new JLabel("DESIGNATION");
labeldesignation.setBounds(50,350,150,30);
labeldesignation.setFont(new Font("serif",Font.PLAIN,20));
add(labeldesignation);

 tfdesignation= new JTextField();
tfdesignation.setBounds(200,350,150,30);
add( tfdesignation); 

JLabel labeladhar=new JLabel("ADHAR NO.");
labeladhar.setBounds(400,350,200,30);
labeladhar.setFont(new Font("serif",Font.PLAIN,20));
add(labeladhar);

 tfdhar= new JTextField();
tfdhar.setBounds(600,350,150,30);
add( tfdhar); 

comboBox2 = new JComboBox();
comboBox2.setFont(new Font("serif",Font.PLAIN,20));
comboBox2.setModel(new DefaultComboBoxModel(new String[] {"O+", "O-","A+","A-","AB+","AB-","B+","B-"}));
comboBox2.setBounds(600, 400, 150, 30);
add(comboBox2);

JLabel lblblood = new JLabel("BLOOD GROUP");
lblblood.setFont(new Font("serif",Font.PLAIN,20));
lblblood.setBounds(400, 400, 150, 30);
add( lblblood);


 comboBox = new JComboBox();
comboBox.setFont(new Font("serif",Font.PLAIN,20));
comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female","other"}));
comboBox.setBounds(200, 400, 150, 30);
add(comboBox);

JLabel lblGender = new JLabel("Gender");
lblGender.setFont(new Font("serif",Font.PLAIN,20));
lblGender.setBounds(50, 400, 150, 30);
add(lblGender);


JLabel labeid=new JLabel("Empid.");
labeid.setBounds(50,450,150,30);
labeid.setFont(new Font("serif",Font.PLAIN,20));
add(labeid);


 lblid=new JLabel("" + number);
lblid.setBounds(200,450,150,30);
lblid.setFont(new Font("serif",Font.PLAIN,20));
add(lblid);

JLabel lblusername = new JLabel("username");
lblusername.setFont(new Font("serif",Font.PLAIN,20));
lblusername.setBounds(50, 500, 150, 30);
add(lblusername);


 tfusername=new JTextField();
 tfusername.setBounds(200,500,150,30);
 tfusername.setFont(new Font("serif",Font.PLAIN,20));
add(tfusername);

JLabel lblpass = new JLabel("password");
lblpass.setFont(new Font("serif",Font.PLAIN,20));
lblpass.setBounds(50, 550, 150, 30);
add(lblpass);

tfpass=new JTextField();
tfpass.setBounds(200,550,150,30);
tfpass.setFont(new Font("serif",Font.PLAIN,20));
add(tfpass);



		
	add=new JButton("Add Details");
	add.setBounds(300,600,150,40);
	add.addActionListener(this);
	add.setBackground(Color.BLACK);
	add.setForeground(Color.WHITE);
	add(add);
	
	Back=new JButton("Back");
	Back.setBounds(500,600,150,40);
	Back.addActionListener(this);
	Back.setBackground(Color.BLACK);
	Back.setForeground(Color.WHITE);
	add(Back);

		
		
		
		
		
		
		
		
		setSize(1000,800); 
		setLocation(300,50);
		setVisible(true);
		
		}
	public void actionPerformed(ActionEvent a) {
		
		if(a.getSource()==add) {
			String name=tfname.getText();
			String fname=tffname.getText();
			String dob=tfdob.getText();
			String salary=tfsalary.getText();
			String address=tfaddress.getText();
			String phone=tfphone.getText();
			String email=tfemail.getText();
			String education=(String)comboBox1.getSelectedItem();
			String designation=tfdesignation.getText();
			String aadhar=tfdhar.getText();
			String bloodgroup=(String)comboBox2.getSelectedItem();
			String gender=(String)comboBox.getSelectedItem();
			String empid=lblid.getText();
			String username=tfusername.getText();
			String pasword=tfpass.getText();
			
			
			try {
				DB conn=new DB();
				String query="insert into employee1 values('"+name+"', '"+fname+"','"+dob+"', '"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+aadhar+"','"+bloodgroup+"','"+gender+"','"+empid+"','"+username+"','\"+pasword+\"')";
			conn.s.executeUpdate(query);
			JOptionPane.showMessageDialog(null,"Details added successfully");
			setVisible(false);
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			setVisible(false);
			Admin_HomePage ad=new Admin_HomePage();
			ad.frame.setVisible(true);
			
		}
		
	}
	
	
	
	
	
	public static void main(String[]args) {
		new Add_Employee();
		
		
	}

}
