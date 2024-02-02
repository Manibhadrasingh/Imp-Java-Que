import java.util.ArrayList;
import java.util.List;

public class CollectionEx {
    public static void main(String[] args) {
        
        List<Integer> c = new ArrayList<>();

        c.add(10);
        c.add(7);
        c.add(3);
        c.add(6);
        c.add(9);
        System.out.println(c.get(4));

        for(Object num : c){
            int n = (int) num;
            System.out.println(n*n);
        }
    }
}
