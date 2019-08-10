package jdbcdemo;

import java.awt.EventQueue;
import javax.xml.soap.Node;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JList;

public class ClientManagementSystem {

	private JFrame frame;;

	private JTextField textField_1 = new JTextField();
	private JTextField textField_2 = new JTextField();
	private JTextField textField_3 = new JTextField();
	private JTextField textField_4 = new JTextField();
	private JTextField textField_5 = new JTextField();
	private JTextField textField_6 = new JTextField();
	private JTextField textField_7 = new JTextField();;
	JButton btnSave = new JButton("Save");
	private JTextField textField;
	JComboBox comboBox = new JComboBox();
	JRadioButton rdbtnClientId = new JRadioButton("Client ID");
	JRadioButton rdbtnLastName = new JRadioButton("Last Name");
	JRadioButton rdbtnClientType = new JRadioButton("Client Type");
	JButton btnSeacrh_1 = new JButton("Search");
	JScrollPane scrollPane_1 = new JScrollPane();
	JList list = new JList();
	JButton btnNewButton = new JButton("Clear Search");
	JButton btnDelete = new JButton("Delete");
	JButton btnClear = new JButton("Clear");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientManagementSystem view = new ClientManagementSystem();
					ClientModel model = new ClientModel();
					ClientController controller = new ClientController(view, model);
					view.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClientManagementSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 864, 683);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 848, 24);
		frame.getContentPane().add(panel);

		JLabel lblClientManagementSystem = new JLabel("Client Management System");
		lblClientManagementSystem.setForeground(Color.WHITE);
		lblClientManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblClientManagementSystem);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(0, 24, 405, 253);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblSeacrhClients = new JLabel("Seacrh Clients");
		lblSeacrhClients.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSeacrhClients.setBounds(141, 28, 99, 14);
		panel_1.add(lblSeacrhClients);

		rdbtnClientId.setBackground(SystemColor.inactiveCaption);
		rdbtnClientId.setBounds(21, 74, 109, 23);
		panel_1.add(rdbtnClientId);

		rdbtnLastName.setBackground(SystemColor.inactiveCaption);
		rdbtnLastName.setBounds(21, 109, 109, 23);
		panel_1.add(rdbtnLastName);

		rdbtnClientType.setBackground(SystemColor.inactiveCaption);
		rdbtnClientType.setBounds(21, 147, 109, 23);
		panel_1.add(rdbtnClientType);

		JLabel lblSelectTypeOf = new JLabel("Select type of search to be performed");
		lblSelectTypeOf.setBounds(10, 53, 231, 14);
		panel_1.add(lblSelectTypeOf);

		JLabel lblEnterTheSearch = new JLabel("Enter the Search parameter below");
		lblEnterTheSearch.setBounds(21, 194, 206, 14);
		panel_1.add(lblEnterTheSearch);
		lblEnterTheSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_7.setBounds(10, 219, 161, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		btnSeacrh_1.setBounds(184, 219, 89, 23);
		panel_1.add(btnSeacrh_1);

		btnSeacrh_1.setBackground(SystemColor.inactiveCaptionBorder);

		btnNewButton.setBounds(296, 218, 99, 23);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
//		textField.setText("ths is syu");

		textField_1.setBounds(633, 90, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblClientId = new JLabel("Client ID");
		lblClientId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClientId.setBounds(563, 93, 74, 14);
		frame.getContentPane().add(lblClientId);

		textField_2.setBounds(633, 143, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFirstName.setBounds(563, 146, 74, 14);
		frame.getContentPane().add(lblFirstName);

		textField_3.setBounds(633, 199, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLastName.setBounds(563, 202, 74, 14);
		frame.getContentPane().add(lblLastName);

		textField_4.setBounds(633, 257, 148, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddress.setBounds(563, 260, 58, 14);
		frame.getContentPane().add(lblAddress);

		JLabel lblClientInformation = new JLabel("Client Information");
		lblClientInformation.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClientInformation.setBounds(575, 35, 129, 14);
		frame.getContentPane().add(lblClientInformation);

		textField_5.setColumns(10);
		textField_5.setBounds(633, 323, 148, 20);
		frame.getContentPane().add(textField_5);

		JLabel lblPostalCode = new JLabel("Postal Code");
		lblPostalCode.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPostalCode.setBounds(551, 326, 86, 14);
		frame.getContentPane().add(lblPostalCode);

		textField_6.setColumns(10);
		textField_6.setBounds(633, 400, 148, 20);
		frame.getContentPane().add(textField_6);

		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhoneNumber.setBounds(539, 403, 98, 14);
		frame.getContentPane().add(lblPhoneNumber);

		textField = new JTextField();
		textField.setBounds(0, 310, 405, 405);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane(textField);
		scrollPane.setBounds(400, 310, -10, 394);
		frame.getContentPane().add(scrollPane);

		comboBox.setBounds(646, 483, 58, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("select item");
		comboBox.addItem("R");
		comboBox.addItem("C");

		JLabel lblClientType = new JLabel("Client Type");
		lblClientType.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClientType.setBounds(551, 486, 70, 14);
		frame.getContentPane().add(lblClientType);

		btnSave.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSave.setBounds(443, 563, 89, 23);
		frame.getContentPane().add(btnSave);

		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBounds(575, 563, 89, 23);
		frame.getContentPane().add(btnDelete);

		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setBounds(705, 563, 89, 23);
		frame.getContentPane().add(btnClear);

		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(0, 275, 405, 371);
		frame.getContentPane().add(scrollPane_1);

		scrollPane_1.setViewportView(list);
	}

	public JTextField Field1() {
		return textField_1;
	}

	public JTextField Field2() {
		return textField_2;
	}

	public JTextField Field3() {
		return textField_3;
	}

	public JTextField Field4() {
		return textField_4;
	}

	public JTextField Field5() {
		return textField_5;
	}

	public JTextField Field6() {
		return textField_6;
	}

	public JTextField Field8() {
		return textField_7;
	}

	public String Field7() {
		return comboBox.getSelectedItem().toString();
	}

	public void registerAddListener(ActionListener actionListener) {
		btnSave.addActionListener(actionListener);
	}

	public void registerAddListener1(ActionListener actionListener) {
		btnSeacrh_1.addActionListener(actionListener);
	}

	public void registerAddListener7(ActionListener actionListener) {
		btnDelete.addActionListener(actionListener);
	}

	public JButton getSearch() {
		return btnSeacrh_1;
	}

	public JButton getDelete() {
		return btnDelete;
	}

	public JButton getClear() {
		return btnClear;
	}

	public void registerAddListener8(ActionListener actionListener) {
		btnClear.addActionListener(actionListener);
	}

	public void registerAddListener2(ActionListener actionListener) {
		rdbtnClientId.addActionListener(actionListener);
	}

	public void registerAddListener3(ActionListener actionListener) {
		rdbtnLastName.addActionListener(actionListener);
	}

	public void registerAddListener4(ActionListener actionListener) {
		rdbtnClientType.addActionListener(actionListener);
	}

	public void registerAddListener5(MouseListener e) {
		list.addMouseListener(e);
	}

	public void registerAddListener6(ActionListener actionListener) {
		btnNewButton.addActionListener(actionListener);
	}

	public JRadioButton radio1() {
		return rdbtnClientId;
	}

	public JRadioButton radio2() {
		return rdbtnLastName;
	}

	public JRadioButton radio3() {
		return rdbtnClientType;
	}

	public JList Field9() {
		return list;
	}
}
