package ua.nure.ivanenko.Practice6.part1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class WordContainer {
	private List<Word> words = new LinkedList<>();
	
	public void add(String wordNew) {		
		for(Word word : words) {
			if(word.getWord().equals(wordNew)) {
				word.setFrequency(word.getFrequency() + 1);
				return;
			}
		}
		words.add(new Word(wordNew));
	}
	
	public void print() {
		Collections.sort(words, new Comparator<Word>() {
			@Override
			public int compare(Word word1, Word word2) {
				if(word1.getFrequency() < word2.getFrequency()) {
					return 1;
				} else if(word1.getFrequency() > word2.getFrequency()) {
					return -1;
				} else {
					return word1.getWord().compareTo(word2.getWord());
				}
			}
		});
		for(Word word : words) {
			System.out.println(word.getWord() + " : " + word.getFrequency());
		}
	}
}
