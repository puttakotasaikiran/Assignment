package Assignment7;

import java.util.*;
public class TestScoreAnalyzer {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		ScoreAnalyzer scoreAnalyzer=new ScoreAnalyzer();
		System.out.print("Enter the Number of Players: ");
		int players=scanner.nextInt();
		System.out.println("Enter the runs scored by batsman: ");
		for(int i=0;i<players;i++) {
			scoreAnalyzer.addRunsToList(scanner.nextInt());
		}
		scoreAnalyzer.displayRuns();
		System.out.println();
		System.out.println("Runrate : "+scoreAnalyzer.calRunRate());
		System.out.println("Lowest runs scored : "+scoreAnalyzer.lowestRunsScored());
		System.out.println("Count of Players who batted : "+players);
	}
}
