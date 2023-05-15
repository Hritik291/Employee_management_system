package employee_management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Choice;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Update_employee extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtSearchemp;
	//private JTable table;
	Choice ceid;
	JButton update,Back;
	JLabel search,lblid;
	
	
	JTextField tfname,tfaddress,tfphone,tfdhar,tfsalary,tffname,tfemail,tfdesignation,tfdob,tfgender,tfeducation,tfblood;
	JComboBox comboBox1,comboBox,comboBox2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Update_employee();
	}

	/**
	 * Create the frame.
	 */
	public Update_employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 378);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		
		
		
		
//		JLabel lblNewLabel = new JLabel("Update Employee");
//		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setBounds(130, 24, 259, 42);
//		contentPane.add(lblNewLabel);
//		
//		txtSearchemp = new JTextField();
//		txtSearchemp.setText("Search_emp");
//		txtSearchemp.setBounds(393, 88, 112, 25);
//		contentPane.add(txtSearchemp);
//		txtSearchemp.setColumns(10);
////		
//		table = new JTable();
//		table.setToolTipText("");
//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//			},
//			new String[] {
//				"New column", "New column", "New column", "New column"
//			}
//		));
//		table.setBackground(new Color(255, 69, 0));
//		table.setBounds(92, 242, 413, -68);
//		contentPane.add(table);
		
		
		
		
//		
		
		
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


tfeducation= new JTextField();
tfeducation.setBounds(600,300,150,30);
add( tfeducation); 



// comboBox1 = new JComboBox();
//comboBox1.setFont(new Font("serif",Font.PLAIN,20));
//comboBox1.setModel(new DefaultComboBoxModel(new String[] {"MCA", "BCA","MBA","MSC","BTECH","MTECH",}));
//comboBox1.setBounds(600, 300, 150, 30);
//add(comboBox1);

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

//comboBox2 = new JComboBox();
//comboBox2.setFont(new Font("serif",Font.PLAIN,20));
//comboBox2.setModel(new DefaultComboBoxModel(new String[] {"O+", "O-","A+","A-","AB+","AB-","B+","B-"}));
//comboBox2.setBounds(600, 400, 150, 30);
//add(comboBox2);

JLabel lblblood = new JLabel("BLOOD GROUP");
lblblood.setFont(new Font("serif",Font.PLAIN,20));
lblblood.setBounds(400, 400, 150, 30);
add( lblblood);

tfblood= new JTextField();
tfblood.setBounds(600,400,150,30);
add( tfblood); 



//
// comboBox = new JComboBox();
//comboBox.setFont(new Font("serif",Font.PLAIN,20));
//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
//comboBox.setBounds(200, 400, 150, 30);
//add(comboBox);

JLabel lblGender = new JLabel("Gender");
lblGender.setFont(new Font("serif",Font.PLAIN,20));
lblGender.setBounds(50, 400, 150, 30);
add(lblGender);

tfgender= new JTextField();
tfgender.setBounds(200,400,150,30);
add( tfgender); 

JLabel labeid=new JLabel("Empid.");
labeid.setBounds(50,450,150,30);
labeid.setFont(new Font("serif",Font.PLAIN,20));
add(labeid);


 lblid=new JLabel();
lblid.setBounds(200,450,150,30);
lblid.setFont(new Font("serif",Font.PLAIN,20));
add(lblid);




try{
	DB conn=new DB();
	
			ResultSet rs=conn.s.executeQuery("select *from employee1 where empid ='"+ ceid.getSelectedItem()+"' ");
			
			while(rs.next()) {
				
				tfname.setText(rs.getString("name"));
				tffname.setText(rs.getString("fname"));
				tfdob.setText(rs.getString("dob"));
				tfsalary.setText(rs.getString("salary"));
				tfaddress.setText(rs.getString("address"));
				tfphone.setText(rs.getString("phone"));
				tfemail.setText(rs.getString("email"));
				//comboBox1.setText(rs.getString("education"));
				tfeducation.setText(rs.getString("education"));
				
				tfdesignation.setText(rs.getString("designation"));
				tfdhar.setText(rs.getString("aadhar"));
				tfblood.setText(rs.getString("bloodgroup"));
				tfgender.setText(rs.getString("gender"));
				lblid.setText(rs.getString("empid"));
				//comboBox2.setText(rs.getString("bloodgroup"));
				//comboBox1.setText(rs.getString("gender"));

				
				
				
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
        						
        					tfname.setText(rs.getString("name"));
        					tffname.setText(rs.getString("fname"));
        					tfdob.setText(rs.getString("dob"));
        					tfsalary.setText(rs.getString("salary"));
        					tfaddress.setText(rs.getString("address"));
        					tfphone.setText(rs.getString("phone"));
        					tfemail.setText(rs.getString("email"));
        					tfeducation.setText(rs.getString("education"));
        					tfdesignation.setText(rs.getString("designation"));
        					tfdhar.setText(rs.getString("aadhar"));
        					tfblood.setText(rs.getString("bloodgroup"));
        					tfgender.setText(rs.getString("gender"));
        					lblid.setText(rs.getString("empid"));


        						
        						
        						
        					}
        					//table.setModel(DbUtils.resultSetToTableModel(rs));
        		}
        					catch(Exception e) {
        						e.printStackTrace();
        					}
        		
        	}
        });

        update=new JButton("update Details");
    	update.setBounds(300,600,150,40);
    	update.addActionListener(this);
    	update.setBackground(Color.BLACK);
    	update.setForeground(Color.WHITE);
    	add(update);
    	
    	Back=new JButton("Back");
    	Back.setBounds(500,600,150,40);
    	Back.addActionListener(this);
    	Back.setBackground(Color.BLACK);
    	Back.setForeground(Color.WHITE);
    	add(Back);
//
//JLabel labeid=new JLabel("Empid.");
//labeid.setBounds(50,450,150,30);
//labeid.setFont(new Font("serif",Font.PLAIN,20));
//add(labeid);
//
//
// lblid=new JLabel();
//lblid.setBounds(200,450,150,30);
//lblid.setFont(new Font("serif",Font.PLAIN,20));
//add(lblid);



//		JButton btnNewButton = new JButton("Go Back");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Admin_HomePage hr=new Admin_HomePage();
//			hr.frame.setVisible(true);
//			}
//		});
//		
//		btnNewButton.setBounds(400, 297, 105, 21);
//		contentPane.add(btnNewButton);
		
		setSize(1000,800);
		setLocation(200,20);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==update) {
			
			String name=tfname.getText();
			String fname=tffname.getText();
			String dob =tfdob.getText();
			String salary=tfsalary.getText();
			String address=tfaddress.getText();
			String phone=tfphone.getText();
			String email=tfemail.getText();
			String education=tfeducation.getText();
			String designation=tfdesignation.getText();
			String aadhar=tfdhar.getText();
			String gender=tfgender.getText();
			String bloodgroup=tfblood.getText();
			String empid=lblid.getText();
			
			
			
			
			
			
			try{
				DB conn=new DB();
				
				String query="update  employee1 set name='"+name+"', fname='"+fname+"',dob='"+dob+"', salary='"+salary+"',address='"+address+"',phone='"+phone+"',email='"+email+"',education='"+education+"',designation='"+designation+"',aadhar='"+aadhar+"',bloodgroup='"+bloodgroup+"',gender='"+gender+"' where empid='"+empid+"'";

						
						conn.s.executeUpdate(query);
						JOptionPane.showMessageDialog(null,"Employee Information updated Sucessfully");
						setVisible(false);
						Admin_HomePage ad=new Admin_HomePage();
						ad.initialize();
						
						
						
						}
						//table.setModel(DbUtils.resultSetToTableModel(rs));
			
						catch(Exception e) {
							e.printStackTrace();
						}
		
	}
		else {
			setVisible(false);
		Admin_HomePage ad=new Admin_HomePage();
		Admin_HomePage a=new Admin_HomePage();
		a.frame.setVisible(true);
			
		}
	}}
