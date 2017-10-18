package ua.nure.ivanenko.Practice6.part6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ua.nure.ivanenko.Practice6.part1.Word;

public enum Task {
	FREQUENCY, LENGTH, DUPLICATES;

	public static void doTask(String file, Task task) {
		List<Word> words = Reader.readWords(file);

		switch (task) {
		case DUPLICATES: {
			int str = 0;
			for(Word word: words) {
				if(str < 3) {
					if(word.getFrequency() > 1) {
						String reverce = new StringBuilder(word.getWord()).reverse().toString();
						System.out.println(reverce.toUpperCase());
						str++;
					} else {
						continue;
					}
				} else {
					break;
				}
			}
			break;
		}
		case FREQUENCY: {
			Collections.sort(words, new Comparator<Word>() {
				@Override
				public int compare(Word word1, Word word2) {
					return word2.getFrequency() - word1.getFrequency();
				}
			});
			Word[] sorted = new Word[3];
			
			for (int i = 0; i < 3; i++) {
				sorted[i] = words.get(i);
			}
			Arrays.sort(sorted, new Comparator<Word>() {
				@Override
				public int compare(Word w1, Word w2) {
					return w1.getWord().compareTo(w2.getWord());
				}
			});
			for(Word word : sorted) {
				System.out.println(word.getWord() + " ==> " + word.getFrequency());
			}
			break;
		}

		case LENGTH: {
			Collections.sort(words, new Comparator<Word>() {
				public int compare(Word word1, Word word2) {
					return word2.getWord().length() - word1.getWord().length();
				}
			});
			
			for (int i = 0; i < 3; i++) { 
				System.out.println(words.get(i).getWord() + " ==> " + words.get(i).getWord().length());
			}
			break;
		}

		}
	}
}
