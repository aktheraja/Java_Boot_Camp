import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

class MyListener implements ActionListener{
private MyFrame frame;
BinSearchTree treeSearch ;
public MyListener(MyFrame jf) {
	frame = jf;
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource()==frame.createB) {
		try {
			treeSearch=frame.Compli();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}else if (e.getSource()==frame.browseB){
		frame.Browse();

	
	// TODO Auto-generated method stub
	
}else if (e.getSource()==frame.insertB) {
	InsertNewNode tree =new InsertNewNode(treeSearch);
	frame.Browse();
	
	
	
	
//	try {treeSearch.print_tree(treeSearch.root,  new PrintWriter((new FileWriter("input.txt",true))));}
//	catch(IOException e1) {
//		e1.printStackTrace();
//	}
	
}else if (e.getSource()==frame.findB) {
	String num=JOptionPane.showInputDialog("Enter an ID");
	
	Node x =treeSearch.find(treeSearch.root, num);
	if (x==null) {
	String	s= "student not found";
	JOptionPane.showMessageDialog(null, s);
	}else if (x!=null){
		 String s=("id : " + x.data.id + " faculty: " + x.data.faculty + " major: " + x.data.major + 
					" year: " + x.data.year);;
		 JOptionPane.showMessageDialog(null, s);
	}
}

}
}