@FunctionalInterface
interface A{
    void run(int a);
}

public class LamdaExp {
    public static void main(String[] args) {
        // A a = () ->{
        //     System.out.println("A is running. ");
        // };
        // a.run();


        // A a = () ->System.out.println("A is running. ");
        // a.run();


        // A a = (int b) ->
        // {
        //     System.out.println("A is running. "+ b);
        // };
        // a.run(5);

        A a = b ->System.out.println("A is running. "+ b);
        a.run(5);
    }
}
