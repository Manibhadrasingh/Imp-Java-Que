import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 6, 2, 39, 7);
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n-> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        Integer result = s3.reduce(0,(c,e) -> c+e);


        System.out.println(result);
        // s3.forEach(n->System.out.println(n));
    }
}
