package Assignment5;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
/*2 – Encapsulation & Inheritance
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