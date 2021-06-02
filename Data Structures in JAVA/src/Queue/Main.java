package Queue;

public class Main {

	public static void main(String[] args) {
		queue q = new queue();
		q.enQueue(2);
		q.enQueue(8);
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(22);
		q.show();
		// Now if we increase the number of elements it will give an exception.
		// This is because the defined size is 5 and we are not deleting the values.
		// We are just increasing the front value.
		// So for this issue we will use Circular queue.
		
		q.deQueue();
		q.enQueue(40);
		q.enQueue(52);
		q.show();
		
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.show();
	}

}