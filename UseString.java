class CheckLogic {
    int roll;
    int marks;
    static String name;
    public CheckLogic(){
        roll =10;
        marks =20;
        System.out.println("Constructor Called");
    }
    static {
        name = "Radha";
        int num1 = 10;
        int num2 = 20;
        int num = num1 + num2 ;
        System.out.println(num);
        System.out.println("Static block call only ones ");
    }
}

public class UseString {
    public static void main(String[] args) throws ClassNotFoundException {

        // String str = "Ram ";
        // str = str + "Shyam";
        // System.out.println(str);

        // String st = new String("Lak");
        // st = st + "Lucky";
        // System.out.println(st);

        // StringBuffer s = new StringBuffer("Aman ");
        // s.append("Naman Banshal");
        // System.out.println(s);

        // CheckLogic cl = new CheckLogic();
        // CheckLogic c2 = new CheckLogic();
        Class.forName("CheckLogic");

    }
}
