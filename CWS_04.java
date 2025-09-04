class C extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("I'm MyThread Run Method......");
        }
    }
}

class CWS_04 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("I'm CWS_01 Run Method......");
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("I'm Main Method......");
        }

        C mt = new C();
        mt.start();

        CWS_04 cws = new CWS_04();
        cws.start();
    }
}

