
public class QueueTest {

	
	public static void main(String[] args) throws Exception {
		Queue q1= new Queue(10);
		
		q1.enQueue(3);
		q1.enQueue(9);
		q1.enQueue(5);
		q1.enQueue(8);
		q1.deQueue();
		q1.queueGoruntule();

	}

}
