package ua.nure.ivanenko.Practice6.part5;

public class Tree<E extends Comparable<E>> {
	private Node<E> root;
	
	public boolean add(E element) {
		Node<E> temp = root, current = null;
		
		while(temp != null) {
			int tmp = temp.value.compareTo(element);
			if(tmp == 0) {
				return false;
			}
			current = temp;
			if(tmp < 0) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
		}
		
		if(current == null) {
			root = new Node<E>(element);
			return true;
		}
		Node<E> newNode = new Node<E>(element);
		if(current.value.compareTo(element) < 0) {
			current.left = newNode;
		} else {
			current.right = new Node<E>(element);
		}
		return true;
	}
	
	public void add(E[] elements) {
		for(E e : elements) {
			add(e);
		}
	}
	
	public boolean remove(E element) { 
		Node<E> temp = root, current = null;
		
		while(temp != null) {
			int tmp = temp.value.compareTo(element);
			if(tmp == 0) {
				break;
			}
			current = temp;
			if(tmp < 0) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
		}
		
		if(temp == null) {
			return false; 
		}
		
		if(temp.right == null) {
			if(current == null) {
				root = temp.left;
			} else {
				if(temp == current.left) {
					current.left = temp.left;
				} else {
					current.right = temp.right;
				}
			}
		} else {
			Node<E> theLeftist = temp.right;
			current = null;
			while(theLeftist.left != null) {
				current = theLeftist;
				theLeftist = theLeftist.left;
			}
			if(current == null) {
				temp.right = theLeftist.right;
			} else {
				current.left = theLeftist.right;
			}
			temp.value = theLeftist.value;
		}	
		return true;
	}
	
	public void print() {
		root.printSubTree("");
	}
	
	private static class Node<E extends Comparable<E>> {
		private E value;
		
		private Node<E> left,
				right;
		
		Node(E value) {
			this.value = value;
		}
		
		public void printSubTree(String splitter) {
			if(right != null) {
				right.printSubTree(splitter + "\t");
			}
			System.out.println(splitter + value);
			if(left != null) {
				left.printSubTree(splitter + "\t");
			}
			
		}
		
		public String toString() {
			return value.toString();
		}

	}
	
}
