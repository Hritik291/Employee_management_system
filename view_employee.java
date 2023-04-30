import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view_employee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtSearch;
	private JTextField txtEmpidShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_employee frame = new view_employee();
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
	public view_employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 566);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 180, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VIEW EMPLOYEE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(174, 0, 257, 64);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:-");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(52, 129, 124, 36);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(189, 137, 105, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name:-");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(328, 129, 124, 36);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Address:-");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(52, 187, 124, 36);
		contentPane.add(lblNewLabel_1_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(189, 197, 347, 26);
		contentPane.add(textPane);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(431, 137, 105, 26);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Contact No:-");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(52, 243, 124, 36);
		contentPane.add(lblNewLabel_1_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(189, 251, 105, 26);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Email:-");
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1.setBounds(52, 302, 124, 36);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(189, 299, 105, 26);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Education:-");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1_1.setBounds(52, 364, 124, 36);
		contentPane.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_2 = new JLabel("D.O.B:-");
		lblNewLabel_1_2_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1_2.setBounds(52, 411, 124, 36);
		contentPane.add(lblNewLabel_1_2_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(189, 364, 105, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(189, 419, 105, 26);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_2_1_1_2_1 = new JLabel("Post:-");
		lblNewLabel_1_2_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1_2_1.setBounds(52, 467, 124, 36);
		contentPane.add(lblNewLabel_1_2_1_1_2_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(189, 475, 105, 26);
		contentPane.add(textField_6);
		
		txtSearch = new JTextField();
		txtSearch.setText("Search");
		txtSearch.setBounds(405, 77, 131, 19);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("Go back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_HomePage hr=new Admin_HomePage();
				hr.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(451, 477, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Profile Picture");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(405, 243, 131, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Photo");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(405, 266, 131, 134);
		contentPane.add(lblNewLabel_3);
		
		txtEmpidShow = new JTextField();
		txtEmpidShow.setText("Emp_id Show");
		txtEmpidShow.setBounds(405, 422, 131, 19);
		contentPane.add(txtEmpidShow);
		txtEmpidShow.setColumns(10);
	}
}
