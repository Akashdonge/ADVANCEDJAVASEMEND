1. Supplier
//Definition: A Supplier is a functional interface that represents a function that supplies a result. It does not take any input arguments and produces a result.

//Method: T get(): Returns an object of type T.
//Example:

import java.util.function.Supplier;  

public class SupplierExample {  
    public static void main(String[] args) {  
        // Supplier that provides a random integer  
        Supplier<Integer> randomIntegerSupplier = () -> (int) (Math.random() * 100);  
        
        // Getting a random integer  
        System.out.println("Random Integer: " + randomIntegerSupplier.get());  
    }  
}  
2. Consumer
//Definition: A Consumer is a functional interface that represents a function that takes a single input argument and returns no result. It is typically used for operations that perform actions on the input.
//
//Method: void accept(T t): Accepts a single input argument and performs an action.
//Example:

import java.util.function.Consumer;  

public class ConsumerExample {  
    public static void main(String[] args) {  
        // Consumer that prints a string  
        Consumer<String> stringPrinter = (s) -> System.out.println("String: " + s);  
        
        // Using the consumer to print  
        stringPrinter.accept("Hello, World!"); // Output: String: Hello, World!  
    }  
}  
3. Predicate
//Definition: A Predicate is a functional interface that represents a function that takes a single input argument and returns a boolean value. It is typically used for evaluating conditions.

//Method: boolean test(T t): Evaluates this predicate on the given argument.
//Example:

import java.util.function.Predicate;  

public class PredicateExample {  
    public static void main(String[] args) {  
        // Predicate that checks if a number is even  
        Predicate<Integer> isEven = (n) -> n % 2 == 0;  
        
        // Testing the predicate  
        System.out.println("Is 4 even? " + isEven.test(4)); // Output: Is 4 even? true  
        System.out.println("Is 5 even? " + isEven.test(5)); // Output: Is 5 even? false  
    }  
}  
4. Function
//Definition: A Function is a functional interface that represents a function that takes one argument and produces a result. It is generic, so it can take any type of input and produce any type of output.

///Method: R apply(T t): Applies this function to the given argument.
//Example:

import java.util.function.Function;  

public class FunctionExample {  
    public static void main(String[] args) {  
        // Function that converts a string to its length  
        Function<String, Integer> stringLength = (s) -> s.length();  
        
        // Applying the function  
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello")); // Output: Length of 'Hello': 5  
    }  
}  
