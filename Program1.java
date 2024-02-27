import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(21, 1, 3, 4, 23, 87, 99, 7);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the index of the element to retrieve: ");

        try {
            int index = s.nextInt();
            int result = numbers.stream()
                    .skip(index) // Skip elements up to the specified index
                    .findFirst()  // Get the first element after skipping
                    .orElseThrow(() -> new ArrayIndexOutOfBoundsException("Index is out of bounds"));
            System.out.println("Element at that Index: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
