import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_Employee extends Admin_HomePage {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Employee window = new Add_Employee();
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
	public Add_Employee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 760, 609);
		frame.setTitle("Add Employee");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(216, 191, 216));
		panel.setBounds(10, 60, 501, 501);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 31, 109, 28);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(129, 32, 109, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(129, 80, 109, 28);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(382, 32, 109, 28);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(382, 80, 109, 28);
		panel.add(textField_3);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLastName.setHorizontalAlignment(SwingConstants.LEFT);
		lblLastName.setBounds(263, 31, 109, 28);
		panel.add(lblLastName);
		
		JLabel lblAge = new JLabel("D.O.B:-");
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAge.setBounds(10, 80, 109, 28);
		panel.add(lblAge);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPhoneNumber.setBounds(263, 80, 109, 28);
		panel.add(lblPhoneNumber);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(129, 136, 109, 26);
		panel.add(comboBox);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGender.setBounds(10, 134, 109, 28);
		panel.add(lblGender);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"o+", "o-", "AB+", "AB-", "A+", "A-", "B+", "B-"}));
		comboBox_1.setBounds(382, 136, 109, 24);
		panel.add(comboBox_1);
		
		JLabel lblBloodGroup = new JLabel("Blood Group");
		lblBloodGroup.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblBloodGroup.setBounds(263, 134, 109, 28);
		panel.add(lblBloodGroup);
		
		JLabel lblGender_1 = new JLabel("Account Name");
		lblGender_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGender_1.setBounds(10, 187, 109, 28);
		panel.add(lblGender_1);
		
		JLabel lblGender_2 = new JLabel("Account Type");
		lblGender_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGender_2.setBounds(263, 187, 109, 28);
		panel.add(lblGender_2);
		
		JLabel lblGender_3 = new JLabel("Join Date");
		lblGender_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGender_3.setBounds(263, 239, 109, 28);
		panel.add(lblGender_3);
		
		JLabel lblGender_4 = new JLabel("Maritual Status");
		lblGender_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGender_4.setBounds(10, 239, 109, 28);
		panel.add(lblGender_4);
		
		JLabel lblGender_5 = new JLabel("Salary");
		lblGender_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGender_5.setBounds(10, 291, 109, 28);
		panel.add(lblGender_5);
		
		JLabel lblGender_6 = new JLabel("City");
		lblGender_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGender_6.setBounds(263, 291, 109, 28);
		panel.add(lblGender_6);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Saving", "Current"}));
		comboBox_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox_2.setBounds(382, 189, 109, 26);
		panel.add(comboBox_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(129, 193, 109, 28);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(382, 239, 109, 28);
		panel.add(textField_5);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Single", "Marriage"}));
		comboBox_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox_3.setBounds(129, 244, 109, 26);
		panel.add(comboBox_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(129, 297, 109, 28);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(382, 291, 109, 28);
		panel.add(textField_7);
		
		JLabel lblGender_5_1 = new JLabel("Address");
		lblGender_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGender_5_1.setBounds(10, 352, 109, 28);
		panel.add(lblGender_5_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(131, 352, 107, 52);
		panel.add(editorPane);
		
		JLabel lblGender_2_1 = new JLabel("Department Name");
		lblGender_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGender_2_1.setBounds(263, 352, 109, 28);
		panel.add(lblGender_2_1);
		
		JLabel lblGender_2_2 = new JLabel("Job Post");
		lblGender_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGender_2_2.setBounds(263, 390, 109, 28);
		panel.add(lblGender_2_2);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setModel(new DefaultComboBoxModel(new String[] {"IT sector", "Management", "Bussiness", "Education"}));
		comboBox_3_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox_3_1.setBounds(382, 354, 109, 26);
		panel.add(comboBox_3_1);
		
		JComboBox comboBox_3_2 = new JComboBox();
		comboBox_3_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox_3_2.setModel(new DefaultComboBoxModel(new String[] {"Developer", "Coading", "Managing"}));
		comboBox_3_2.setBounds(382, 390, 109, 26);
		panel.add(comboBox_3_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(180, 451, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setBounds(311, 451, 85, 21);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Add Employee");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(10, 10, 323, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\employee (1).png"));
		lblNewLabel_2.setBounds(521, 99, 215, 420);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Employee_ID:-");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(521, 60, 114, 21);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_8 = new JTextField();
		textField_8.setBounds(645, 61, 96, 21);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Go back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_HomePage hr=new Admin_HomePage();
				hr.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(651, 526, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
