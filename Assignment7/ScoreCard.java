package Assignment7;
import java.util.*;
import java.io.*;

public class ScoreCard {

	private static final String String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> hm=new HashMap<String, Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Runs scored");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) 
			arr[i]=sc.nextInt();
			hm.put("Rahane", arr[0]);
			hm.put("Rahul", arr[1]);
			hm.put("Kohli", arr[2]);
			hm.put("Dhoni", arr[3]);
			hm.put("Lokesh", arr[4]);
			
			int max = 0, sum = 0;

			for (Map.Entry<String, Integer> me : hm.entrySet()) {
				System.out.print(me.getKey() + ":");
				System.out.println(me.getValue());
				if (max < me.getValue()) {
					max = me.getValue();
				}
				sum = sum + me.getValue();
			}
			System.out.println("The total Score is "+sum);
			System.out.println("The max run getter is");
			
			

		}
	}
/*3 – ScoreCard
Create a class ScoreCard with a main method to analyze the runs scored by batsmen of a team. The input data format is given below. The program needs to output as given below. Use a concrete class of Map to achieve the functionality.

Sample Input
-------------
Enter Runs Scored
Rahane-20 Rahul-30 Kohli-150 Dhoni-50 Lokesh-2


Sample Output
-------------
Players who batted
Dhoni
Kohli
Lokesh
Rahane
Rahul

Scores by Players
Dhoni : 50
Kohli : 150
Lokesh : 2
Rahane : 20
Rahul  : 30

Total Score : 202

Name of Highest Scorer : Kohli

Runs Scored by Dhoni : 50*/
