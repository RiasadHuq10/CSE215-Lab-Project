import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
	private JTextField txtAbc_1;
	private JTextField txtAbc;

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
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String getTeam = txtTeamName_1.getText();
				Team t = new Team(getTeam);
				MainMethod.teams.add(t);
				JFrame f = new JFrame();  
			    JOptionPane.showMessageDialog(f,"Team " + getTeam + " Added!");
				
			}
		});
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
			int index;
			JFrame f = new JFrame();
			public void actionPerformed(ActionEvent e) {
				
				String getTeam = txtTeamName.getText();
				int bool = -1;
				try {
					index = MainMethod.searchTeam(getTeam);
					System.out.println(index);
					if (index != -1)
						MainMethod.teams.remove(index);
					
				} catch (Exception error) {
					System.out.println(error);
					JOptionPane.showMessageDialog(f,"Team " + getTeam + " Could not be deleted");
				}
				
				if (index != -1) {
					JOptionPane.showMessageDialog(f,"Team " + getTeam + " Successfully Deleted");
				}
				else
				    JOptionPane.showMessageDialog(f,"Team " + getTeam + " Not found");
			}
				
		});
		btnRemoveTeam.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRemoveTeam.setBounds(456, 205, 127, 31);
		contentPane.add(btnRemoveTeam);
		
		JLabel lblNewLabel_2 = new JLabel("Team Controls");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(260, 96, 155, 13);
		contentPane.add(lblNewLabel_2);
		
		txtTeamName_1 = new JTextField();
		txtTeamName_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTeamName_1.setText("abc");
		txtTeamName_1.setBounds(245, 153, 167, 31);
		contentPane.add(txtTeamName_1);
		txtTeamName_1.setColumns(10);
		
		txtTeamName = new JTextField();
		txtTeamName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTeamName.setText("abc");
		txtTeamName.setColumns(10);
		txtTeamName.setBounds(245, 205, 167, 31);
		contentPane.add(txtTeamName);
		
		JLabel lblNewLabel_1_2 = new JLabel("Search a team");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(67, 274, 155, 21);
		contentPane.add(lblNewLabel_1_2);
		
		txtAbc_1 = new JTextField();
		txtAbc_1.setText("abc");
		txtAbc_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAbc_1.setColumns(10);
		txtAbc_1.setBounds(245, 264, 167, 31);
		contentPane.add(txtAbc_1);
		
		JButton btnSearchTeam = new JButton("Search Team\r\n");
		btnSearchTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String getTeam = txtAbc_1.getText();
				try {
					System.out.println(MainMethod.searchTeam(getTeam));
					if(MainMethod.searchTeam(getTeam) != -1) {
						AdminPlayerMethodpage f = new AdminPlayerMethodpage(MainMethod.searchTeam(getTeam));
						AdminPage.this.dispose();
						f.setVisible(true);
					    //JOptionPane.showMessageDialog(f,"Team " + getTeam + " Found!");
					} else {
						JFrame f = new JFrame();  
					    JOptionPane.showMessageDialog(f,"Team " + getTeam + " Not Found!");
					}
				} catch (NullPointerException error) {
					System.out.println(error);
				}
				
				
			}
		});
		btnSearchTeam.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSearchTeam.setBounds(456, 264, 127, 31);
		contentPane.add(btnSearchTeam);
		
		txtAbc = new JTextField();
		txtAbc.setText("abc");
		txtAbc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAbc.setColumns(10);
		txtAbc.setBounds(245, 327, 167, 31);
		contentPane.add(txtAbc);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Get Information of a team");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(24, 337, 198, 21);
		contentPane.add(lblNewLabel_1_2_1);
		
		JButton btnGetInfo = new JButton("Get Info");
		btnGetInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String getTeam = txtAbc.getText();
				JFrame f = new JFrame();
				int index = MainMethod.searchTeam(getTeam);
				if (index != -1)
					JOptionPane.showMessageDialog(f, MainMethod.teams.get(index).getInfo());
				else
					JOptionPane.showMessageDialog(f, "Team Not Found");
			}
		});
		btnGetInfo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGetInfo.setBounds(456, 327, 127, 31);
		contentPane.add(btnGetInfo);
		
		JButton btnNewButton_2 = new JButton("Log Out");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrontPage home = new FrontPage();
				AdminPage.this.dispose();
				home.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(505, 48, 132, 21);
		contentPane.add(btnNewButton_2);
		
		 ButtonGroup G1 = new ButtonGroup();
	}
}
