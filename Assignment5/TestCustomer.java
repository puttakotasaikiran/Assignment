package Assignment5;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ob1=new Customer();
		ob1.setCustomerName("John");
		ob1.resendialAddress.setAddressLine("Ist Main HSR Layout");
		ob1.resendialAddress.setCity("Bangalore");
		System.out.println(ob1.getCustomerDetails());
		
		
		Customer ob2=new Customer("John","Ist Main HSR Layout","Bangalore");
		System.out.println(ob2.getCustomerDetails());
		
		
	}
}
/*Create a class TestCustomer with a main method
•	Create an object of Customer with default constructor. Use setters to assign values to the member variables. Display the values of member variables using getters.
•	Create an object of Customer using parameterized constructor and display all the details of the customer using getCustomerDetails method
*/