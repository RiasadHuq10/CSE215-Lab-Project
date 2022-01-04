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
import java.awt.event.ActionEvent;

public class ForwardFrame extends JFrame {
	
	private int teamidx;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtGames;
	private JTextField txtGoals;
	private JTextField txtShots;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForwardFrame frame = new ForwardFrame(0);
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
	public ForwardFrame(int idx) {
		this.teamidx = idx;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Add A Forward");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(276, 49, 169, 13);
		contentPane.add(lblNewLabel_5);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtName.setColumns(10);
		txtName.setBounds(326, 110, 153, 25);
		contentPane.add(txtName);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(239, 108, 61, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(239, 152, 61, 28);
		contentPane.add(lblNewLabel_1);
		
		txtAge = new JTextField();
		txtAge.setText("0");
		txtAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAge.setColumns(10);
		txtAge.setBounds(326, 154, 153, 25);
		contentPane.add(txtAge);
		
		txtGames = new JTextField();
		txtGames.setText("0");
		txtGames.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtGames.setColumns(10);
		txtGames.setBounds(326, 214, 153, 25);
		contentPane.add(txtGames);
		
		JLabel lblNewLabel_2 = new JLabel("Number of Games");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(166, 212, 134, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Goals");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(163, 265, 153, 28);
		contentPane.add(lblNewLabel_3);
		
		txtGoals = new JTextField();
		txtGoals.setText("0");
		txtGoals.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtGoals.setColumns(10);
		txtGoals.setBounds(326, 267, 153, 25);
		contentPane.add(txtGoals);
		
		txtShots = new JTextField();
		txtShots.setText("0");
		txtShots.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtShots.setColumns(10);
		txtShots.setBounds(326, 318, 153, 25);
		contentPane.add(txtShots);
		
		JLabel lblNewLabel_4 = new JLabel("Number of Shots");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(164, 316, 122, 28);
		contentPane.add(lblNewLabel_4);
		
		JButton btnAddForward = new JButton("Add Forward");
		btnAddForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					String name = txtName.getText();
					int age = Integer.parseInt(txtAge.getText());
					int games = Integer.parseInt(txtGames.getText());
					int goals = Integer.parseInt(txtGoals.getText());
					int tackles = Integer.parseInt(txtShots.getText());
					
					Forward gk = new Forward(name, age, games, goals, tackles);
					MainMethod.teams.get(teamidx).forwards.add(gk);
//					for (int i = 0; i < MainMethod.teams.get(id).goalkeepers.size(); i++) {
//						System.out.println(MainMethod.teams.get(id).goalkeepers.get(i).name);
//					}
				} catch (Exception err) {
					JFrame f = new JFrame();  
				    JOptionPane.showMessageDialog(f, "Could not add");
				}
				
				
				ForwardFrame.this.dispose();
			}
		});
		btnAddForward.setBounds(287, 380, 95, 21);
		contentPane.add(btnAddForward);
	}

}
