class Mythread extends Thread 
{
	public void run(){
		System.out.println("Hi");
	}
	public static void main(String[] args) 
	{
		Mythread t = new Mythread();
		t.start();
		System.out.println("Hello World!");
	}
}
