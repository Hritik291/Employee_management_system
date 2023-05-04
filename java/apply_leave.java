package Pro.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class apply_leave extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					apply_leave frame = new apply_leave();
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
	public apply_leave() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 764);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel emp_apply = new JLabel("Apply Leave ");
		emp_apply.setFont(new Font("Times New Roman", Font.BOLD, 27));
		emp_apply.setBounds(386, 21, 184, 68);
		contentPane.add(emp_apply);
		
		JLabel lblNewLabel = new JLabel("______________");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(386, 60, 154, 29);
		contentPane.add(lblNewLabel);
		
		JLabel emp_res = new JLabel("Reason :");
		emp_res.setFont(new Font("Tahoma", Font.BOLD, 22));
		emp_res.setBounds(261, 167, 112, 37);
		contentPane.add(emp_res);
		
		JLabel emp_Date = new JLabel("Start Date :");
		emp_Date.setFont(new Font("Tahoma", Font.BOLD, 21));
		emp_Date.setBounds(240, 249, 133, 29);
		contentPane.add(emp_Date);
		
		JLabel lblNewLabel_1 = new JLabel("End Date :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1.setBounds(250, 321, 127, 37);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(386, 167, 169, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(386, 249, 169, 37);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(386, 325, 169, 37);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton app_submit = new JButton("Submit");
		app_submit.setForeground(new Color(0, 0, 0));
		app_submit.setBackground(new Color(204, 0, 0));
		app_submit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		app_submit.setBounds(300, 500, 85, 21);
		contentPane.add(app_submit);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(204, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(552, 501, 85, 21);
		contentPane.add(btnNewButton);
	}
}
