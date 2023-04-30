package Details.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;

public class Empdetails extends JFrame {

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
					Empdetails frame = new Empdetails();
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
	public Empdetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 539);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(131, 228, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Employee Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(250, 23, 250, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBounds(65, 84, 97, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender:");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(65, 148, 62, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age:");
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setBounds(65, 211, 59, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Job Post:");
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(65, 268, 97, 37);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Phone:");
		lblNewLabel_5.setForeground(new Color(0, 0, 255));
		lblNewLabel_5.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(403, 84, 97, 30);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Hobbies:");
		lblNewLabel_6.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_6.setForeground(new Color(0, 0, 255));
		lblNewLabel_6.setBounds(65, 340, 83, 30);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(432, 171, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Address:");
		lblNewLabel_8.setForeground(new Color(0, 0, 255));
		lblNewLabel_8.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_8.setBackground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(403, 151, 97, 30);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Education:");
		lblNewLabel_9.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_9.setForeground(new Color(0, 0, 255));
		lblNewLabel_9.setBounds(403, 211, 97, 30);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Adhar Number:");
		lblNewLabel_10.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_10.setForeground(new Color(0, 0, 255));
		lblNewLabel_10.setBounds(403, 340, 136, 30);
		contentPane.add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setBounds(171, 86, 153, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 213, 153, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setToolTipText("");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnNewRadioButton.setBounds(171, 154, 62, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnNewRadioButton_1.setBounds(262, 154, 62, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(172, 273, 153, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Reading");
		chckbxNewCheckBox.setBounds(154, 344, 62, 19);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Playing");
		chckbxNewCheckBox_1.setBounds(218, 344, 62, 19);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Coding");
		chckbxNewCheckBox_2.setVerticalAlignment(SwingConstants.TOP);
		chckbxNewCheckBox_2.setBounds(287, 343, 62, 19);
		contentPane.add(chckbxNewCheckBox_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(547, 87, 155, 27);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(547, 142, 155, 46);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Date of Birth:");
		lblNewLabel_11.setForeground(new Color(0, 0, 255));
		lblNewLabel_11.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(403, 271, 109, 30);
		contentPane.add(lblNewLabel_11);
		
		textField_5 = new JTextField();
		textField_5.setBounds(549, 213, 153, 27);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(549, 340, 153, 27);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(154, 166, 169));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(262, 424, 85, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(new Color(154, 166, 169));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(427, 424, 85, 26);
		contentPane.add(btnNewButton_2);
		
		textField_7 = new JTextField();
		textField_7.setBounds(549, 271, 153, 27);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
	}
}
