package jdbcdemo;

public class Tool {
	private int ID;
	private String firstName;
	private String lastName;
	private String address;
	private String postalCode;
	private String phoneNumber;
	private String clientType;

	public Tool(String firstName, String lastName, String address, String postalCode, String phoneNumber,String clientType) {
//		this((Integer) null, firstName, lastName, address, postalCode, phoneNumber, clientType);
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.postalCode = postalCode;
		this.phoneNumber = phoneNumber;
		this.clientType = clientType;
	}

	public Tool(int ID, String firstName, String lastName, String address, String postalCode, String phoneNumber,String clientType) {
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.postalCode = postalCode;
		this.phoneNumber = phoneNumber;
		this.clientType = clientType;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getClientType() {
		return clientType;
	}

	public int getID() {
		return ID;
	}

	public String toString() {
		String tool = this.ID + " " + this.firstName + " " + this.lastName + " " + this.address + " " + this.postalCode
				+ " " + this.phoneNumber + " " + this.clientType;
		return tool;
	}
}
