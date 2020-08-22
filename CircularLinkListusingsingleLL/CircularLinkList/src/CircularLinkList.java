
public class CircularLinkList {

	Node last;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// insert in empty list
	public void addInEmptyList(int data) {
		if (last != null)
			return;
		Node newNode = new Node(data);
		last = newNode;
		last.next = last;
	}

	// insert in front
	public void insertFront(int data) {
		if (last == null)
			addInEmptyList(data);

		Node newNode = new Node(data);

		newNode.next = last.next;
		last.next = newNode;
	}

	// insert at last
	public void insertAtLast(int data) {
		if (last == null)
			addInEmptyList(data);

		Node newNode = new Node(data);

		newNode.next = last.next;
		last.next = newNode;
		last = newNode;
	}

	// insert after a given number
	public void insertAfterNum(int existdata, int num) {
		if (last == null)
			addInEmptyList(num);
		Node temp = last.next;

		do {
			if (temp.data == existdata) {
				Node newNode = new Node(num);
				newNode.next = temp.next;
				temp.next = newNode;

				if (temp == last) {
					last = newNode;
				}
			}
			temp = temp.next;
		} while (temp != last.next);
	}

	// display the list
	public void display() {
		if (last == null)
			return;
		Node temp = last.next;
		do {
			System.out.print(temp.data + " : ");
			temp = temp.next;
		} while (temp != last.next);

	}

	// delete at front
	public void deleteFront() {
		if (last == null)
			return;
		else if (last.next == last)
			last = null;
		else {
			last.next = last.next.next;
		}
	}

	// delete at back
	public void deleteEnd() {
		if (last == null)
			return;
		else if (last.next == last)
			last = null;
		else {
			Node temp = last.next;
			while (temp.next != last) {
				temp = temp.next;
			}
			temp.next = last.next;
			last = temp;
		}
	}

	// delete a given element
	public void deleteNum(int num) {
		if (last == null)
			return;

		else if (last.data == num && last.next == last) {
			last = null;
			return;
		} else {
			Node cur = last;
			Node forward = last.next;

			while (forward.next != last) {
				if (forward.data == num) {
					cur.next = forward.next;
					forward=forward.next;
					return;
				}
				forward=forward.next;
				cur=cur.next;
			}
		}

	}
}
