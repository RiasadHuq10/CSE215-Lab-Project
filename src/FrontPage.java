import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.lang.reflect.Modifier;

public class FrontPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage frame = new FrontPage();
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
	public FrontPage() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 295);
		contentPane = new JPanel();
		
		JLabel background;
		ImageIcon img = new ImageIcon("b.jpg");
		background = new JLabel("", img, JLabel.CENTER);
		background.setBounds(0,0, 529, 295);
				
		//contentPane.setBackground(new Color(51, 204, 255));
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Coach Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoachLogin clog = new CoachLogin();
				FrontPage.this.dispose();
				clog.setVisible(true);
			}
		});
		btnNewButton.setBounds(77, 174, 114, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Player Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayerLogin plog = new PlayerLogin();
				FrontPage.this.dispose();
				plog.setVisible(true);

			}
		});
		btnNewButton_1.setBounds(296, 174, 114, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Are you a Team Coach or a Player?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(151, 88, 280, 29);
		contentPane.add(lblNewLabel);
	}

}
