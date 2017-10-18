package ua.nure.ivanenko.Practice6.part5;

/* Create a generic Tree class that implements 
 * the data structure "binary search tree". 
 * 
 * Don't use classes-containers
 */

public class Part5 {
	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<>();
		
		System.out.println(tree.add(3));
		System.out.println(tree.add(3));
		
		System.out.println("~~~~Add array of int to Tree:");
		tree.add(new Integer[] {1, 2, 5, 4, 6, 0});
		tree.print();
		System.out.println("~~~~Remove 5:");
		
		System.out.println(tree.remove(5));
		tree.print();
		
		System.out.println("~~~~Remove root:");
		System.out.println(tree.remove(3));
		tree.print();
	}
}
