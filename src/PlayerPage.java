import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PlayerPage extends JFrame {

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
					PlayerPage frame = new PlayerPage();
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
	public PlayerPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Team Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(162, 109, 147, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(335, 112, 135, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Check Team Info?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(253, 42, 160, 25);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Check Team Info");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(228, 172, 156, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Check Player Info?");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(235, 231, 160, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblEnterTeamName = new JLabel("Enter Team Name");
		lblEnterTeamName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterTeamName.setBounds(162, 298, 147, 25);
		contentPane.add(lblEnterTeamName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(335, 301, 135, 24);
		contentPane.add(textField_1);
		
		JButton btnCheckPlayerInfo = new JButton("Check Player Info");
		btnCheckPlayerInfo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCheckPlayerInfo.setBounds(260, 419, 124, 21);
		contentPane.add(btnCheckPlayerInfo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(335, 364, 135, 24);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Enter Player Name");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(162, 361, 147, 25);
		contentPane.add(lblNewLabel_2_1);
	}

}
