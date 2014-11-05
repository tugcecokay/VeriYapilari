
public class Stack<E>
{

E[] stack;

static int top;//stackteki elemanlar� belirtir

public Stack(int size) {
	stack=(E[]) new Object[size]; // stack dizisinin boyutu belirlendi

	this.top=-1;//top'a -1 de�eri atand�.
}

public void stackBosalt()
	{
		
this.top=-1;// belirtecin s�f�rdan k���k ya da -1 olmas� stackte eleman olmad���n� ifade eder.
}
	
	
public static boolean stackBos()
	
{
		
if(top==-1)//yada top<0
		
{
return true;
}
return false;
	}
	
	
public boolean stackDolu()//stack'in i�inde eleman olmas� dolu oldu�u anlam�n� ta��maz.Stack boyutu kadar elaman var ise tepeleme doludur.

{

if (this.top==this.stack.length-1)//belirte� stack'in boyutundan 1 az ise stack dolu anlam�na gelir.
{

return true;

}
		
return false;
	}

public void push(E sayi)//stacke eleman ekleme metodu

{

if(stackDolu())//stack doluluk kontrol�,stacke eleman eklemek i�in stackte yer olmas� gerek, yer olup olmad���n� anlamak i�in ufak bir kontrol yapmal�.

{

System.out.println("Stack dolu!");
}
else	
{

stack[++top]=sayi;//top'� art�r�p eklemek istedi�imiz eleman� stack degiskenine atama yap�yoruz.Eleman eklemeden �nce top Stackteki en son eleman�
			
//gosteriyordu. top'� art�rarak bi �st alan� gostermesini sa�l�yoruz

	}
		
	
}

public E pop() throws Exception //Stackten eleman ��kartan metod
	
{

if (stackBos())
{

System.out.println("Stack bo�!");

}

return  stack[top--];//top'� azaltarak en �stten eleman ��kartm�� oluyoruz.
	}
	

	public void stackGoster()//Stack elemanlar�n� ekrana yazd�ran metod. Stack yap�s�na gore stacke son giren eleman ilk ��kar.(lifo)
	
{//lisetelemede bu kurala g�re olacakt�r.

if (stackBos()) {
		
System.out.println("Stack bos");

}
	
	int sayi = top;//sayi degi�kenine top'� atama i�lemi yap�yoruz

		while (sayi!=-1)//Stack bo�alana kadar d�ng� i�lem yap�yor
	
	{
			System.out.println(this.stack[sayi--]);//

		}
		
	
}
	
	
		
	}

	


				
		
		

	


