class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Demo {
	public void running() {
        System.out.println("Demo is running...");
    }
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
		//runnable.start();
        Thread thread = new Thread(runnable);
        thread.start(); // Starts the thread
    }
}
