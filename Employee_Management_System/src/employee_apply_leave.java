import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;

public class employee_apply_leave extends JFrame {

	private JPanel contentPane;
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
					employee_apply_leave frame = new employee_apply_leave();
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
	public employee_apply_leave() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Employee apply leave");
		setBounds(100, 100, 827, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(221, 160, 221));
		panel.setBounds(32, 78, 754, 422);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("EMP ID:-");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(54, 44, 101, 27);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(191, 45, 142, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("From:-");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(54, 98, 101, 27);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(191, 99, 142, 27);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(521, 45, 142, 27);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Select Category:-");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(54, 159, 101, 27);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email:-");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(407, 44, 101, 27);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("To:-");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(407, 98, 101, 27);
		panel.add(lblNewLabel_1_2_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(521, 98, 142, 27);
		panel.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Medical", "Marriage"}));
		comboBox.setBounds(191, 160, 142, 27);
		panel.add(comboBox);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Other");
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_2_1_1.setBounds(407, 159, 101, 27);
		panel.add(lblNewLabel_1_2_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(521, 160, 142, 27);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Subject:-");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(54, 215, 101, 27);
		panel.add(lblNewLabel_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(191, 220, 330, 27);
		panel.add(textField_5);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Description:-");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(54, 272, 101, 27);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(198, 270, 323, 59);
		panel.add(textPane);
		
		JButton btnNewButton = new JButton("Apply");
		btnNewButton.setBorder(new CompoundBorder(new LineBorder(new Color(255, 0, 0), 4, true), null));
		btnNewButton.setBackground(new Color(173, 216, 230));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBounds(369, 365, 85, 27);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(186, 85, 211));
		panel_1.setBounds(32, 10, 754, 61);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Apply Leave");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
