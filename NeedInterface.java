interface A{
    int  a = 10;
   void show();
   void hide();
}
class B implements A{
    public void show(){
        System.out.println("Hey");
    }
    public void hide(){
        System.out.println("Hlw");
    }
}


public class NeedInterface {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.hide();
    }
}
