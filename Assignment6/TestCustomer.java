package Assignment6;

import java.util.Scanner;

public class TestCustomer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter customer number:");
		String cno = sc.next();
		System.out.println("enter customer name:");
		String cname = sc.next();
		System.out.println("enter category:");
		String cgry = sc.next();
		Customer c1 = new Customer(cno,cname,cgry);
		if((cno.startsWith("C")||cno.startsWith("c"))){
			System.out.println("valid name");
		}
		else {
			throw new Nameexception("error in name");
		}
		if(cname.length()>=4) {
			System.out.println("valid length");
		}
		else {
			throw new Lengthexception("error in length");
		}
		if((cgry.equals("Gold")||cgry.equals("Platinum")||cgry.equals("Silver"))) {
			System.out.println("valid category");
		}
		else
		{
			throw new CategoryException("error in length");
		}
		}
		catch(Nameexception n)
		{
			System.out.println(n);
		}
		catch(Lengthexception l)
		{
			System.out.println(l);
		}
		catch(CategoryException c)
		{
			System.out.println(c);
		}	
	}

}