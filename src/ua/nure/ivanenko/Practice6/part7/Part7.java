package ua.nure.ivanenko.Practice6.part7;

/* Write a class that will represent the range of numbers [n, m], 
 * where n <m. The class must implement the interface Iterable. 
 * The iterator must be implemented in such a way that it passes 
 * from the beginning to the end of the gap. 
 * In the constructor, pass an additional parameter reverse.
 */

public class Part7 {
	public static void main(String[] args) {
		Range range = new Range(3, 10);
		for(Integer i : range) {
			System.out.print(i + " ");
		}
		System.out.println();
		Range range2 = new Range(3, 10, true);
		for(Integer i : range2) {
			System.out.print(i + " ");
		}
	}
}
