
public class Stack<E>
{

E[] stack;

static int top;//stackteki elemanlarý belirtir

public Stack(int size) {
	stack=(E[]) new Object[size]; // stack dizisinin boyutu belirlendi

	this.top=-1;//top'a -1 deðeri atandý.
}

public void stackBosalt()
	{
		
this.top=-1;// belirtecin sýfýrdan küçük ya da -1 olmasý stackte eleman olmadýðýný ifade eder.
}
	
	
public static boolean stackBos()
	
{
		
if(top==-1)//yada top<0
		
{
return true;
}
return false;
	}
	
	
public boolean stackDolu()//stack'in içinde eleman olmasý dolu olduðu anlamýný taþýmaz.Stack boyutu kadar elaman var ise tepeleme doludur.

{

if (this.top==this.stack.length-1)//belirteç stack'in boyutundan 1 az ise stack dolu anlamýna gelir.
{

return true;

}
		
return false;
	}

public void push(E sayi)//stacke eleman ekleme metodu

{

if(stackDolu())//stack doluluk kontrolü,stacke eleman eklemek için stackte yer olmasý gerek, yer olup olmadýðýný anlamak için ufak bir kontrol yapmalý.

{

System.out.println("Stack dolu!");
}
else	
{

stack[++top]=sayi;//top'ý artýrýp eklemek istediðimiz elemaný stack degiskenine atama yapýyoruz.Eleman eklemeden önce top Stackteki en son elemaný
			
//gosteriyordu. top'ý artýrarak bi üst alaný gostermesini saðlýyoruz

	}
		
	
}

public E pop() throws Exception //Stackten eleman çýkartan metod
	
{

if (stackBos())
{

System.out.println("Stack boþ!");

}

return  stack[top--];//top'ý azaltarak en üstten eleman çýkartmýþ oluyoruz.
	}
	

	public void stackGoster()//Stack elemanlarýný ekrana yazdýran metod. Stack yapýsýna gore stacke son giren eleman ilk çýkar.(lifo)
	
{//lisetelemede bu kurala göre olacaktýr.

if (stackBos()) {
		
System.out.println("Stack bos");

}
	
	int sayi = top;//sayi degiþkenine top'ý atama iþlemi yapýyoruz

		while (sayi!=-1)//Stack boþalana kadar döngü iþlem yapýyor
	
	{
			System.out.println(this.stack[sayi--]);//

		}
		
	
}
	
	
		
	}

	


				
		
		

	


