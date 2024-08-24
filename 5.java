import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PrintArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Define a lambda expression for printing
        Consumer<String> printFruit = fruit -> System.out.println(fruit);

        // Use a traditional for loop to iterate through the ArrayList
        for (int i = 0; i < fruits.size(); i++) {
            printFruit.accept(fruits.get(i));
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class PrintArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Use a for loop to print each element of the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
@FunctionalInterface
interface Sum {
    int add(int a, int b);
}

public class SumLambda {
    public static void main(String[] args) {
        // Use a lambda expression to define the add method
        Sum sum = (a, b) -> a + b;

        // Example usage
        int result = sum.add(10, 20);

        // Print the result
        System.out.println("Sum: " + result);  // Output: Sum: 30
    }
}
