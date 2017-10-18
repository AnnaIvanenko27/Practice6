package ua.nure.ivanenko.Practice6.part2;

/* Write a program that simulates the following process. 
 * There are n people in the circle, numbered from n to 0. 
 * When counting on a circle, each k-th person is struck out, 
 * until there is left one. 
 * 
 * Solve the problem in two ways - using ArrayList and  LinkedList. 
 * Determine and compare the execution time of each of the two approaches 
 * on the same input data.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Part2 {
	private List<Boolean> humans1 = new ArrayList<>();
	private List<Boolean> humans2 = new LinkedList<>();
	
	public void fillLists(int n) {
		for(int i = 0; i < n; i++) {
			humans1.add(true);
			humans2.add(true);
		}
	}
	
	public void removeArrayList(int k) {
		long startTime = System.nanoTime();
		int current = k;
		while(humans1.size() > 1) {
			if(current < humans1.size()) {
				humans1.remove(current);
				current += k;
			} else {
				current = current - humans1.size();
			}
		}
		long endTime = System.nanoTime();
		System.out.println("Work time of ArrayList: " + (endTime - startTime));
	}
	
	public void removeLinkedList(int k) {
		long startTime = System.nanoTime();
		int current = k;
		while(humans2.size() < 1) {
			if(current > humans2.size()) {
				humans2.remove(current);
				current += k;
			} else {
				current = current - humans2.size();
			}
		}
		long endTime = System.nanoTime();
		System.out.println("Work time of LinkedList: " + (endTime - startTime));
	}
	
	public static void main(String[] args) {
		Part2 humans = new Part2();
		humans.fillLists(10);
		humans.removeArrayList(3);
		System.out.println();
		humans.removeLinkedList(3);
	}
	
}
