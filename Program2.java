import java.util.*;
import java.util.stream.Collectors;

public class Program2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(21, 99, 3, 4, 23, 87, 9, 7);
        System.out.println("Original arraylist elements: " + numbers);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element to update: ");
        int givenElement = s.nextInt();

        if (numbers.contains(givenElement)) {
            System.out.println("Enter the new value for that element: ");
            int updatedElement = s.nextInt();

            // Create a new list with the updated element using a combination of Streams
            // and traditional methods
            numbers = numbers.stream()
                    .map(element -> element == givenElement ? updatedElement : element)
                    .collect(Collectors.toList());
        } else {
            System.out.println("The element is not present in the ArrayList");
        }

        System.out.println("After update arraylist elements: " + numbers);
    }
}
