class A{

    public A(){
        System.out.println("A is constroctor");
    }
    public void normalMethod(){
        System.out.println("This method is called by object");
    }
}

public class AnonymosObject {
    public static void main(String[] args) {
        // A a = new A();
        // a.normalMethod();
        // A b = new A();
        // b.normalMethod();
        new A().normalMethod();
    }
}
