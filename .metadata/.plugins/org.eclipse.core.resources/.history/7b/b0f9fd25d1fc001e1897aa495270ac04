package dsaPractice;

public class LinkedList {
	public class Node{
		int data;
		Node next;
		public Node(int value) {
			this.data = value;
			this.next = null;
		}
	}
	public Node head;
	public Node tail;
	public int size;
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		size++;
		if(head==null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		size++;
		if(head==null) {
			head = tail = newNode;
		}
		tail.next = newNode;
		tail = newNode;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Linked List is Empty");
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	// code to add node at any index
	
	//
	//
	///
	///
	///
	///
	//
	
	public void add(int idx, int value) {
		Node newNode = new Node(value);
		Node temp = head;
		size++;
		int i = 0;
		while (i < idx - 1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public int removeFirst() {
		
		if(size==0) {
			System.out.println("LinkedList is empty");
			return Integer.MAX_VALUE;
		}else if(size==1) {
			int val = head.data;
			head = tail = null;
			size--;
			return val;
		}
		int val = head.data;
		head = head.next;
		size--;
		return val;
	}
	
	public void removeLast() {
		if(size == 0) {
			System.out.println("LinkedList is empty");
			return;
		}else if(size == 1) {
			head=tail=null;
			return;
		}
		Node prev = head;
		for(int i = 0; i < size - 2; i++) {
			prev = prev.next;
		}
		prev.next = null;
		tail = prev;
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.print();
		ll.addFirst(1);
		ll.print();
		ll.addFirst(2);
		ll.print();
		ll.addLast(12);
		ll.print();
		ll.addLast(5);
		ll.print();
		ll.add(2, 8);

		ll.print();
		System.out.println(ll.size);
		
		System.out.println(ll.removeFirst());
		
		ll.removeLast();
		ll.print();
		
		

	}

}
