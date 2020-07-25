package Assignment7;
import java.io.*;
import java.util.*;
public class StudentMarks {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents=scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<Integer>(numberOfStudents);
		System.out.println("Enter Students Marks Into An ArrayList:");
		for(int i=0;i<numberOfStudents;i++) {
			arrayList.add(scanner.nextInt());
		}
		int highestMarks=Collections.max(arrayList);
		System.out.println("Highest Marks : "+highestMarks);
		double sum=0;
		for(int i=0;i<arrayList.size();i++) {
			sum=sum+arrayList.get(i);
		}
		System.out.println("Sum Of Marks : "+sum);
		double average = sum/numberOfStudents;
		System.out.println("Average Marks : "+average);
		System.out.println("Marks : ");
		for(int i=0;i<arrayList.size();i++){
			System.out.print((i+1)+"-"+arrayList.get(i)+"\t");
		}
		System.out.println();
		System.out.println("3rd Student Marks: "+arrayList.get(2));
		Collections.sort(arrayList);
		System.out.println("sorted Marks are : ");
		for(int i=0;i<arrayList.size();i++){
			System.out.print((i+1)+"-"+arrayList.get(i)+"\t");
		}
	}
}

/*1 – Student Marks
Create a Class StudentMarks with a main method. Use Scanner to accept marks scored by Students.

Add the marks to an ArrayList. (two or m"ore students can have the same marks)
Display the highest mark scored by the student.
Display the Average marks scored by the Students
Display the marks stored by the 3rd Student
Sort the marks and display the marks using Iterator.

Sample Input
Enter number of Students
4
Enter Marks
40 60 60 50 

Sample Output
Highest Marks : 60
Average Marks : 52.5
Marks 	: 1-40 2-60 3-60 4-50
3rd Student marks : 60
Sorted 	: 1-40 2-50 3-60 4-60*/