package Assignment8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProverbReader {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("TopProverbs.txt"));
		String s;
		while ((s = in.readLine()) != null) {
			System.out.println(s);
		}
		in.close();
	}


}