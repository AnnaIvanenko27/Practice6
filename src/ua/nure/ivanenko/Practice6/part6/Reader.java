package ua.nure.ivanenko.Practice6.part6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ua.nure.ivanenko.Practice6.part1.Word;

public class Reader {
	public static String read(String name) {
		StringBuilder sb = new StringBuilder();
		try {
			File file = new File(name);
			if (file.exists()) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
				String result;
				while ((result = reader.readLine()) != null) {
		
						sb.append(result);
				}
				reader.close();
			}

		} catch (IOException e) {
			System.out.println(e);
		}
		return sb.toString();
	}
	
	public static List<Word> readWords(String file) {
		List<Word> words = new ArrayList<>();

		Pattern pattern = Pattern.compile("(?iU)(\\w+|\\w+'\\w*)(?=([.?!]|\\s|$))");
		Matcher matcher = pattern.matcher(read(file));

		while (matcher.find()) {
			for (Word word : words) {
				if (word.getWord().equals(matcher.group())) {
					word.setFrequency(word.getFrequency() + 1);
					break;
				}
			}
			words.add(new Word(matcher.group()));
		}
		return words;
	}
}
