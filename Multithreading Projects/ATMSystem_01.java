class ATM {
    synchronized static void withdraw(String name, int amount) {
        for (int i = 0; i < 2; i++) {
            System.out.println(name + " is withdrawing Rs." + amount + "...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(name + " withdrawal completed");
    }
}

class Customer1 extends Thread {
    public void run() {
        ATM.withdraw("Snehal", 5000);
    }
}

class Customer2 extends Thread {
    public void run() {
        ATM.withdraw("Saroj", 2000);
    }
}

class Customer3 extends Thread {
    public void run() {
        ATM.withdraw("Jagannath", 3000);
    }
}

class Customer4 extends Thread {
    public void run() {
        ATM.withdraw("Rohit", 1000);
    }
}

public class ATMSystem_01 {
    public static void main(String[] args) {
        Customer1 c1 = new Customer1();
        Customer2 c2 = new Customer2();
        Customer3 c3 = new Customer3();
        Customer4 c4 = new Customer4();

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        System.out.println("ATM service started...");
    }
}

