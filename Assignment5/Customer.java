package Assignment5;

public class Customer {
	private String customerName;
	Address resendialAddress=new Address() ;
	public Customer(String customerName,String addressLine,String city) {
		this.customerName = customerName;
		getResendialAddress().setAddressLine(addressLine);
		getResendialAddress().setCity(city);

	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	String getCustomerDetails()
	{
		
		return("Customer :  "+this.customerName+"\n"+"Resendial Address :  "+getResendialAddress().getAddressDetails());
	}
	public Address getResendialAddress() {
		return resendialAddress;
	}
	public void setResendialAddress(Address resendialAddress) {
		this.resendialAddress = resendialAddress;
	}

	}	

/*Create a class Customer with following private member variables
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