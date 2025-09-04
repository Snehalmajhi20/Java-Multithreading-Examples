class B extends Thread
{
	public void run(){
		int i = 0;
		while(i<100){
			System.out.println("I'm Snehal Majhi");
			i++;
		}
	}
}
class A 
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.start();
	}
}
