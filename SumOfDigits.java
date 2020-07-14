import java.util.Scanner;
public class SumOfDigits
{
public static void main(String[] args)
{
	int num,add=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the digit");
int n=sc.nextInt();

while(n>0)
{
num=n%10;
add=add+num;
n=n/10;
}
System.out.println("The sum of digits is :" +add);
}
}
