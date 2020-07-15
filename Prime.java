import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int temp=0;
		int n=sc.nextInt();
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
			System.out.println("It is not a prime number");
			else
				System.out.println("It is a prime number");
		}
		

	}

