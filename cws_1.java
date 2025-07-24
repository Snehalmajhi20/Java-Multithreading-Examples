class t1 extends Thread{
    public void run(){
        System.out.println("I am the Thread method....");
    }
    public void run(int a){
        System.out.println("I am the another method of thread class...");
    }
}
class t2 extends Thread{
    public void runmethod(){
        System.out.println("Hii, Good Morning!");
    }
    public void run(){
        System.out.println("Hello, Good Night!");
    }
}
public class cws_1 {
    public static void main(String[] args) {
        t1 t = new t1();
        t2 th = new t2();
        t.run();
        t.run(11);
        th.runmethod();
        th.run();
       // t.start();
        //th.start();
    }
}
