
public class Metodlar{

	public boolean polindrom(String kelime)throws Exception
	{
		Stack<Character> stk = new Stack<Character> (kelime.length());
		Queue<Character> cq = new Queue<Character>(kelime.length()+1);
		
		for (int i = 0; i <kelime.length(); i++) {
			stk.push(kelime.charAt(i));
			cq.enQueue(kelime.charAt(i));
						
		}
		for (int i = 0; i < kelime.length()/2; i++) {
			if (stk.pop()!=cq.deQueue()) {
				return false;
			}
		}
		return true;
	}
	
		public static void main(String[] args) throws Exception {
		
			Metodlar mt= new Metodlar();
			
            System.out.println(mt.polindrom("adanada"));
	}

}
