
class LLInsetionAtEnd {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	Node head;

	public void insertBegin(int data) {
		Node new_node = new Node(data);
		Node t;
		t = head;

		if (head == null) {
			head = new_node;
			return;
		}
		if (head != null) {
			new_node.next = head;
			head = new_node;
		}
	}

	public void insertLast(int data) {
		Node new_node = new Node(data);
		
		if (head == null) {
			head = new_node;
			return;
		}
		
		Node t;
		t = head;
		while (t.next != null) {
			t=t.next;
			t.next = new_node;
			return;
		}

	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}
}

public class LLInsertionAtEndDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLInsetionAtEnd li=new LLInsetionAtEnd();
		li.insertBegin(10);
		li.printList();
		li.insertBegin(20);
		li.printList();
		//li.printList();
		li.insertLast(30);
		li.printList();

	}

}
