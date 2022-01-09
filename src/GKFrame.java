import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class GKFrame extends JFrame {
	
	private int teamidx;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtNumGames;
	private JTextField txtCS;
	private JTextField txtSave;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GKFrame frame = new GKFrame(0);
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
	public GKFrame(int id) {
		this.teamidx = id;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(197, 122, 61, 28);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtName.setBounds(298, 124, 153, 25);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setText("0");
		txtAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAge.setColumns(10);
		txtAge.setBounds(298, 168, 153, 25);
		contentPane.add(txtAge);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(211, 166, 61, 28);
		contentPane.add(lblNewLabel_1);
		
		txtNumGames = new JTextField();
		txtNumGames.setText("0");
		txtNumGames.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNumGames.setColumns(10);
		txtNumGames.setBounds(298, 228, 153, 25);
		contentPane.add(txtNumGames);
		
		JLabel lblNewLabel_2 = new JLabel("Number of Games");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(138, 226, 134, 28);
		contentPane.add(lblNewLabel_2);
		
		txtCS = new JTextField();
		txtCS.setText("0");
		txtCS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCS.setColumns(10);
		txtCS.setBounds(298, 281, 153, 25);
		contentPane.add(txtCS);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Clean Sheets");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(105, 279, 153, 28);
		contentPane.add(lblNewLabel_3);
		
		txtSave = new JTextField();
		txtSave.setText("0");
		txtSave.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSave.setColumns(10);
		txtSave.setBounds(298, 332, 153, 25);
		contentPane.add(txtSave);
		
		JLabel lblNewLabel_4 = new JLabel("Number of Saves");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(136, 330, 122, 28);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Add A Goalkeeper");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(248, 63, 169, 13);
		contentPane.add(lblNewLabel_5);
		
		btnNewButton = new JButton("Add GK");
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try{
					String name = txtName.getText();
					int age = Integer.parseInt(txtAge.getText());
					int games = Integer.parseInt(txtNumGames.getText());
					int cs = Integer.parseInt(txtCS.getText());
					int saves = Integer.parseInt(txtSave.getText());
					
					Goalkeeper gk = new Goalkeeper(name, age, games, cs, saves);
					MainMethod.teams.get(id).goalkeepers.add(gk);
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
				
				
				GKFrame.this.dispose();
			}
		});
		btnNewButton.setBounds(269, 394, 85, 21);
		contentPane.add(btnNewButton);
	}
}
