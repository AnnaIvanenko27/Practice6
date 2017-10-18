package ua.nure.ivanenko.Practice6.part6;

/* Develop a console application that analyzes the text. 
 * The format of the input parameters of the application 
 * command line (the program should understand both short 
 * and long options):
 * -i (or --input) path to the input file;
 * -t (or --task) the name of the subtask.
 * 
 * Tasks:
 * 1. frequency:  
 * find the three words that occur most often in the input file, 
 * and print them sorted alphabetically in reverse order 
 * in the format: word ==> frequency.
 * 
 * 2. length:
 * In the input file, find the three longest words and print them 
 * in the format: word ==> number of letters in the word. 
 * The list should be sorted in descending order of the number 
 * of letters in the word.
 * 
 * 3. duplicates:
 * In the input file, find the first three words that have duplicates, 
 * and print their inversion in the upper case.
 */

import java.util.regex.*;

public class Part6 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("(?iU)(^((--input)|(-i))\\s(\\w+.txt)\\s(--task|-t)\\s(.*))");
		Matcher matcher = pattern.matcher(args[0]);
		
		while(matcher.find()) {
			Task taskName = Task.valueOf(matcher.group(7).toUpperCase());
			Task.doTask(matcher.group(5), taskName);
		}
	}
}
