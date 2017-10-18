package ua.nure.ivanenko.Practice6.part1;

/* Develop an application that reads text from the console input 
 * and outputs words in the order the decrease in their frequency 
 * of occurrence in the text (if the frequencies are equals then  
 * order have to be lexicographic). Use the OOP approach.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part1 {
	public static final String ENCODING = "Cp1251";
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, ENCODING));
		String text = reader.readLine();
		WordContainer wc = new WordContainer();
		if (text != null) {
			for (String word : text.split(" ")) {
				wc.add(word);
			}
		}
		wc.print();
	}

}
