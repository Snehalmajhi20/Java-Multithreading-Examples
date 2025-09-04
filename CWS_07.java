class B extends Thread
{
	public void run(){
		System.out.println("Hello"+Thread.currentThread().getName());
	}
}
class CWS_07 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		B c1 = new B();
		B c2 = new B();
		B c3 = new B();
		
		c1.start();
		c2.start();
		c3.start();
		Thread.currentThread().setName("Cool Coder");
		c1.setName("Java Developer");
		c2.setName("Python Developer");
		c3.setName("Web Developer");
		System.out.println("**********************************");
		System.out.println(Thread.currentThread().getName());
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		
	}
}
