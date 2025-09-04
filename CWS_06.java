class A extends Thread
{
	public void run(){
		for(int i=0; i<=10; i++){
			System.out.println(i);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
class CWS_06 
{
	public static void main(String[] args) 
	{
		A a = new A();
		a.start();
		System.out.println("Hello World!");
	}
}
