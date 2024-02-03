import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapFilterEx {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(3,46,3,6,8);


        // int result = nums.stream()
        Stream<Integer> sortedValues = nums.stream()
                            // .filter(n -> n % 2 == 0)
                            // .filter(p)
                            .filter( n ->  n%2==0)
                            .sorted();
        sortedValues.forEach(n -> System.out.println(n));
                            // .map(n -> n * 2)
                            // .reduce(0,(c,e) ->c+e);
                           
    }
}
