import java.util.*;
import java.util.stream.IntStream;

public class Program3 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(List.of(21, 1, 3, 4, 23, 87, 99, 7));

        // Use IntStream to generate indices and access elements using forEach
        IntStream.range(0, numbers.size())
                .forEach(index -> System.out.println(numbers.get(index) + " positioned at " + index));
    }
}
