class Thread10 extends Thread
{
	public void run(){
		//System.out.println("Hii this Priority Thread!");
		//System.out.println(Thread.currentThread().getPriority());
		//System.out.println(Thread.currentThread().setPriority(4));
	}
}
class CWS_08
{
	public static void main(String[] args) 
	{
		Thread10 th1 = new Thread10();
		Thread10 th2 = new Thread10();
		Thread10 th3 = new Thread10();
		
		th1.start();
		th2.start();
		th3.start();
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		System.out.println(th3.getPriority());
		System.out.println("---------------Set Priority-------------------");
		th1.setPriority(3);
		th2.setPriority(7);
		th3.setPriority(9);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		System.out.println(th3.getPriority());
		System.out.println("-----------------Constants Priority-----------------");
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		th1.setPriority(Thread.MIN_PRIORITY);
		th1.setPriority(Thread.NORM_PRIORITY);
		th1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		System.out.println(th3.getPriority());
	}
}
