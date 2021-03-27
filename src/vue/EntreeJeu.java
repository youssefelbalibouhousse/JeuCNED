package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.Controle;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;

public class EntreeJeu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntreeJeu frame = new EntreeJeu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private void ConnectBtn_clic(ActionEvent e) {
		(new ChoixJoueur()).setVisible(true);
		this.dispose();
			
		}
	

	
	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setTitle("Urban Marginal Start");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton StartButton = new JButton("Start");
		StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		StartButton.setFont(new Font("Arial", Font.BOLD, 17));
		StartButton.setBounds(394, 39, 194, 33);
		contentPane.add(StartButton);
		
		JLabel LabelStart = new JLabel("Start a server :");
		LabelStart.setFont(new Font("Arial", Font.BOLD, 17));
		LabelStart.setBounds(62, 39, 166, 38);
		contentPane.add(LabelStart);
		
		JLabel lblNewLabel = new JLabel("Connect an existing server :");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel.setBounds(62, 96, 287, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("IP Server :");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_1.setBounds(62, 169, 96, 38);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("127.0.0.1");
		textField.setFont(new Font("Arial", Font.PLAIN, 17));
		textField.setBounds(168, 176, 96, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton ConnectBtn = new JButton("Connect");
		ConnectBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectBtn_clic(e);


				
			}
		});
		ConnectBtn.setFont(new Font("Arial", Font.BOLD, 17));
		ConnectBtn.setBounds(394, 169, 194, 32);
		contentPane.add(ConnectBtn);
		
		JButton ExitBtn = new JButton("Exit");
		ExitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ExitBtn.setFont(new Font("Arial", Font.BOLD, 17));
		ExitBtn.setBounds(394, 226, 194, 33);
		contentPane.add(ExitBtn);
	}
}
