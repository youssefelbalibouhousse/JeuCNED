package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ChoixJoueur extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixJoueur frame = new ChoixJoueur();
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
	public ChoixJoueur() {
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
	    this.pack();
	    
	    //this.setResizable(false);
	    
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFond = new JLabel("");
		lblFond.setBounds(10, 10, 400, 275);
		contentPane.add(lblFond);
		//String chemin ="media/fondchoix.jpg";
		//String resource = getClass().getClassLoader().getResource(chemin).getPath();
		lblFond.setIcon(new ImageIcon("C:\\Users\\Youssef\\Desktop\\CNED\\Bloc 2 SLAM\\Eclipse\\Urban_Marginal\\media\\fonds\\fondchoix.jpg"));
		
		JButton PrecedentBTN = new JButton("New button");
		PrecedentBTN.setBounds(48, 198, 85, 21);
		contentPane.add(PrecedentBTN);
	}
}
