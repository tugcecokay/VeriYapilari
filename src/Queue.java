
public class Queue<E> {

	private int boyut;
	E[]queue;
	private int front;
	private int rear;
	
	public Queue(int size)
	{
		this.boyut=size;
		queue =(E[]) new Object[size];
		rear=front=-1;
		
	}
	public int size()
	{
		return queue.length;
	}
	
	public boolean queueBos()
	{
		return front==rear;
		
	}
	
	public boolean queueTamDolu()
	{
		return rear==size()-1;
			
	}
	
	public void enQueue(E eleman)
	{
	if (queueTamDolu())
	{
		System.out.println("Queue(kuyruk) dolu");
	} 
	else
	{
		queue[++rear]=eleman;
	}	
		
		
	}
	
	public  E deQueue() throws Exception
	{
		if (queueBos())
		{
			System.out.println("Queue(kuyruk)boþ");
		} 
		else
		
			front++;
			return queue[front];
						
	}
	public void queueGoruntule()
	{
		if (queueBos()) 
		{
			System.out.println("Queue(kuyruk)boþ");
		} 
		else 
		{
			int tut=front+1;
			while (tut<=rear)
			{
				System.out.println(queue[tut++]);
			}
		}
		
		
	}
	
}
