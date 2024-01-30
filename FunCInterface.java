@FunctionalInterface
interface A{
    void run();
}

public class FunCInterface {
    public static void main(String[] args) {
        A a = new A(){
            public void run(){
                System.out.println("A is running :");
            }
        };
        a.run();
    }
}
