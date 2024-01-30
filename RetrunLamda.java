@FunctionalInterface
interface A{
    public int show(int i, int j);
}

public class RetrunLamda {
    public static void main(String[] args) {
        // Without lamda expression

    //     A a = new A(){
    //         public int show(int a , int b){
    //             return a + b;
                
    //         }
    //     };
    //    int res= a.show(5,7);
    //    System.out.println(res);

    //    With lamda expression

        A a = (i,j) -> i +j;
        int res = a.show(6,8);
        System.out.println(res);
    }
}
