package ua.nure.ivanenko.Practice6.part7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Range implements Iterable<Integer> {
	private List<Integer> list = new ArrayList<>();
	private int current;
	
	public Range(int start, int end) {
		if(end > start) {
			for(int i = start; i <= end; i++) {
				list.add(i);
			}
			current = 0;
		}
	}
	public Range(int start, int end, boolean reverse) {
		this(start, end);
		if(reverse) {
			Collections.reverse(list);
		}
	}
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			@Override
			public boolean hasNext() {
				return current < list.size();
			}

			@Override
			public Integer next() {
				return list.get(current++);
			}
			
			@Override 
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
}
