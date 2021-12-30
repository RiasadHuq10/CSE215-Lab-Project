import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class AdminPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtTeamName_1;
	private JTextField txtTeamName;
	private JTextField txtPlayername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Panel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(260, 27, 155, 59);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Team");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(456, 153, 127, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Need to add a team?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(67, 163, 155, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Need to remove a team?");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(41, 209, 176, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnRemoveTeam = new JButton("Remove Team");
		btnRemoveTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveTeam.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRemoveTeam.setBounds(456, 205, 127, 31);
		contentPane.add(btnRemoveTeam);
		
		JLabel lblNewLabel_2 = new JLabel("Team Controls");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(260, 96, 155, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Player Controls");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(260, 278, 155, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnAddPlayer = new JButton("Add Player\r\n");
		btnAddPlayer.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddPlayer.setBounds(456, 320, 127, 31);
		contentPane.add(btnAddPlayer);
		
		JLabel lblNewLabel_1_2 = new JLabel("Add or remove a player?");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(41, 324, 176, 21);
		contentPane.add(lblNewLabel_1_2);
		
		txtTeamName_1 = new JTextField();
		txtTeamName_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTeamName_1.setText("Team Name");
		txtTeamName_1.setBounds(245, 153, 167, 31);
		contentPane.add(txtTeamName_1);
		txtTeamName_1.setColumns(10);
		
		txtTeamName = new JTextField();
		txtTeamName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTeamName.setText("Team Name\r\n");
		txtTeamName.setColumns(10);
		txtTeamName.setBounds(245, 205, 167, 31);
		contentPane.add(txtTeamName);
		
		txtPlayername = new JTextField();
		txtPlayername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPlayername.setToolTipText("Player Name\r\n");
		txtPlayername.setText("Player Name\r\n");
		txtPlayername.setColumns(10);
		txtPlayername.setBounds(245, 321, 167, 31);
		contentPane.add(txtPlayername);
		
		 ButtonGroup G1 = new ButtonGroup();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Add");
		G1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(234, 389, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnRemove = new JRadioButton("Remove\r\n");
		G1.add(rdbtnRemove);
		rdbtnRemove.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnRemove.setBounds(339, 389, 103, 21);
		contentPane.add(rdbtnRemove);
	}
}
