package ua.nure.ivanenko.Practice6.part4;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Edge implements Comparable<Edge> {
	private String v1,
		  			v2;
	
	public Edge(String v1, String v2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	
	public String toString() {
		return "(" + v1 + ", " + v2 + ")";
	}
	
	public int hashCode() {
		return (Integer.valueOf(v1) + Integer.valueOf(v2))*47;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Edge) {
			return ((((Edge)o).v1.equals(v1) && ((Edge)o).v2.equals(v2)) || (((Edge)o).v1.equals(v2) && ((Edge)o).v2.equals(v1)));
		}
		else { 
			return false; 
		}
	}

	@Override
	public int compareTo(Edge e) {
		if(v1.compareTo(e.v1) == 0) {
			return v2.compareTo(e.v2);
		} else {
		return v1.compareTo(e.v1);
		}
	}
}

public class Graph {
	private int size;

	public Graph(int size) {
		this.size = size;
	}

	private Set<String> vertexs = new HashSet<>();
	private List<Edge> edges = new LinkedList<>();


	public void addVertex(String point) {
		if(vertexs.size() < size) {
			vertexs.add(point);
		}
	}
	
	public void addEdge(String point1, String point2) {
		if((!(vertexs.contains(point1)) || !(vertexs.contains(point2))) && vertexs.size() == size) {
			return;
		}
		if(!(vertexs.contains(point1)) && !(vertexs.contains(point2))) {
			vertexs.add(point1);
			vertexs.add(point2);
		}
		else if(!vertexs.contains(point1) && vertexs.size() < size) {
			vertexs.add(point1);
		} else if(!vertexs.contains(point2) && vertexs.size() < size) {
			vertexs.add(point2);
		} 
		Edge edge = new Edge(point1, point2);
		if(edges.contains(edge)) {
			return;
		} else {
			edges.add(edge);
		}
	}
	
	public void removeEdge(String v1, String v2) {
		Edge edge = new Edge(v1, v2);
		edges.remove(edge);
	}
	
	public void print() {
		Collections.sort(edges);
		for(Edge edge : edges) {
			System.out.println(edge);
		}
	}
	
}
