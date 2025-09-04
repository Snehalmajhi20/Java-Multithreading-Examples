class B extends Thread
{
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println("I'm Run Method......");
		}
	}
	public void run(int a){
		for(int i=0; i<=5; i++){
			System.out.println("I'm the Start Method....");
		}
	}
}
class CWS_03 
{
	public static void main(String[] args) 
	{
		for(int i=0; i<4; i++){
			System.out.println("Hello World!");
		}
		B b = new B();
		b.start();
		b.run(12);
	}
}

