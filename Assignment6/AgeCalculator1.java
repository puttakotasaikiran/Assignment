package Assignment6;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AgeCalculator1 {
	public static int calculateAge(String str)
	{
		int age=0;
		int y1=Character.getNumericValue(str.charAt(6));
		int y2=Character.getNumericValue(str.charAt(7));
		int y3=Character.getNumericValue(str.charAt(8));
		int y4=Character.getNumericValue(str.charAt(9));
		int year=y1*1000+y2*100+y3*10+y4;
		age=2020-year;
		return age;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dob");
		String dob=sc.nextLine();
		sc.close();
		//Pattern p = Pattern.compile("\\d{2}/\\d{2}\\/d{4}");
		try
		{
		if(dob.matches("\\d{2}/\\d{2}/\\d{4}"))
		{
			System.out.println(calculateAge(dob));	
		}
		else
			throw new FormatException("enter the correct format");
		}
		catch(FormatException e)
		{
			System.out.println(e);
		}

}
}