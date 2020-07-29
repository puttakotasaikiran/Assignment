package Assignment6;

public class ExceptionTest {

	public ExceptionTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		try {
		if(args.length==0)
        {
        System.out.println("Input not recieved");
        }
		else
        {
			a=Integer.parseInt(args[0])/Integer.parseInt(args[1]);
		}
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Division with zero is not possible");
		}
		catch(NumberFormatException ex)
		{
		       System.out.print("Only integers are allowed");
		}

		System.out.println("result:"+a);
	}
}