package employee_management;

import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Delete_Employee extends JFrame implements ActionListener {

	
	private JLabel lblname,lblfname,lbldesignation,lblbloodgroup,lbldob,lblphone,lblemail,lbleducation,lbladdress,search,lbldhar,lblsalary,lblblood,lblGender;
	Choice ceid;
	JButton Delete,Back;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Delete_Employee();
	}

	/**
	 * Create the frame.
	 */
	public Delete_Employee() {
		getContentPane().setBackground(Color.white);
		setLayout(null);
		getContentPane().setForeground(Color.black);
		
		
		
		
		
		search=new JLabel("search by id");
		search.setBounds(50,40,150,30);
		search.setBackground(Color.white);
		search.setFont(new Font("serif",Font.BOLD,20));
		add(search);
		
		ceid=new Choice();
		ceid.setBounds(200,50,200,300);
		ceid.setBackground(Color.white);
		add(ceid);
		try{
			DB conn=new DB();
			
					ResultSet rs=conn.s.executeQuery("select *from employee1 ");
					
					while(rs.next()) {
						
						ceid.add( rs.getString("empid"));
						
						
						
					}
					//table.setModel(DbUtils.resultSetToTableModel(rs));
		}
					catch(Exception e) {
						e.printStackTrace();
					}

		JLabel labelname=new JLabel("NAME");
		labelname.setBounds(50,150,150,30);
		labelname.setFont(new Font("SERIF",Font.PLAIN,20));
		add(labelname);
		
		 lblname= new JLabel();

		 lblname.setBounds(200,150,150,30);
		add(lblname); 
		
		JLabel labelfname=new JLabel("FATHER'S NAME");
		labelfname.setBounds(400,150,180,30);
		labelfname.setFont(new Font("serif",Font.PLAIN,20));
		add(labelfname);
		
		 lblfname= new JLabel();
		 lblfname.setBounds(600,150,150,30);
		add( lblfname); 
		
		
		  JLabel labeldob=new JLabel("DATE OF BIRTH");
		  labeldob.setBounds(50,200,200,30); labeldob.setFont(new
		  Font("serif",Font.PLAIN,20));
		  
		  add(labeldob);
		  
		  lbldob=new JLabel();
		  lbldob.setBounds(250,200,150,30);
		  lbldob.setFont(new Font("serif",Font.PLAIN,20));
			add(lbldob);
		 
		 
		 		
		JLabel labelsalary=new JLabel("SALARY");
		labelsalary.setBounds(400,200,150,30);
		labelsalary.setFont(new Font("serif",Font.PLAIN,20));
		add(labelsalary);
		
	lblsalary= new JLabel();
	lblsalary.setBounds(600,200,150,30);
		add(lblsalary); 
		
		JLabel labeladdress=new JLabel("ADDRESS");
		labeladdress.setBounds(50,250,150,30);
		labeladdress.setFont(new Font("serif",Font.PLAIN,20));
		add(labeladdress);
		
		 lbladdress= new JLabel();
		lbladdress.setBounds(200,250,150,30);
		add(lbladdress); 
		
		JLabel labelphone=new JLabel("PHONE");
		labelphone.setBounds(400,250,150,30);
		labelphone.setFont(new Font("serif",Font.PLAIN,20));
		add(labelphone);
		
		 lblphone= new JLabel();
		 lblphone.setBounds(600,250,150,30);
	add( lblphone); 
	
	JLabel labelemail=new JLabel("EMAIL");
	labelemail.setBounds(50,300,150,30);
	labelemail.setFont(new Font("serif",Font.PLAIN,20));
	add(labelemail);
	
 lblemail= new JLabel();
 lblemail.setBounds(200,300,250,30);
add(lblemail); 

JLabel labeleducation=new JLabel("Highest Education");
labeleducation.setBounds(400,300,200,30);
labeleducation.setFont(new Font("serif",Font.PLAIN,20));
add(labeleducation);


 lbleducation=new JLabel();

labeleducation.setFont(new Font("serif",Font.PLAIN,20));

lbleducation.setBounds(600, 300, 150, 30);
add(lbleducation);

JLabel labeldesignation=new JLabel("DESIGNATION");
labeldesignation.setBounds(50,350,150,30);
labeldesignation.setFont(new Font("serif",Font.PLAIN,20));
add(labeldesignation);

 lbldesignation= new JLabel();
 lbldesignation.setBounds(200,350,150,30);
add( lbldesignation); 

JLabel labeladhar=new JLabel("ADHAR NO.");
labeladhar.setBounds(400,350,200,30);
labeladhar.setFont(new Font("serif",Font.PLAIN,20));
add(labeladhar);

 lbldhar= new JLabel();
lbldhar.setBounds(600,350,150,30);
add( lbldhar); 

//comboBox2 = new JComboBox();
//comboBox2.setFont(new Font("serif",Font.PLAIN,20));
//comboBox2.setModel(new DefaultComboBoxModel(new String[] {"O+", "O-","A+","A-","AB+","AB-","B+","B-"}));
//comboBox2.setBounds(600, 400, 150, 30);
//add(comboBox2);
//
JLabel labelblood = new JLabel("BLOOD GROUP");
labelblood.setFont(new Font("serif",Font.PLAIN,20));
labelblood.setBounds(400, 400, 150, 30);
add(labelblood);

 lblblood = new JLabel();
lblblood.setFont(new Font("serif",Font.PLAIN,20));
lblblood.setBounds(600, 400, 150, 30);
add( lblblood);
//
//
// comboBox = new JComboBox();
//comboBox.setFont(new Font("serif",Font.PLAIN,20));
//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
//comboBox.setBounds(200, 400, 150, 30);
//add(comboBox);
//
JLabel labelGender = new JLabel("Gender");
labelGender.setFont(new Font("serif",Font.PLAIN,20));
labelGender.setBounds(50, 400, 150, 30);
add(labelGender);


 lblGender = new JLabel();
lblGender.setFont(new Font("serif",Font.PLAIN,20));
lblGender.setBounds(200, 400, 150, 30);
add(lblGender);


Delete=new JButton("Delete");
Delete.setBounds(300,600,150,40);
Delete.addActionListener(this);
Delete.setBackground(Color.BLACK);
Delete.setForeground(Color.WHITE);
add(Delete);

Back=new JButton("Back");
Back.setBounds(500,600,150,40);
Back.addActionListener(this);
Back.setBackground(Color.BLACK);
Back.setForeground(Color.WHITE);
add(Back);





//JLabel labeid=new JLabel("Empid.");
//labeid.setBounds(50,450,150,30);
//labeid.setFont(new Font("serif",Font.PLAIN,20));
//add(labeid);
//
//
// lblid=new JLabel("" + number);
//lblid.setBounds(200,450,150,30);
//lblid.setFont(new Font("serif",Font.PLAIN,20));
//add(lblid);
//		
//		
try{
	DB conn=new DB();
	
			ResultSet rs=conn.s.executeQuery("select *from employee1 where empid ='"+ ceid.getSelectedItem()+"' ");
			
			while(rs.next()) {
				
			lblname.setText(rs.getString("name"));
			lblfname.setText(rs.getString("fname"));
			lbldob.setText(rs.getString("dob"));
			lblsalary.setText(rs.getString("salary"));
			lbladdress.setText(rs.getString("address"));
			lblphone.setText(rs.getString("phone"));
			lblemail.setText(rs.getString("email"));
			lbleducation.setText(rs.getString("education"));
			lbldesignation.setText(rs.getString("designation"));
			lbldhar.setText(rs.getString("aadhar"));
			lblblood.setText(rs.getString("bloodgroup"));
			lblGender.setText(rs.getString("gender"));


				
				
				
			}
			//table.setModel(DbUtils.resultSetToTableModel(rs));
}
			catch(Exception e) {
				e.printStackTrace();
			}

        ceid.addItemListener(new ItemListener(){
        	
        	public void itemStateChanged(ItemEvent ie) {
        		try{
        			DB conn=new DB();
        			
        					ResultSet rs=conn.s.executeQuery("select *from employee1 where empid ='"+ ceid.getSelectedItem()+"' ");
        					
        					while(rs.next()) {
        						
        					lblname.setText(rs.getString("name"));
        					lblfname.setText(rs.getString("fname"));
        					lbldob.setText(rs.getString("dob"));
        					lblsalary.setText(rs.getString("salary"));
        					lbladdress.setText(rs.getString("address"));
        					lblphone.setText(rs.getString("phone"));
        					lblemail.setText(rs.getString("email"));
        					lbleducation.setText(rs.getString("education"));
        					lbldesignation.setText(rs.getString("designation"));
        					lbldhar.setText(rs.getString("aadhar"));
        					lblblood.setText(rs.getString("bloodgroup"));
        					lblGender.setText(rs.getString("gender"));


        						
        						
        						
        					}
        					//table.setModel(DbUtils.resultSetToTableModel(rs));
        		}
        					catch(Exception e) {
        						e.printStackTrace();
        					}
        		
        	}
        });
	
        

        
        	
        	
        

         
		
		
		setSize(1000,800);
		setLocation(200,20);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==Delete) {
			try{
				DB conn=new DB();
				
						String query=("delete from employee1 where empid ='"+ ceid.getSelectedItem()+"' ");
						
						conn.s.executeUpdate(query);
						JOptionPane.showMessageDialog(null,"Employee Information Deleted Sucessfully");
						setVisible(false);
						
						
						}
						//table.setModel(DbUtils.resultSetToTableModel(rs));
			
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

}