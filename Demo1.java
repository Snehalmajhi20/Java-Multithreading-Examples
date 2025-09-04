class Cws extends Thread
{
	public void run(){
		System.out.println(""+Thread.currentThread().getName());
	}
}
class Demo1
{
	public static void main(String[] args) 
	{
		Cws c1 = new Cws();
		Cws c2 = new Cws();
		Cws c3 = new Cws();
		
		c1.start();
		c2.start();
		c3.start();
		System.out.println("Hello World!");
	}
}
