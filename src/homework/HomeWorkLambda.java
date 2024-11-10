package homework;

import java.util.Arrays;
import java.util.Comparator;

public class HomeWorkLambda {
    public static void main(String[] args) {


        // ### Task 1: Simple Greeting Message
//**Objective**: Use a lambda expression to print a greeting message.
//1. Define an interface `Greeting` with a method `sayHello(String name)`.
//            2. Use a lambda expression to implement the `Greeting` interface in the main method.
//            3. Call the lambda to print a greeting for `"John"`.
        interface Greeting {
            public void sayHello(String name);
        }
        Greeting greeting = (name) -> System.out.println(name);
        greeting.sayHello("John");
//            **Note**: Focus on using a lambda to create a concise and clear implementation.
//            ---
//            ### Task 2: Basic Arithmetic Operation
//**Objective**: Use lambda expressions to perform basic arithmetic operations.
//            1. Define an interface `Operation` with a method `operate(int a, int b)`.
//            2. In the main method, create lambdas for addition, subtraction, multiplication, and division by implementing the `Operation` interface.
//            3. Use the `operate()` method to call each lambda and print the result for two integers, e.g., `5` and `3`.
//            **Important**: You may need to research the `operate()` method and other methods that can help with different arithmetic operations. This task involves experimenting with method usage in Java.
//---
        interface Operation {
            void operate(int a, int b);
        }
        Operation addition = (a, b) -> System.out.println(a + b);
        Operation subtraction = (a, b) -> System.out.println(a - b);
        Operation multiplication = (a, b) -> System.out.println(a * b);
        Operation division = (a, b) -> System.out.println(a / b);
        addition.operate(5, 3);
        subtraction.operate(5, 3);
        multiplication.operate(5, 3);
        division.operate(5, 3);


//        ### Task 3: Filter Even Numbers from an Array
//**Objective**: Use a lambda expression to filter even numbers from an array.
//1. Create an array of integers with values from 1 to 10.
//            2. Define an interface `EvenChecker` with a method `check(int number)` to determine if a number is even.
//            3. Use a lambda expression to implement `EvenChecker` and apply it to each element of the array.
//4. Print only the even numbers from the array.
//            **Hint**: This task will help you practice conditional checks within a lambda expression.
//            ---
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        interface EvenChecker {
            boolean check(int number);
        }
        System.out.print("Printing even numbers:");
        EvenChecker evenChecker = (number) -> number % 2 == 0;
        for (int num : arr) {
            if (evenChecker.check(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

//            ### Task 4: Sort an Array of Strings by Length
//**Objective**: Use a lambda expression to sort an array of strings by their length.
//1. Create an array of strings with varying lengths.
//            2. Use `Arrays.sort()` with a lambda to sort the array in ascending order by string length.
//3. Print the sorted array.
//            **Hint**: Sorting with lambda expressions can make your code more concise and readable. You may need to explore sorting functions in Java.
//---
        String[] names = {"Aytan", "Nazrin", "Fazil", "Ali"};
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        Arrays.sort(names, comparator);
        for (String name : names) {
            System.out.println(name);
        }
//        ### Task 5: Convert an Array of Strings to Uppercase
//**Objective**: Use a lambda expression to convert each string in an array to uppercase.
//1. Create an array of strings with several words.
//            2. Define an interface `UpperCaseConverter` with a method `convert(String word)` to convert each word to uppercase.
//            3. Use a lambda to implement `UpperCaseConverter` and apply it to each element of the array.
//4. Print each converted string.
//            **Hint**: This task will help you practice transformations with lambda expressions.
        String[] namesLowerCase = {"aytan", "nazrin", "fazil", "ali"};
        interface UpperCaseConverter {
            String convert(String word);
        }
        System.out.println("UpperCase words\n");
        UpperCaseConverter upperCaseConverter = String::toUpperCase;
        for (String name : namesLowerCase) {
            System.out.println(upperCaseConverter.convert(name));
        }

    }
}