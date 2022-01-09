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

public class DefFrame extends JFrame {

	private JPanel contentPane;
	private int teamidx;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtGames;
	private JTextField txtBlocks;
	private JTextField txtTackles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DefFrame frame = new DefFrame(0);
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
	public DefFrame(int teamidx) {
		this.teamidx = teamidx;
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
		txtName.setBounds(339, 108, 153, 25);
		contentPane.add(txtName);
		
		JLabel lblNewLabel_5 = new JLabel("Add A Defender");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(289, 47, 169, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(252, 106, 61, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(252, 150, 61, 28);
		contentPane.add(lblNewLabel_1);
		
		txtAge = new JTextField();
		txtAge.setText("0");
		txtAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAge.setColumns(10);
		txtAge.setBounds(339, 152, 153, 25);
		contentPane.add(txtAge);
		
		txtGames = new JTextField();
		txtGames.setText("0");
		txtGames.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtGames.setColumns(10);
		txtGames.setBounds(339, 212, 153, 25);
		contentPane.add(txtGames);
		
		JLabel lblNewLabel_2 = new JLabel("Number of Games");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(179, 210, 134, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Blocks");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(176, 263, 153, 28);
		contentPane.add(lblNewLabel_3);
		
		txtBlocks = new JTextField();
		txtBlocks.setText("0");
		txtBlocks.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtBlocks.setColumns(10);
		txtBlocks.setBounds(339, 265, 153, 25);
		contentPane.add(txtBlocks);
		
		txtTackles = new JTextField();
		txtTackles.setText("0");
		txtTackles.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTackles.setColumns(10);
		txtTackles.setBounds(339, 316, 153, 25);
		contentPane.add(txtTackles);
		
		JLabel lblNewLabel_4 = new JLabel("Number of Tackles");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(177, 314, 122, 28);
		contentPane.add(lblNewLabel_4);
		
		JButton btnAddDefender = new JButton("Add Defender");
		btnAddDefender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					String name = txtName.getText();
					int age = Integer.parseInt(txtAge.getText());
					int games = Integer.parseInt(txtGames.getText());
					int blocks = Integer.parseInt(txtBlocks.getText());
					int tackles = Integer.parseInt(txtTackles.getText());
					
					Defender gk = new Defender(name, age, games, blocks, tackles);
					MainMethod.teams.get(teamidx).defenders.add(gk);
					try {
						MainMethod.writeTeam();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

//					for (int i = 0; i < MainMethod.teams.get(id).goalkeepers.size(); i++) {
//						System.out.println(MainMethod.teams.get(id).goalkeepers.get(i).name);
//					}
				} catch (Exception err) {
					JFrame f = new JFrame();  
				    JOptionPane.showMessageDialog(f, "Could not add");
				}
				
				
				DefFrame.this.dispose();
				
			}
		});
		btnAddDefender.setBounds(300, 378, 95, 21);
		contentPane.add(btnAddDefender);
	}
}
