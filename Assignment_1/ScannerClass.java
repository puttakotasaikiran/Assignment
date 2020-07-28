import java.util.Scanner;
public class ScannerClass
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the rollno");
	int rollno=sc.nextInt();
	
	System.out.println("enter the name");
	String name=sc.next();
	System.out.println("enter the fee");
	double fee=sc.nextDouble();
System.out.println("Rollno:" + rollno +" name:" + name +" fee:" +fee);
sc.close();
}
}
