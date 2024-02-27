import java.util.*;
import java.util.stream.Collectors;

public class Program4 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(List.of(21, 1, 3, 4, 23, 87, 99, 7));

        // Display initial elements
        System.out.println("Original list: " + numbers);

        // Create a new list without first and last elements using streams
        LinkedList<Integer> modifiedNumbers = numbers.stream()
                .skip(1)  // Skip the first element
                .limit(numbers.size() - 2)  // Take all but the last two elements
                .collect(Collectors.toCollection(LinkedList::new));

        // Display modified elements
        System.out.println("Modified list: " + modifiedNumbers);
    }
}
