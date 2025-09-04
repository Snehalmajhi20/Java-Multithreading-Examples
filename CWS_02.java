class A extends Thread
{
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println("I'm Run Method......");
		}
	}
	public void start(){
		for(int i=0; i<=5; i++){
			System.out.println("I'm the Start Method....");
		}
	}
}
class CWS_02 
{
	public static void main(String[] args) 
	{
		for(int i=0; i<4; i++){
			System.out.println("Hello World!");
		}
		A a = new A();
		a.start();
		a.run();
	}
}
