
public class StackTest {

	
	public static <E> void main(String[] args) {
		
		Stack<Integer> stk = new Stack<Integer>(10);
		
		stk.push(1);
		stk.push(2);
		stk.push(3);
		
		StackÝslemler<E> stkop = new StackÝslemler<E>();
		
		stk.stackGoster();
		
		
	}

}
