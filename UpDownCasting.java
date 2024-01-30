class A {
    public void show1(){
        System.out.println("A class :");
    }
}
class B extends A{
    public void show2(){
        System.out.println("B class :");
    }

    public void config() {
    }
}
public class UpDownCasting {
    public static void main(String[] args) {
        A a = new B();
        a.show1();

        B b = (B) a;
        b.show2();
    }
}
