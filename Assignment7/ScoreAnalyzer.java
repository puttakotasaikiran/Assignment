package Assignment7;

import java.util.*;
public class ScoreAnalyzer {
	private LinkedList<Integer> runsData=new LinkedList();
	public ScoreAnalyzer(LinkedList<Integer>runsData) {
		super();
		this.runsData=runsData;
	}
	public ScoreAnalyzer() {
		
	}
	void addRunsToList(int runs) {
		runsData.add(runs);
	}
	double calRunRate() {
		int sum=0;
		for(int i=0;i<runsData.size();i++) {
			sum+=runsData.get(i);
		}
		return sum/50;
	}
	int lowestRunsScored() {
		return Collections.min(runsData);
	}
	void displayRuns() {
		for(int i:runsData) {
			System.out.print((runsData.indexOf(i)+1)+"-"+i+"\t");
		}
	}
}
