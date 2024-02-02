import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
    public static void main(String[] args) {
        // HashSet gives us unique value
        // Set<Integer> s1 = new HashSet<>();

        // TreeSet Gives us Sorted value
        // Set<Integer> s1 = new TreeSet<>();

        Collection<Integer> s1= new HashSet<>();

        s1.add(10);
        s1.add(11);
        s1.add(12);
        s1.add(13);
        s1.add(10);

        Iterator<Integer> i =  s1.iterator();

        while(i.hasNext())
             System.out.println(i.next());


        // for(int i : s1){
        //     System.out.println(i);
        // }
    }
}
