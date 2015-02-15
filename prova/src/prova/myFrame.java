package prova;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class myFrame {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myFrame window = new myFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmIt = new JMenuItem("it1");
		mntmIt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "has clickat menu");
			}
		});
		mnNewMenu.add(mntmIt);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(70, 31, 46, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPlayers = new JLabel("Players");
		lblPlayers.setBounds(10, 34, 46, 14);
		frame.getContentPane().add(lblPlayers);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(10, 111, 89, 23);
		frame.getContentPane().add(btnStart);
		
		textField_2 = new JTextField();
		textField_2.setBounds(70, 62, 46, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPlaying = new JLabel("Playing");
		lblPlaying.setBounds(10, 67, 46, 14);
		frame.getContentPane().add(lblPlaying);
		
		JLabel lblGames = new JLabel("Games");
		lblGames.setBounds(137, 65, 46, 14);
		frame.getContentPane().add(lblGames);
		
		JLabel lblFinished = new JLabel("Finished");
		lblFinished.setBounds(235, 34, 46, 14);
		frame.getContentPane().add(lblFinished);
		
		JLabel lblInGame = new JLabel("In game");
		lblInGame.setBounds(179, 34, 46, 14);
		frame.getContentPane().add(lblInGame);
		
		textField_3 = new JTextField();
		textField_3.setBounds(174, 62, 46, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(235, 62, 57, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
	
		
	}
}
