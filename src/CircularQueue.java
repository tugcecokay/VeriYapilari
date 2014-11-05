
public class CircularQueue {

	private int boyut;
	private int[]queue;
	private int front;
	private int rear;
	
	public CircularQueue(int size)
	{
		this.boyut=size;
		queue = new int[boyut];
		front=rear=0;
		
	}
	
	public int size()
	{
		return queue.length;
		
	}
	
	public boolean queueBos()
	{
		return front==rear;
		
	}
	
	public boolean queueTamdolu()
	{
		return (rear+1)%size()==front;
		
	}

	public void enQueue(int ekle)
	{
		if (queueTamdolu())
		{
			System.out.println("Queue(kuyruk) dolu!");
		}
		else
		{
			rear=(rear+1)%size();
			queue[rear]=ekle;
		}
				
	}
	
	public int deQueue()
	{
		if (queueBos()) 
		{
			System.out.println("Queue(kuyruk) boþ!");
		} 
		else
		{
			front=(front+1)%size();
		}
		return queue[front];
		
	}
	
	public void queueGoruntule()
	{
		if (queueBos())
		{
			System.out.println("Queue(kuyruk) boþ!");
		} 
		else 
		{
			int tut=front;
			while (tut!=rear)
			{
				tut=(tut+1)%size();
				System.out.println(queue[tut]);
			}
		}
		
		
	}
}
