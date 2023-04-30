import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Salary_calculation extends JFrame {

	private JPanel contentPane;
	private JTextField totalTF;
	private JTextField bonousTF;
	private JTextField taxTF;
	private JTextField salaryTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salary_calculation frame = new Salary_calculation();
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
	public Salary_calculation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 555);
		setTitle("salary calculation");
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Salary Calculation");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(217, 10, 334, 71);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Salary");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(195, 120, 141, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TAX");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(195, 209, 141, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Bonus");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(195, 294, 141, 38);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Total");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(195, 368, 141, 38);
		contentPane.add(lblNewLabel_1_3);
		
		totalTF = new JTextField();
		totalTF.setBounds(409, 369, 141, 38);
		contentPane.add(totalTF);
		totalTF.setColumns(10);
		
		bonousTF = new JTextField();
		bonousTF.setColumns(10);
		bonousTF.setBounds(409, 295, 141, 38);
		contentPane.add(bonousTF);
		
		taxTF = new JTextField();
		taxTF.setColumns(10);
		taxTF.setBounds(409, 210, 141, 38);
		contentPane.add(taxTF);
		
		salaryTF = new JTextField();
		salaryTF.setColumns(10);
		salaryTF.setBounds(409, 121, 141, 38);
		contentPane.add(salaryTF);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(262, 453, 107, 27);
		contentPane.add(btnNewButton);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final double TAXRATE=0.06;
				double salary;
				double tax;
				double bonous=0.5;
				double total;
				salary=Double.parseDouble(salaryTF.getText());
				tax=salary*TAXRATE;
				bonous=salary+bonous;
				total=salary+bonous-tax;
				taxTF.setText(Double.toString(tax));
				bonousTF.setText(Double.toString(bonous));
				totalTF.setText(Double.toString(total));
				
				
			}
		});
		btnCalculate.setBackground(new Color(0, 255, 127));
		btnCalculate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCalculate.setBounds(395, 453, 119, 27);
		contentPane.add(btnCalculate);
	}
}
