package Demp.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.UIManager;

public class Delete extends JFrame {
	private JTextField txtEnterEmployeeId;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete frame = new Delete();
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
	public Delete() {
		getContentPane().setBackground(new Color(192, 192, 192));
		getContentPane().setForeground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 669);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 64));
		panel.setForeground(new Color(0, 0, 64));
		panel.setBounds(0, 0, 1028, 43);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Delete Employee :");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblNewLabel_1.setBounds(10, 10, 169, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Sr No :");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 17));
		lblNewLabel.setBounds(129, 68, 72, 43);
		getContentPane().add(lblNewLabel);
		
		txtEnterEmployeeId = new JTextField();
		txtEnterEmployeeId.setBackground(new Color(255, 255, 255));
		txtEnterEmployeeId.setForeground(new Color(0, 0, 0));
		txtEnterEmployeeId.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterEmployeeId.setBounds(140, 108, 578, 37);
		getContentPane().add(txtEnterEmployeeId);
		txtEnterEmployeeId.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("First Name :");
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD, 19));
		lblNewLabel_2.setBounds(129, 160, 113, 37);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(139, 194, 239, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name :");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 19));
		lblNewLabel_3.setBounds(455, 166, 113, 25);
		getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(479, 194, 239, 37);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Department :");
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.BOLD, 19));
		lblNewLabel_4.setBounds(129, 241, 133, 43);
		getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(139, 293, 239, 37);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Designation :");
		lblNewLabel_5.setFont(new Font("Sylfaen", Font.BOLD, 19));
		lblNewLabel_5.setBounds(455, 247, 122, 31);
		getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(479, 293, 239, 37);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Contact No :");
		lblNewLabel_6.setFont(new Font("Sylfaen", Font.BOLD, 19));
		lblNewLabel_6.setBounds(129, 357, 114, 37);
		getContentPane().add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(140, 404, 239, 37);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Status :");
		lblNewLabel_7.setFont(new Font("Sylfaen", Font.BOLD, 19));
		lblNewLabel_7.setBounds(455, 358, 72, 35);
		getContentPane().add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Active");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		rdbtnNewRadioButton.setBounds(479, 399, 103, 40);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("In - Active");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		rdbtnNewRadioButton_1.setBounds(596, 398, 122, 43);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("Address :");
		lblNewLabel_8.setBackground(new Color(240, 240, 240));
		lblNewLabel_8.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_8.setBounds(129, 458, 133, 43);
		getContentPane().add(lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setForeground(new Color(0, 0, 0));
		textField_5.setBounds(140, 499, 578, 37);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete Employee");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(0, 0, 64));
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton.setBounds(274, 562, 173, 37);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Go Back");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(520, 561, 113, 37);
		getContentPane().add(btnNewButton_1);
	}
}
