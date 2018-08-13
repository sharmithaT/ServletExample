import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("a1", "a2", "c3", "d3","a2");

        li.stream()//gives the elements one by one.
                //.distinct() if written here removes the duplicates first and then sends to filter
                .filter(s->s.startsWith("a"))//filtering the elements
                .distinct() // here it removes the duplicates after filtering
                .map(s->s.toUpperCase())
                .forEach(s->System.out.println(s));//printing the resultset.


        List<Integer> numbers = Arrays.asList(1, 5, 7, 3, 8, 10, 48, 67, 2, 23, 56, 11, 4, 100);

        numbers.stream()
                .filter(s -> (s > 5))
                .forEach(s -> System.out.println(s));
    }


}
