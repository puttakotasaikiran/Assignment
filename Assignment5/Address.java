package Assignment5;

public class Address {
	private String addressLine;
	private String city;
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	String getAddressDetails()
	{	
		return(this.addressLine+","+this.city);
	}
	}
/*1 – Aggregation and Encapsulation
Create a class named Address with following private member variables
•	addressLine of type String
•	city of type String

•	Create a parameterized constructor. Include Getters and setters.
•	Include method getAddressDetails() which returns a String with address details in below format
Ist Main HSR Layout, Bangalore

Create a class Customer with following private member variables
•	customerName of type String
•	residentialAddress of type Address (HAS –A relation)

Include a default constructor
Create parameterized constructor which takes 2 parameters and initialize member variables
Include Getters and Setters.
Create method getCustomerDetails which returns a String with Customer details in below format
Customer : John
Residential Address : Ist Main HSR Layout, Bangalore

Create a class TestCustomer with a main method
•	Create an object of Customer with default constructor. Use setters to assign values to the member variables. Display the values of member variables using getters.
•	Create an object of Customer using parameterized constructor and display all the details of the customer using getCustomerDetails method
*/