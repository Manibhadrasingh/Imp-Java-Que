import Tools.AddCalc;
import Tools.SubCalc;
import Tools.AnotherTool.MulCalc;

public class ImportPackage {
    public static void main(String[] args) {
        AddCalc a = new AddCalc();
        SubCalc s = new SubCalc();
        MulCalc m = new MulCalc();
        int res = a.calc(17, 12);
        int res2 = s.calc1(17, 25);
        int res3 = m.mul(10,20);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}
