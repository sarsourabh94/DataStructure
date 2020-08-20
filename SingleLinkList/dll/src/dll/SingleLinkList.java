package dll;


public class SingleLinkList {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	// Appends a new node at the end of list
	public void append(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = null;

		Node curNode = head;

		while (curNode.next != null)
			curNode = curNode.next;

		curNode.next = newNode;
		return;
	}

	// Appends a new node in the front of the list
	public void insertFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// Returns the size of the list
	int getSize() {
		int count = 1;
		Node tempNode = head;
		while (tempNode.next != null) {
			count++;
			tempNode=tempNode.next;
		}
		return count;
	}

	// Puts the node at the specified index
	public void insertAtPos(int pos, int data) {
		if (pos == 0)
			insertFront(data);

		else if (pos == getSize())
			append(data);

		else if (pos > getSize())
			return;

		else {
			int count = 1;
			Node tempNode = head;
			while (count != pos) {
				tempNode = tempNode.next;
				count++;
			}
			Node newNode = new Node(data);
			newNode.next = tempNode.next;
			tempNode.next = newNode;
		}

	}

	// Displays the list
	public void displayList() {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.data + "-> ");
			tempNode=tempNode.next;
		}
	}
	
	//delete front
	public void deleteFront()
	{
		if(head==null)
		{
			return;
		}
		
		head=head.next;
		return;
	}
	
	//delete end
	public void deleteEnd()
	{
		if(getSize()==0 || getSize()==1)
			return;
		
		Node temp=head;
		
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
		return;
	}
	
	//delete at given position
	public void deleteAtPos(int pos)
	{
		if(pos==1 || pos==0)
		{
			deleteFront();
			return;
		}
			
		
		if(pos==getSize())
		{
			deleteEnd();
			return;
		}
			
		
		int count=1;
		Node temp=head;
		while(count<pos)
		{
			count++;
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return;
	}
	
	//Reverse a link list
	public void reverseLinkList()
	{
		Node curNode=head;
		Node nextNode=null;
		Node prevNode=null;
		
		while(curNode!=null)
		{
			nextNode=curNode.next;
			curNode.next=prevNode;
			prevNode=curNode;
			curNode=nextNode;
		}
		head=prevNode;
	}
}

