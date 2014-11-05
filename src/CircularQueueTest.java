
public class CircularQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(10);
		
		cq.enQueue(1);
		cq.enQueue(3);
		cq.enQueue(5);
		
		cq.deQueue();
		
		cq.queueGoruntule();

	}

}
