class OnlineTicketBooking
{
	public static void Ticketbuyer(String name){
		for(int i=0;i<2;i++){
			System.out.println(name+" is Booking Ticket.....");
			try{
				Thread.sleep(1000);
				}
				catch(InterruptedException e){
					System.out.println(e.getMessage());
				}
		}
	}
}
class Customer1 extends Thread
{
	public void run(){
		OnlineTicketBooking.Ticketbuyer("Snehal");
	}
}
class Customer2 extends Thread
{
	public void run(){
		OnlineTicketBooking.Ticketbuyer("Jagannath");
	}
}
class Customer3 extends Thread
{
	public void run(){
		OnlineTicketBooking.Ticketbuyer("Saroj");
	}
}
class Customer4 extends Thread
{
	public void run(){
		OnlineTicketBooking.Ticketbuyer("Rohit");
	}
}
class CWS_09
{
	public static void main(String[] args) 
	{
		Customer1 c1 = new Customer1();
		Customer2 c2 = new Customer2();
		Customer3 c3 = new Customer3();
		Customer4 c4 = new Customer4();
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		System.out.println("Hello World!");
	}
}
