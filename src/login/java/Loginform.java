package login.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loginform extends JFrame {

	private JPanel contentPane;
	private JTextField txtJjh;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginform frame = new Loginform();
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
	public Loginform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 633);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 244, 155));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username: -");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(199, 139, 158, 55);
		contentPane.add(lblNewLabel);
		
		txtJjh = new JTextField();
		txtJjh.setBackground(new Color(255, 255, 255));
		txtJjh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtJjh.setBounds(344, 153, 200, 25);
		contentPane.add(txtJjh);
		txtJjh.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password -");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(199, 189, 188, 70);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(344, 215, 202, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton.setBounds(302, 300, 100, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign up");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1.setBounds(373, 370, 110, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBackground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_3.setBounds(169, 34, 623, 85);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_2.setBounds(446, 300, 100, 25);
		contentPane.add(btnNewButton_2);
	}
}
