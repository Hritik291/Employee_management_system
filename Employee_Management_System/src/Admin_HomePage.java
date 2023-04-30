import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_HomePage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_HomePage window = new Admin_HomePage();
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
	public Admin_HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 255, 204));
		frame.setBounds(100, 100, 852, 595);
		frame.setTitle("Admin Dashboard");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Side_panel = new JPanel();
		Side_panel.setBackground(SystemColor.controlHighlight);
		Side_panel.setBounds(10, 10, 180, 542);
		frame.getContentPane().add(Side_panel);
		Side_panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(9, 226, 161, 259);
		Side_panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Desgination");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 159, 178, 13);
		Side_panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 131, 178, 29);
		Side_panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\Images[1]\\Images\\logout.png"));
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\Images[1]\\Images\\logout.png"));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(9, 496, 156, 34);
		Side_panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\businessman (1).png"));
		lblNewLabel_2.setBounds(25, 10, 127, 128);
		Side_panel.add(lblNewLabel_2);
		
		JButton btnViewProfile = new JButton("VIEW PROFILE");
		btnViewProfile.setToolTipText("");
		btnViewProfile.setForeground(Color.RED);
		btnViewProfile.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnViewProfile.setBackground(Color.BLACK);
		btnViewProfile.setBounds(21, 182, 127, 34);
		Side_panel.add(btnViewProfile);
		
		JLabel lblNewLabel_3 = new JLabel("Well Come...");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 58));
		lblNewLabel_3.setBounds(201, 185, 465, 57);
		frame.getContentPane().add(lblNewLabel_3);
		
		JPanel middle_panel = new JPanel();
		middle_panel.setBackground(SystemColor.controlHighlight);
		middle_panel.setBounds(200, 252, 631, 300);
		frame.getContentPane().add(middle_panel);
		middle_panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Update Salary");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\icons8-payroll-48.png"));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_2.setBounds(216, 224, 196, 59);
		middle_panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_2 = new JButton("Salary Receipt");
		btnNewButton_2_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\icons8-paycheque-48.png"));
		btnNewButton_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_2_2.setBounds(429, 224, 189, 59);
		middle_panel.add(btnNewButton_2_2);
		
		JButton add_employee_Button = new JButton("Add Employee");
		add_employee_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Employee hr=new Add_Employee();
				hr.frame.setVisible(true);
			}
		});
		
		add_employee_Button.setBorder(UIManager.getBorder("Button.border"));
		add_employee_Button.setToolTipText("Add Employee\r\n");
		add_employee_Button.setIconTextGap(2);
		add_employee_Button.setAlignmentX(Component.CENTER_ALIGNMENT);
		add_employee_Button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		add_employee_Button.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\icons8-add-user-male-skin-type-7-48 (1).png"));
		add_employee_Button.setBounds(10, 37, 196, 57);
		middle_panel.add(add_employee_Button);
		
		JButton btnNewButton_2_5 = new JButton("Update Employee");
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_employee hr=new Update_employee();
				hr.setVisible(true);
			}
		});
		btnNewButton_2_5.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\icons8-update-user-48.png"));
		btnNewButton_2_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_2_5.setBounds(216, 37, 196, 57);
		middle_panel.add(btnNewButton_2_5);
		
		JButton btnNewButton_2_6 = new JButton("Delete Employee");
		btnNewButton_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete_Employee hr=new Delete_Employee();
				hr.setVisible(true);
			}
		});
		btnNewButton_2_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_2_6.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\icons8-denied-skin-type-7-48.png"));
		btnNewButton_2_6.setBounds(10, 112, 196, 57);
		middle_panel.add(btnNewButton_2_6);
		
		JButton btnNewButton_2_7 = new JButton("View Employee");
		btnNewButton_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view_employee hr=new view_employee();
				hr.setVisible(true);
			}
		});
		btnNewButton_2_7.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\icons8-profile-48.png"));
		btnNewButton_2_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_2_7.setBounds(422, 37, 196, 57);
		middle_panel.add(btnNewButton_2_7);
		
		JLabel lblNewLabel_4 = new JLabel("Salary Section");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(10, 179, 150, 35);
		middle_panel.add(lblNewLabel_4);
		
		JButton btnNewButton_2_6_1 = new JButton("Manage Leave");
		btnNewButton_2_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manage_Leave hr=new Manage_Leave();
				hr.setVisible(true);
			}
		});
		btnNewButton_2_6_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\icons8-leave-58.png"));
		btnNewButton_2_6_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_2_6_1.setBounds(216, 112, 196, 57);
		middle_panel.add(btnNewButton_2_6_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Employee Section");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4_1.setBounds(10, 0, 150, 35);
		middle_panel.add(lblNewLabel_4_1);
		
		JButton btnNewButton_2_3 = new JButton("Calculate Salary");
		btnNewButton_2_3.setBounds(10, 224, 196, 59);
		middle_panel.add(btnNewButton_2_3);
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salary_calculation hk=new Salary_calculation();
				hk.setVisible(true);
			}
		});
		btnNewButton_2_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_2_3.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\icons8-calculate-48.png"));
		
		JButton btnNewButton_1 = new JButton("About us");
		btnNewButton_1.setBounds(752, 10, 79, 15);
		frame.getContentPane().add(btnNewButton_1);
	}
}
