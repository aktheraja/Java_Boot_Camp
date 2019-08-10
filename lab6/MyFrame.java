import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class MyFrame extends JFrame {
	JButton insertB,findB,browseB, createB;
	MyListener listener;
	JTextArea comp;
	JPanel panelButton, panelText;
	GridBagConstraints cGrid;
	JScrollPane scrol;
	StringWriter writer = new StringWriter();
	PrintWriter pwf =new PrintWriter(writer);
	BinSearchTree b= new BinSearchTree();
	public MyFrame(String s) {
		super(s);
		listener = new MyListener(this);
		panelButton = new JPanel ( new GridBagLayout() );
		panelText = new JPanel(new GridBagLayout() );
		insertB = new JButton ("insert");
		findB = new JButton("find");
		browseB= new JButton("Browse");
		createB = new JButton ("Create Tree From File");
		comp=new JTextArea(25,30);
		cGrid = new GridBagConstraints();
		scrol=new JScrollPane(comp);
		scrol.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrol.setVisible(true);
		panelText.add(scrol);
		
		
		insertB.addActionListener(listener);
		findB.addActionListener(listener);
		browseB.addActionListener(listener);
		createB.addActionListener(listener);
		
		cGrid.insets = new Insets(10,10,10,10);
		cGrid.gridx=0;
		cGrid.gridy= 0;
		//panelText.add(comp,cGrid);
		comp.setPreferredSize(new Dimension(2500,2000));
		
		cGrid.insets = new Insets (10,10,10,10);
		cGrid.gridx=0;
		cGrid.gridy= 1;
		panelButton.add(insertB,cGrid);
		insertB.setPreferredSize(new Dimension(80,50));
		
		
		cGrid.gridx=1;
		cGrid.gridy= 1;
		panelButton.add(findB,cGrid);
		findB.setPreferredSize(new Dimension(80,50));
		
		cGrid.gridx=2;
		cGrid.gridy= 1;
		panelButton.add(browseB,cGrid);
		browseB.setPreferredSize(new Dimension(80,50));
		
		cGrid.gridx=3;
		cGrid.gridy= 1;
		panelButton.add(createB,cGrid);
		createB.setPreferredSize(new Dimension(150,50));
		
		add(BorderLayout.CENTER,panelText);
		add(BorderLayout.SOUTH, panelButton);}
	/**
	 * @throws FileNotFoundException
	 */
	public BinSearchTree Compli() throws FileNotFoundException {
		
		String file = JOptionPane.showInputDialog(null, "enter file name","input.txt",JOptionPane.INFORMATION_MESSAGE);
		Scanner sc= new Scanner(new File(file));
		while(sc.hasNext()) {
			String id = sc.next();
			String Faculty = sc.next();
			String major= sc.next();
			String year = sc.next();
			b.insert(id, Faculty, major, year);
		}

		try {
			b.print_tree(b.root,pwf );
		}
		catch(IOException e) {
			e.printStackTrace();
		}
//		System.out.println(writer.toString());
		
	sc.close();return b;
		}
	public void Browse() {
		comp.setText(writer.toString());
	}
		
		
	
	public static void main(String args []) throws FileNotFoundException {
		MyFrame frame = new MyFrame ( "Student Record");
		frame.setSize(600,600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
//		

	}
		
	

}
