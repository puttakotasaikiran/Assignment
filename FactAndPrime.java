import java.util.Scanner;
public class FactAndPrime
{
public static void main(String[] args)
{
	int fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the factorial digit");
int n=sc.nextInt();
while(n>0)
{
fact=fact*n;
n--;
}
System.out.println("the factorial is :" +fact);
int temp=0;
for(int i=2;i<=fact-1;i++)
{
	if(fact%i==0)
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
