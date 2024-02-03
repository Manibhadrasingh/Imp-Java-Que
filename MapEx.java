import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("Ram", 15);
        m.put("Mahesh", 20);
        m.put("Ashok", 25);
        m.put("Anil", 23);
        m.put("Saurabh", 89);

        for(String name : m.keySet()){
            System.out.println(name + " : "+ m.get(name));
        }
    }
}
