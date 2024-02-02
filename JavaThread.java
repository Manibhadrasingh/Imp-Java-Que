class A extends Thread {
    public void run() {

        for (int i = 1; i < 100; i++) {
            System.out.println("Hey.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JavaThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();
    }
}
