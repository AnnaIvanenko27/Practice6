package ua.nure.ivanenko.Practice6.part4;

/* Create a class Graph that represents an undirected graph. 
 * In the class constructor define the number of vertices. 
 * Methods should support rapid addition and removal ribs.
 */

public class Part4 {
	public static void main(String[] args) {
		Graph graph = new Graph(3);
		graph.addEdge("A", "B");
		graph.print();
		System.out.println();
		graph.addEdge("A", "C");
		graph.print();
		System.out.println();
		graph.addEdge("A", "C");
		graph.print();
		System.out.println();
		graph.addEdge("C", "D");
		graph.print();
		System.out.println();
		graph.addEdge("B", "C");
		graph.print();
		System.out.println();
		graph.addEdge("C", "A");
		graph.print();
		System.out.println();
		graph.removeEdge("C", "B");
		graph.print();
		System.out.println();
	}
}
