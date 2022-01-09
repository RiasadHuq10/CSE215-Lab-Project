import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MidFrame extends JFrame {
	private int teamidx;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtGames;
	private JTextField txtAssists;
	private JTextField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MidFrame frame = new MidFrame(0);
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
	public MidFrame(int idx) {
		this.teamidx = idx;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtName.setColumns(10);
		txtName.setBounds(336, 111, 153, 25);
		contentPane.add(txtName);
		
		JLabel lblNewLabel_5 = new JLabel("Add A Midfielder");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(286, 50, 169, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(235, 109, 61, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(249, 153, 61, 28);
		contentPane.add(lblNewLabel_1);
		
		txtAge = new JTextField();
		txtAge.setText("0");
		txtAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAge.setColumns(10);
		txtAge.setBounds(336, 155, 153, 25);
		contentPane.add(txtAge);
		
		txtGames = new JTextField();
		txtGames.setText("0");
		txtGames.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtGames.setColumns(10);
		txtGames.setBounds(336, 215, 153, 25);
		contentPane.add(txtGames);
		
		JLabel lblNewLabel_2 = new JLabel("Number of Games");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(176, 213, 134, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Assists");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(143, 266, 153, 28);
		contentPane.add(lblNewLabel_3);
		
		txtAssists = new JTextField();
		txtAssists.setText("0");
		txtAssists.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAssists.setColumns(10);
		txtAssists.setBounds(336, 268, 153, 25);
		contentPane.add(txtAssists);
		
		JLabel lblNewLabel_4 = new JLabel("Number of Passes");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(174, 317, 122, 28);
		contentPane.add(lblNewLabel_4);
		
		txtPass = new JTextField();
		txtPass.setText("0");
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPass.setColumns(10);
		txtPass.setBounds(336, 319, 153, 25);
		contentPane.add(txtPass);
		
		JButton btnAddMidfielder = new JButton("Add Midfielder");
		btnAddMidfielder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					String name = txtName.getText();
					int age = Integer.parseInt(txtAge.getText());
					int games = Integer.parseInt(txtGames.getText());
					int assists = Integer.parseInt(txtAssists.getText());
					int pass = Integer.parseInt(txtPass.getText());
					
					Midfielder gk = new Midfielder(name, age, games, assists, pass);
					MainMethod.teams.get(teamidx).midfielders.add(gk);
					try {
						MainMethod.writeTeam();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

//					for (int i = 0; i < MainMethod.teams.get(id).midfielders.size(); i++) {
//						System.out.println(MainMethod.teams.get(id).midfielders.get(i).name);
//					}
				} catch (Exception err) {
					JFrame f = new JFrame();  
				    JOptionPane.showMessageDialog(f, "Could not add");
				}
				
				
				MidFrame.this.dispose();
			}
		});
		btnAddMidfielder.setBounds(286, 381, 106, 21);
		contentPane.add(btnAddMidfielder);
	}
}
