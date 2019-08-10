package jdbcdemo;

import javax.xml.soap.Node;

import java.awt.List;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClientModel {
	public Connection jdbc_connection;
	public PreparedStatement statement;
	public String databaseName = "InventoryDB", tableName = "ClientTable2", dataFile = "clients.txt";

	// Students should configure these variables for their own MySQL environment
	// If you have not created your first database in mySQL yet, you can leave the
	// "[DATABASE NAME]" blank to get a connection and create one with the
	// createDB() method.
	public String connectionInfo = "jdbc:mysql://localhost:3306/InventoryDB", login = "root", password = "student";

	public void ClientModel() {
		try {
			// If this throws an error, make sure you have added the mySQL connector JAR to
			// the project
			Class.forName("com.mysql.jdbc.Driver");

			// If this fails make sure your connectionInfo and login/password are correct
			jdbc_connection = DriverManager.getConnection(connectionInfo, login, password);
			System.out.println("Connected to: " + connectionInfo + "\n");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Use the jdbc connection to create a new database in MySQL.
	// (e.g. if you are connected to "jdbc:mysql://localhost:3306", the database
	// will be created at "jdbc:mysql://localhost:3306/InventoryDB")
	public void createDB() {
		try {
			statement = jdbc_connection.prepareStatement(databaseName);
			statement.executeUpdate("CREATE DATABASE " + databaseName);
			System.out.println("Created Database " + databaseName);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Create a data table inside of the database to hold tools
	public void createTable() {
		String sql = "CREATE TABLE " + tableName + "(" + "ID INT(4) NOT NULL AUTO_INCREMENT, "
				+ "FIRSTNAME VARCHAR(20) NOT NULL, " + "LASTNAME VARCHAR(20) NOT NULL, "
				+ "ADDRESS VARCHAR(50) NOT NULL, " + "POSTALCODE CHAR(7) NOT NULL, " + "PHONENUMBER CHAR(12) NOT NULL,"
				+ "CLIENTTYPE CHAR(1) NOT NULL," + "PRIMARY KEY ( ID ))";

//				"CREATE TABLE   ClientTable1( id INT(4) NOT NULL AUTO_INCREMENT, FIRSNAME VARCHAR(20) NOT NULL,LASTNAME varchar(20) NOT NULL, ADDRESS varchar(20) NOT NULL,  POSTALCODE char(7) NOT NULL,  PHONENUMBER char(12) NOT NULL, CLIENTYPE char(1) NOT NULL, PRIMARY KEY (id))";

		try {
			statement = jdbc_connection.prepareStatement(tableName);
			statement.executeUpdate(sql);
			System.out.println("Created Table " + tableName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Removes the data table from the database (and all the data held within it!)
	public void removeTable() {
		String sql = "DROP TABLE " + tableName;
		try {
			statement = jdbc_connection.prepareStatement(tableName);
			statement.executeUpdate(sql);
			System.out.println("Removed Table " + tableName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Fills the data table with all the tools from the text file 'items.txt' if
	// found
	public void fillTable() {
		try {
			Scanner sc = new Scanner(new FileReader(dataFile));
			while (sc.hasNext()) {
				String toolInfo[] = sc.nextLine().split(";");
				addItem(new Tool(toolInfo[0], toolInfo[1], toolInfo[2], toolInfo[3], toolInfo[4], toolInfo[5]));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println("File " + dataFile + " Not Found!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Add a tool to the database table
	public void addItem(Tool tool) {
		String sql = "INSERT INTO " + tableName
				+ " (FIRSTNAME, LASTNAME, ADDRESS, POSTALCODE, PHONENUMBER, CLIENTTYPE) VALUES (?,?,?,?,?,?)";
//		String sql = "INSERT INTO " + tableName + " (FIRSTNAME, LASTNAME, ADDRESS, POSTALCODE, PHONENUMBER, CLIENTTYPE) VALUES (tool.getFIRSTNAME(), tool.getLASTNAME(),tool.getADDRESS(), tool.getPOSTALCODE(), tool.getPHONENUMBER(), tool.getCLIENTTYPE())";
//		String sql = "INSERT INTO  ClientTable1( firstName, LastName ,Address ,postalcod ,phoneNumber,clientype) VALUES (?,?,?,?,?,?)";
		try {

			statement = jdbc_connection.prepareStatement(sql);
			statement.setString(1, tool.getFirstName());
			statement.setString(2, tool.getLastName());
			statement.setString(3, tool.getAddress());
			statement.setString(4, tool.getPostalCode());
			statement.setString(5, tool.getPhoneNumber());
			statement.setString(6, tool.getClientType());

			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// This method should search the database table for a tool matching the toolID
	// parameter and return that tool.
	// It should return null if no tools matching that ID are found.
	// this is the search method into the database for Id
	public ArrayList<Tool> searchTool(int client) {

		String sql = "SELECT * FROM " + tableName + " WHERE ID = ?";
		ResultSet tool;
		try {
			statement = jdbc_connection.prepareStatement(sql);
			statement.setInt(1, client);
			ArrayList<Tool> result = new ArrayList<>();
			tool = statement.executeQuery();
			while (tool.next()) {
				result.add(new Tool(tool.getInt("ID"), tool.getString("FIRSTNAME"), tool.getString("LASTNAME"),
						tool.getString("ADDRESS"), tool.getString("POSTALCODE"), tool.getString("PHONENUMBER"),
						tool.getString("CLIENTTYPE")));
			}
			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
// delete row where ID is passed
	public void DeleteRow(int client) {

		String sql = "DELETE FROM " + tableName + " WHERE ID = ?";
		ResultSet tool;
		try {
			statement = jdbc_connection.prepareStatement(sql);
			statement.setInt(1, client);
			statement.executeUpdate();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
// this is the search method into the database for lastname
	public ArrayList<Tool> searchTool1(String client) {

		String sql = "SELECT * FROM " + tableName + " WHERE LASTNAME = ?";
		ResultSet tool;
		try {
			statement = jdbc_connection.prepareStatement(sql);
			statement.setString(1, client);
			ArrayList<Tool> result = new ArrayList<>();
			tool = statement.executeQuery();
			while (tool.next()) {
				result.add(new Tool(tool.getInt("ID"), tool.getString("FIRSTNAME"), tool.getString("LASTNAME"),
						tool.getString("ADDRESS"), tool.getString("POSTALCODE"), tool.getString("PHONENUMBER"),
						tool.getString("CLIENTTYPE")));
			}

			System.out.println(result);
			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	// this is the search method into the database for clienttype
	public ArrayList<Tool> searchTool2(String client) {

		String sql = "SELECT * FROM " + tableName + " WHERE CLIENTTYPE = ?";
		ResultSet tool;
		try {
			statement = jdbc_connection.prepareStatement(sql);
			statement.setString(1, client);
			ArrayList<Tool> result = new ArrayList<>();
			tool = statement.executeQuery();
			while (tool.next()) {
				result.add(new Tool(tool.getInt("ID"), tool.getString("FIRSTNAME"), tool.getString("LASTNAME"),
						tool.getString("ADDRESS"), tool.getString("POSTALCODE"), tool.getString("PHONENUMBER"),
						tool.getString("CLIENTTYPE")));
			}
			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	// Prints all the items in the database to console
	public void printTable() {
		try {
			String sql = "SELECT * FROM " + tableName;
			statement = jdbc_connection.prepareStatement(dataFile);
			ResultSet tools = statement.executeQuery(sql);
			System.out.println("Tools:");
			while (tools.next()) {
				System.out.println(tools.getString("FIRSTNAME") + " " + tools.getString("LASTNAME") + " "
						+ tools.getString("ADDRESS") + " " + tools.getString("POSTALCODE") + " "
						+ tools.getString("PHONENUMBER") + " " + tools.getString("CLIENTTYPE"));
			}
			tools.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		ClientModel inventory = new ClientModel();

//		 You should comment this line out once the first database is created (either here or in MySQL workbench)
//	inventory.createDB();
		inventory.ClientModel();
		inventory.createTable();
////		
		System.out.println("\nFilling the table with tools");
		inventory.fillTable();

		System.out.println("Reading all tools from the table:");
		inventory.printTable();

		System.out.println("\nSearching table for tool 1002: should return 'Grommets'");
		int client = 12;
//		Tool searchResult = inventory.searchTool( client);
//		if(searchResult == null)
//			System.out.println("Search Failed to find a tool matching ID: " + client);
//		else
//			System.out.println("Search Result: " + searchResult.toString());

		System.out.println("\nSearching table for tool 9000: should fail to find a tool");
//		client = "C";
//		searchResult = inventory.searchTool(client);
//		if(searchResult == null)
//			System.out.println("Search Failed to find a tool matching ID: " + client);
//		else
//			System.out.println("Search Result: " + searchResult.toString());

		System.out.println("\nTrying to remove the table");
//inventory.removeTable();

		try {
			inventory.statement.close();
			inventory.jdbc_connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nThe program is finished running");
		}
	}
}
