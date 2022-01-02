import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class AdminPlayerMethodpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPlayerMethodpage frame = new AdminPlayerMethodpage();
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
	public AdminPlayerMethodpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Player Controls");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(281, 44, 155, 13);
		contentPane.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setToolTipText("Player Name\r\n");
		textField.setText("Player Name\r\n");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(266, 87, 167, 31);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_2 = new JLabel("Add or remove a player?");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(62, 90, 176, 21);
		contentPane.add(lblNewLabel_1_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Add");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(255, 155, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnRemove = new JRadioButton("Remove\r\n");
		rdbtnRemove.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnRemove.setBounds(360, 155, 103, 21);
		contentPane.add(rdbtnRemove);
		
		JButton btnAddPlayer = new JButton("Add Player\r\n");
		btnAddPlayer.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddPlayer.setBounds(477, 86, 127, 31);
		contentPane.add(btnAddPlayer);
	}
}
