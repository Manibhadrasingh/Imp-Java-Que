class A{
    public int val = 10;
    public void show(){
        System.out.println("Hey");
    }
    class B{
        public void config(){
            System.out.println("Jai Shree Ram");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        A.B b = a.new B();
        b.config();
    }
}
