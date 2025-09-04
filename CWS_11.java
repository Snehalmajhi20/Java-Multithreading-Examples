class ABC implements Runnable
{
	public void run(){
		for(int i=1; i<=2; i++){
			System.out.println("i'm the Run Method of Runnable");
		}
	}
}
class CWS_11 
{
	public static void main(String[] args) 
	{
		ABC abc = new ABC();
		Thread th = new Thread(abc);
		th.start();
		System.out.println("Hello World!");
	}
}
