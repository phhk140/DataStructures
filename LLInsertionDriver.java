class LLInsertion {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;

	public void push(int data) {
		// creating the new node with the data
		// ------ -
		// |5 | null|
		// --------
		Node new_node = new Node(data);
		Node temp;
		temp = head;
		if (head == null) {
			head = new_node;
			return;
		}
		if (temp != null) {
			new_node.next = head;
			head = new_node;
		}

	}

	public void print(Node p) {
		if (p != null) {
			System.out.print(+p.data);
			System.out.print(" ");
			print(p.next);

		}
	}

}

public class LLInsertionDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLInsertion li = new LLInsertion();
		li.push(12);
		li.push(14);
		li.push(16);
		System.out.println("The linked list is:");
		li.print(li.head);

	}
}
