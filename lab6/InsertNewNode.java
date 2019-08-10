import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsertNewNode {
	BinSearchTree treeSearch1;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblEnterStudentsMajor;
	private JTextField textField_3;
	private JLabel lblEnterYear;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					InsertNewNode window = new InsertNewNode();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
//	public InsertNewNode() {
//		initialize();
//	}
	public InsertNewNode(BinSearchTree treeSearch ) {
		treeSearch1=treeSearch;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 165);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the Student ID");
		lblNewLabel.setBounds(41, 8, 100, 14);
		panel.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 5, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(320, 5, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEnterFaculty = new JLabel("Enter Faculty");
		lblEnterFaculty.setBounds(246, 8, 64, 14);
		panel.add(lblEnterFaculty);
		
		lblEnterStudentsMajor = new JLabel("Enter Student's Major");
		lblEnterStudentsMajor.setBounds(6, 33, 104, 14);
		panel.add(lblEnterStudentsMajor);
		
		textField = new JTextField();
		textField.setBounds(115, 30, 166, 20);
		panel.add(textField);
		textField.setColumns(20);
		
		lblEnterYear = new JLabel("Enter year");
		lblEnterYear.setBounds(286, 33, 51, 14);
		panel.add(lblEnterYear);
		
		textField_3 = new JTextField();
		textField_3.setBounds(342, 30, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnInsert = new JButton("insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				treeSearch1.insert(textField_2.getText(),textField_1.getText(),textField.getText(),textField_3.getText());
			}
		});
		btnInsert.setBounds(85, 78, 89, 23);
		panel.add(btnInsert);
		
		JButton btnReturnToMain = new JButton("Return to Main Window");
		btnReturnToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnReturnToMain.setBounds(195, 78, 211, 23);
		panel.add(btnReturnToMain);
		frame.setVisible(true);
	}
}
