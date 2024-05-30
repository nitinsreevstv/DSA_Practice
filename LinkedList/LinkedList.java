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
			size--;
			return;
		}
		Node prev = head;
		for(int i = 0; i < size - 2; i++) {
			prev = prev.next;
		}
		prev.next = null;
		size--;
		tail = prev;
	}
	
	public void remove(int index) {
		if(head==null) {
			System.out.println("LinkedList is Empty");
			return;
		}else if(size==1) {
			size--;
			head = tail = null;
			return;
		}
		Node temp = head;
		int i = 0;
		while (i < index - 1) {
			i++;
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	// Iterative Search
	public int itrSearch(int value) {
		Node temp = head;
		int i = 0;
		while(temp != null) {
			if(temp.data==value) {
				return i;
			}
			temp = temp.next;
			i++;
		}
		return -1;
	}
	
	public Node reverse(Node head) {
		if(head == null) {
			System.out.println("LinkedList is Empty");
		}
		Node prev = null;
		Node nxt = null;
		while(head!=null) {
			nxt = head.next;
			head.next = prev;
			prev = head;
			head = nxt;
		}
		return prev;
	}
	
	// Helper function for recursive search
	public int helper(Node head, int key) {
		if(head==null) {
			return -1;
		}
		if(head.data == key) {
			return 0;
		}
		int idx = helper(head.next,key);
		if(idx == -1) {
			return -1;
		}
		return idx+1;
	}
	
	public int recSearch(int key) {
		return helper(head,key);
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
		System.out.println(ll.recSearch(12));
//		ll.removeLast();
//		ll.print();
//		ll.remove(1);
		{}:
		ll.print();
	}

}
