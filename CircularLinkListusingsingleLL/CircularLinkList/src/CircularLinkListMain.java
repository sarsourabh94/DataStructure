
public class CircularLinkListMain {

	public static void main(String args[])
	{
		CircularLinkList cll = new CircularLinkList();
		cll.addInEmptyList(10);
		cll.insertAtLast(20);
		cll.insertAfterNum(10,15);
		cll.insertAfterNum(15,25);
		cll.insertAfterNum(25,30);
		cll.insertAfterNum(30,35);
		cll.display();
		System.out.println();
		cll.deleteEnd();
		cll.display();
		System.out.println();
		cll.deleteFront();
		cll.display();
		System.out.println();
		cll.deleteNum(25);
		cll.display();
		System.out.println();
	}
}
