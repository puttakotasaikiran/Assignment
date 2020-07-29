package Assignment8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProverbCollection {
	static void storeProverb(String str) throws IOException {


		BufferedWriter out = new BufferedWriter(new FileWriter("TopProverbs.txt",true));
			out.write(str);
			out.newLine();
			out.flush();
			out.close();
		
	}

	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		String st = "";
		while (true) {
			System.out.println("Enter Proverb or exit to Exit");
			st = scan.nextLine();
			if (st.equals("exit")) {
				break;
			} else {
				storeProverb(st);
			}

		}
		scan.close();
	}

}