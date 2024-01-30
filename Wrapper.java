public class Wrapper {
    public static void main(String[] args) {
        int num1 = 10;
        Integer num2 = num1;  //Autoboxing
        System.out.println(num2);


        // int num3 = num2.intValue();
         int num3 = num2;   //Auto- unboxing
         System.out.println(num3);

         String str = "12";
         int num4 = Integer.parseInt(str);
         System.out.println(num4*2);
    }
}
