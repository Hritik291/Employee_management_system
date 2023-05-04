package Pro.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Emp_project extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp_project frame = new Emp_project();
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
	public Emp_project() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 769);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel emp_project = new JLabel("My Project");
		emp_project.setIcon(null);
		emp_project.setFont(new Font("Times New Roman", Font.BOLD, 25));
		emp_project.setForeground(new Color(255, 255, 255));
		emp_project.setBounds(336, 22, 191, 50);
		contentPane.add(emp_project);
		
		JLabel emp_d = new JLabel("_______________");
		emp_d.setForeground(new Color(255, 255, 255));
		emp_d.setFont(new Font("Tahoma", Font.BOLD, 19));
		emp_d.setBounds(314, 32, 191, 62);
		contentPane.add(emp_d);
		
		JLabel emp_pid = new JLabel("Project ID :");
		emp_pid.setForeground(new Color(255, 255, 255));
		emp_pid.setFont(new Font("Tahoma", Font.BOLD, 20));
		emp_pid.setBounds(139, 128, 181, 44);
		contentPane.add(emp_pid);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(299, 130, 206, 49);
		contentPane.add(lblNewLabel);
		
		JLabel pname_emp = new JLabel("Project Name :");
		pname_emp.setFont(new Font("Tahoma", Font.BOLD, 20));
		pname_emp.setForeground(new Color(255, 255, 255));
		pname_emp.setBounds(105, 182, 170, 62);
		contentPane.add(pname_emp);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(309, 201, 218, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel emp_due = new JLabel("Due Date :");
		emp_due.setFont(new Font("Tahoma", Font.BOLD, 20));
		emp_due.setForeground(new Color(255, 255, 255));
		emp_due.setBounds(147, 231, 152, 50);
		contentPane.add(emp_due);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(299, 244, 218, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel emp_submit_date = new JLabel("Submit Date :");
		emp_submit_date.setForeground(new Color(255, 255, 255));
		emp_submit_date.setFont(new Font("Tahoma", Font.BOLD, 20));
		emp_submit_date.setBounds(112, 291, 170, 62);
		contentPane.add(emp_submit_date);
		
		JLabel lblNewLabel_5 = new JLabel("Mark :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(179, 371, 103, 27);
		contentPane.add(lblNewLabel_5);
		
		JLabel submit = new JLabel("Submit Date :");
		submit.setForeground(new Color(255, 255, 255));
		submit.setFont(new Font("Tahoma", Font.BOLD, 20));
		submit.setBounds(106, 408, 155, 67);
		contentPane.add(submit);
		
		JLabel emp_status = new JLabel("Status :");
		emp_status.setForeground(new Color(255, 255, 255));
		emp_status.setFont(new Font("Tahoma", Font.BOLD, 20));
		emp_status.setBounds(165, 485, 110, 44);
		contentPane.add(emp_status);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(235, 626, 85, 27);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(526, 626, 85, 27);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(299, 310, 218, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(299, 372, 218, 33);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(299, 429, 218, 33);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(299, 495, 218, 33);
		contentPane.add(lblNewLabel_8);
	}
}
