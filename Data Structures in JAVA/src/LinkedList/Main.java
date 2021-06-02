package LinkedList;

public class Main {

	public static void main(String[] args) {
		linkedlist ll = new linkedlist();
		ll.insert(5);
		ll.insert(10);
		ll.insert(32);
		ll.insertAtStart(11);
		ll.insertAt(2,18);
		ll.deleteAt(1);
		ll.show();
	}
}
