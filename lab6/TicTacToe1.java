import java.awt.EventQueue;


import javax.swing.JFrame;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class TicTacToe1 extends JFrame{

	JFrame frame;
	 JTextField textField;
	JTextField textField_1;
	JTextField textField_2;
	String startGame= "X";
	int XCount = 0;
	int OCount= 0;
	JTextField textField_3;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe1 window = new TicTacToe1();
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
	public TicTacToe1() {
		initialize();
		
	
		
	}
public void gameScore() {
	textField.setText(String.valueOf(XCount++));
	textField_3.setText(String.valueOf(OCount++));
//	textField.setVisible(true);
//textField_3.setVisible(true);
}
public void choosePlayer()
{
	if (startGame.equalsIgnoreCase("X")) {
		startGame = "0";
		
	}else {
		startGame = "X";
	}
	}


/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(93, 202, 42, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPlayer = new JLabel("XPlayer");
		lblPlayer.setBounds(34, 205, 46, 14);
		frame.getContentPane().add(lblPlayer);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 230, 170, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(34, 233, 59, 14);
		frame.getContentPane().add(lblUserName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(261, 35, 148, 145);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblMessageWindow = new JLabel("Message Window");
		lblMessageWindow.setBounds(261, 11, 102, 14);
		frame.getContentPane().add(lblMessageWindow);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(168, 11, 65, 65);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn3.setForeground(Color.RED);
				}else {
					btn3.setForeground(Color.BLUE);
				}
				choosePlayer();
				winningGame();
				
			}
		});
		panel_2.add(btn3, BorderLayout.CENTER);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(194, 202, 42, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblPlayer_1 = new JLabel("OPlayer");
		lblPlayer_1.setBounds(152, 205, 46, 14);
		frame.getContentPane().add(lblPlayer_1);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_9.setBounds(168, 75, 65, 65);
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn6.setForeground(Color.RED);
				}else {
					btn6.setForeground(Color.BLUE);
				}choosePlayer();
				winningGame();
				
			}
		});
		panel_9.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_10.setBounds(168, 137, 65, 65);
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn9.setForeground(Color.RED);
				}else {
					btn9.setForeground(Color.BLUE);
				}choosePlayer();
				winningGame();
				
			}
		});
		panel_10.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_11.setBounds(105, 11, 65, 65);
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		panel_11.add(btn2, BorderLayout.CENTER);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn2.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn2.setForeground(Color.RED);
				}else {
					btn2.setForeground(Color.BLUE);
				}choosePlayer();
				winningGame();
				
			}
		});
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(105, 75, 65, 65);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn5.setForeground(Color.RED);
				}else {
					btn5.setForeground(Color.BLUE);
				}choosePlayer();
				winningGame();
				
			}
		});
		panel_5.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_6.setBounds(105, 137, 65, 65);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn8.setForeground(Color.RED);
				}else {
					btn8.setForeground(Color.BLUE);
				}choosePlayer();
				winningGame();
				
			}
		});
		panel_6.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_12.setBounds(43, 11, 65, 65);
		frame.getContentPane().add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		
		JButton btn1 = new JButton("");
		panel_12.add(btn1, BorderLayout.CENTER);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn1.setForeground(Color.RED);
				}else {
					btn1.setForeground(Color.BLUE);
				}choosePlayer();
				winningGame();

			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(43, 75, 65, 65);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		panel.add(btn4, BorderLayout.CENTER);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn4.setForeground(Color.RED);
				}else {
					btn4.setForeground(Color.BLUE);
				}choosePlayer();
				winningGame();
				
				
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(43, 137, 65, 65);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		panel_1.add(btn7, BorderLayout.CENTER);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(422, 30, -16, 82);
		frame.getContentPane().add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(407, 35, -10, 145);
		frame.getContentPane().add(scrollPane);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn7.setForeground(Color.RED);
				}else {
					btn7.setForeground(Color.BLUE);
				}choosePlayer();
				winningGame();
				
			}
		});
	}public void winningGame() {
		String b1 = btn1.getText();
		System.out.println(b1);
		
		String b2 = btn2.getText();
		String b3 = btn3.getText();
		String b4 = btn4.getText();
		String b5 = btn5.getText();
		String b6 = btn6.getText();
		String b7 = btn7.getText();
		String b8 = btn8.getText();
		String b9 = btn9.getText();
		
		if (b1==("X")&& b2==("X")&&b3==("X")){
			JOptionPane.showMessageDialog(textField_3, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			XCount++;
			gameScore();
		}
		if (b4==("X")&& b5==("X")&&b6==("X")){
			JOptionPane.showMessageDialog(textField_3, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			XCount++;
			gameScore();}
		if (b7==("X")&& b8==("X")&&b9==("X")){
			JOptionPane.showMessageDialog(textField_3, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			XCount++;
			gameScore();}
		if (b1==("X")&& b4==("X")&&b7==("X")){
			JOptionPane.showMessageDialog(textField_3, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			XCount++;
			gameScore();}
		if (b2==("X")&& b5==("X")&&b8==("X")){
			JOptionPane.showMessageDialog(textField_3, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			XCount++;
			gameScore();}
		if (b3==("X")&& b6==("X")&&b9==("X")){
			JOptionPane.showMessageDialog(textField_3, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			XCount++;
			gameScore();}
		if (b1==("X")&& b5==("X")&&b9==("X")){
			JOptionPane.showMessageDialog(textField_3, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			XCount++;
			gameScore();}
		if (b3==("X")&& b5==("X")&&b7==("X")){
			JOptionPane.showMessageDialog(textField_3, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			XCount++;
			gameScore();}
		else {
			System.exit(OCount);
		}
		//////////////////////////////////////////Player 0
		if (b1==("O")&& b2==("O")&&b3==("O")){
			JOptionPane.showMessageDialog(textField_3, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			OCount++;
			gameScore();
		}
		if (b4==("O")&& b5==("O")&&b6==("O")){
			JOptionPane.showMessageDialog(textField_3, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			OCount++;
			gameScore();}
		if (b7==("O")&& b8==("O")&&b9==("O")){
			JOptionPane.showMessageDialog(textField_3, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			OCount++;
			gameScore();}
		if (b1==("O")&& b4==("O")&&b7==("O")){
			JOptionPane.showMessageDialog(textField_3, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			OCount++;
			gameScore();}
		if (b2==("O")&& b5==("O")&&b8==("O")){
			JOptionPane.showMessageDialog(textField_3, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			OCount++;
			gameScore();}
		if (b3==("O")&& b6==("O")&&b9==("O")){
			JOptionPane.showMessageDialog(textField_3, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			OCount++;
			gameScore();}
		if (b1==("O")&& b5==("O")&&b9==("O")){
			JOptionPane.showMessageDialog(textField_3, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			OCount++;
			gameScore();}
		if (b3==("O")&& b5==("O")&&b7==("O")){
			JOptionPane.showMessageDialog(textField_3, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			OCount++;
			gameScore();}
	}
}
