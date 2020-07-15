import java.util.Scanner;
public class Number_To_Word
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
String word[]=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
System.out.println(word[num]);
}
}