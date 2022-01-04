import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPlayerMethodpage extends JFrame {
	
	private int teamidx;
	private JPanel contentPane;
	private JTextField txtPlayerName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPlayerMethodpage frame = new AdminPlayerMethodpage(0);
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
	public AdminPlayerMethodpage(int i) {
		this.teamidx = i;
		
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
		
		JButton btnAddPlayer = new JButton("Add Goalkeeper");
		btnAddPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GKFrame frame = new GKFrame(teamidx);
				//AdminPlayerMethodpage.this.dispose();
				frame.setVisible(true);
			}
		});
		btnAddPlayer.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddPlayer.setBounds(253, 94, 155, 31);
		contentPane.add(btnAddPlayer);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(62, 167, 45, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnAddDefender = new JButton("Add Defender");
		btnAddDefender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefFrame frame = new DefFrame(teamidx);
				//AdminPlayerMethodpage.this.dispose();
				frame.setVisible(true);
				
			}
		});
		btnAddDefender.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddDefender.setBounds(253, 150, 155, 31);
		contentPane.add(btnAddDefender);
		
		JButton btnAddMidfielder = new JButton("Add Midfielder");
		btnAddMidfielder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MidFrame frame = new MidFrame(teamidx);
				//AdminPlayerMethodpage.this.dispose();
				frame.setVisible(true);
			}
		});
		btnAddMidfielder.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddMidfielder.setBounds(253, 208, 155, 31);
		contentPane.add(btnAddMidfielder);
		
		JButton btnAddForward = new JButton("Add Forward");
		btnAddForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ForwardFrame frame = new ForwardFrame(teamidx);
				//AdminPlayerMethodpage.this.dispose();
				frame.setVisible(true);
			}
		});
		btnAddForward.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddForward.setBounds(253, 270, 155, 31);
		contentPane.add(btnAddForward);
		
		JButton btnGetInfo = new JButton("Get Info");
		btnGetInfo.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				String name = txtPlayerName.getText();
				String res = MainMethod.teams.get(teamidx).getPlayerInfo(name);
				JFrame f = new JFrame();  
			    JOptionPane.showMessageDialog(f, res);
				
			}
		});
		btnGetInfo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGetInfo.setBounds(455, 391, 127, 31);
		contentPane.add(btnGetInfo);
		
		txtPlayerName = new JTextField();
		txtPlayerName.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtPlayerName.setText("Name");
		txtPlayerName.setBounds(253, 391, 155, 26);
		contentPane.add(txtPlayerName);
		txtPlayerName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Get Info of a player");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(82, 391, 127, 31);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Log Out");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrontPage home = new FrontPage();
				AdminPlayerMethodpage.this.dispose();
				home.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(511, 42, 132, 21);
		contentPane.add(btnNewButton_2);
	}
}
