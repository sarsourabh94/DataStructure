package dll;

public class testing {

	public static void main(String[] args) {
		SingleLinkList linklist=new SingleLinkList();
		linklist.append(15);
		linklist.insertFront(23);
		linklist.insertAtPos(1,33);
		linklist.insertAtPos(2,39);
		
		//linklist.deleteFront();
		//linklist.deleteEnd();
		//linklist.deleteAtPos(4);
		
		linklist.reverseLinkList();
		linklist.displayList();
	}

}