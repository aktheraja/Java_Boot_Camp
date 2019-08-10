package jdbcdemo;


public class Tool {

	private int id;
	private String name;
	private int quantity;
	private double price;
	private int supplierID;
	
	public Tool(int id, String name, int quantity, double price, int supplierID)
	{
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.supplierID = supplierID;
	}
	
	public int getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getSupplierID()
	{
		return supplierID;
	}
	
	public String toString()
	{
		String tool = this.id + " " + this.name + " " + this.quantity + " " + this.price + " " + this.supplierID;
		return tool;
	}
}
