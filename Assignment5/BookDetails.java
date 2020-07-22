package Assignment5;
import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		Book ob=new Book();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book No :");
		ob.setBookNo(sc.nextInt());
	    sc.nextLine();
		System.out.println("Enter Title :");
		ob.setTitle(sc.nextLine());
		System.out.println("Enter Author");
		ob.setAuthor(sc.nextLine());
		System.out.println("Enter Price");
		ob.setPrice(sc.nextFloat());
		
		System.out.println("Book No :"+ob.getBookNo());
		System.out.println("Title : "+ob.getTitle());
		System.out.println("Author :"+ob.getAuthor());
		System.out.println("Price :"+ob.getPrice());
		EngineeringBook ob1=new EngineeringBook();
		
		System.out.println("Enter Book No :");
		ob1.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Book Category :");
		ob1.setCategory(sc.nextLine());
		System.out.println("Enter Title :");
		ob1.setTitle(sc.nextLine());
		System.out.println("Enter Author");
		ob1.setAuthor(sc.nextLine());
		System.out.println("Enter Price");
		ob1.setPrice(sc.nextFloat());
		System.out.println("Book No :"+ob1.getBookNo());
		System.out.println("Book Category :"+ob1.getCategory());
		System.out.println("Title : "+ob1.getTitle());
		System.out.println("Author :"+ob1.getAuthor());
		System.out.println("Price :"+ob1.getPrice());
		sc.close();
	}

}/*2 – Encapsulation & Inheritance
a)	Create a class Book which has following members:
	private int bookNo
private String title
private String author
private float price
	Provide getter and setter methods for all the instance variables.
Create a class BookDetails which has the main method. Create an object of the Book class.  Initialize the object by reading inputs for the fields from the user. 

b)	Extend the Book class to create a class EngineeringBook derived from Book with an additional attribute
		private String category 	
Provide setter and getter methods for type instance variable.
Create an object of the EngineeringBook class  and test.
*/