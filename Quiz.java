class Hey {
    // int num1=10;

    // public void run(){
    // int num1 = 15;

    // System.out.println(num1);
    // }
    public void pMessage(int message) {
        System.out.println(message);
    }

    public void pMessage(Integer message) {
        System.out.println(message);
    }
}

public class Quiz {

    public static void main(String[] args) {
        // int a, b;
        // a=b=10;
        // System.out.println(a);
        // System.out.println(b);

        // int a = 3;
        // int b = 6;
        // int result = (~a & b) | (a & ~b);
        // int x = 5;
        // int y = 10;
        // int result = (x++ > 5 && y-- < 10) ? x-- : y;
        // System.out.println(result);
        // int i, j;
        // i = 100;
        // j = 300;
        // while (++i < --j)
        // ;
        // System.out.println(i);
        // Hey h = new Hey();
        // h.pMessage(5);

        String password[] = { "XY01", "XY02", "XY03", "XY04" };
        System.out.println(password.length);
        String result = " ";
        for (int i = password.length - 1; i >= 2; i--) {
            result = result + password[i];
        }
        System.out.println(result);
    }

}
