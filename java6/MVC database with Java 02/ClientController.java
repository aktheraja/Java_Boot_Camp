package jdbcdemo;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.xml.soap.Node;

import com.mysql.fabric.xmlrpc.base.Array;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientController {
	ClientManagementSystem view;
	ClientModel model;

	public ClientController(ClientManagementSystem v, ClientModel m) {
		view = v;
		model = m;
//		Listener for to save fields into the database
		view.registerAddListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
//				System.out.println(view.Field7());
				model.ClientModel();
				System.out.println(view.Field7());
				System.out.println(view.Field2().getText());
				model.addItem(new Tool(view.Field2().getText(), view.Field3().getText(), view.Field4().getText(),
						view.Field5().getText(), view.Field6().getText(), view.Field7()));
			}

		});
//		Listener for to retrieve vaues form the database 
		view.registerAddListener1(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (view.radio1().isSelected()) {
					model.ClientModel();
					List<Tool> tol = model.searchTool(Integer.parseInt(view.Field8().getText()));
					Array[] row = new Array[3];
					DefaultListModel DLM = new DefaultListModel();
//					StringBuilder str =new StringBuilder();
					for (int i = 0; i < tol.size(); i++) {
						StringBuilder str = new StringBuilder();
						str.append(tol.get(i).getID());
						str.append("  ");
						str.append(tol.get(i).getLastName());
						str.append("  ");
						str.append(tol.get(i).getClientType());
						str.append("\n");
						DLM.addElement(str);
					}
					view.Field9().setModel(DLM);

				}
				if (view.radio2().isSelected()) {
					model.ClientModel();
					List<Tool> tol = model.searchTool1(view.Field8().getText());
//					tol.forEach((x) -> System.out.println(x));
					Array[] row = new Array[3];
					DefaultListModel DLM = new DefaultListModel();
					for (int i = 0; i < tol.size(); i++) {
						StringBuilder str = new StringBuilder();
						str.append(tol.get(i).getID());
						str.append("  ");
						str.append(tol.get(i).getLastName());
						str.append("  ");
						str.append(tol.get(i).getClientType());
						str.append("\n");
						DLM.addElement(str);
					}
					view.Field9().setModel(DLM);
				} else if (view.radio3().isSelected()) {
					model.ClientModel();
					List<Tool> tol = model.searchTool2(view.Field8().getText());
					Array[] row = new Array[3];
					DefaultListModel DLM = new DefaultListModel();

					for (int i = 0; i < tol.size(); i++) {
						StringBuilder str = new StringBuilder();
						str.append(tol.get(i).getID());
						str.append("  ");
						str.append(tol.get(i).getLastName());
						str.append("  ");
						str.append(tol.get(i).getClientType());
						str.append("\n");
						DLM.addElement(str);
					}
					view.Field9().setModel(DLM);
				}
			}
		});
//		Listener for to retrieve radio 
		view.registerAddListener2(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (view.radio1().isSelected())
					view.radio2().setSelected(false);
				view.radio3().setSelected(false);
			}
		});
//		Listener for to retrieve radio 
		view.registerAddListener3(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (view.radio2().isSelected())
					view.radio1().setSelected(false);
				view.radio3().setSelected(false);

			}
		});
		view.registerAddListener4(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (view.radio3().isSelected())
					view.radio1().setSelected(false);
				view.radio2().setSelected(false);

			}
		});
		view.registerAddListener5(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) {
					String[] s = view.Field9().getSelectedValue().toString().split(" ");
					List<Tool> tol = model.searchTool(Integer.parseInt(s[0]));
					for (int i = 0; i < tol.size(); i++) {
						view.Field1().setText(String.valueOf((tol.get(i).getID())));
						view.Field2().setText(tol.get(i).getFirstName());
						view.Field3().setText(tol.get(i).getLastName());
						view.Field4().setText(tol.get(i).getAddress());
						view.Field5().setText(tol.get(i).getPostalCode());
						view.Field6().setText(tol.get(i).getPhoneNumber());

					}
				}

			}
		});
		view.registerAddListener6(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> tr = new ArrayList<>();
				view.radio1().setSelected(false);
				view.radio2().setSelected(false);
				view.radio3().setSelected(false);
				view.Field8().setText(null);

			}
		});
		view.registerAddListener7(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				model.DeleteRow(Integer.parseInt(view.Field1().getText()));

			}
		});
		view.registerAddListener8(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.Field1().setText(null);
				view.Field2().setText(null);
				view.Field3().setText(null);
				view.Field4().setText(null);
				view.Field5().setText(null);
				view.Field6().setText(null);

			}

		});

	}

}
