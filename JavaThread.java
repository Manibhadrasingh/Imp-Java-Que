class A extends Thread{
    public void run(){
     
        for(int i = 1; i < 300; i++){
            System.out.println("Hey.");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0; i< 100 ;i++){
            System.out.println("Hello.");
        }
    }
}


public class JavaThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}
