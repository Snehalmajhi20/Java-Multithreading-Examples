class Cs extends Thread
{
	public void run(){
		System.out.println("Hello"+Thread.currentThread().getName());
	}
}
class CWS_05 extends Thread
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		Cs c1 = new Cs();
		Cs c2 = new Cs();
		Cs c3 = new Cs();
		
		c1.start();
		c2.start();
		c3.start();
		//System.out.println(c1.getName());
		//System.out.println(c2.getName());
		//System.out.println(c3.getName());
	}
}
