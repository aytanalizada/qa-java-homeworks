import com.sun.source.tree.IfTree;

public class Homework16 {
    // Task 1: Print Odd Numbers from 1 to N (For Loop)
    // Instruction: Create a method that takes an integer N as input and prints all odd numbers from 1 to N. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 7, the output should be "1 3 5 7".
    public static void printOdd(int n) {
        for (int number = 1; n >= number; number++) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }


    // Task 2: Print the First N Even Numbers (For Loop)
    // Instruction: Create a method that takes an integer N as input and prints the first N even numbers. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 5, the output should be "2 4 6 8 10".
    public static void printEven(int n) {
        for (int number = 2; number <= n * 2; number++) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }


    // Task 3: Calculate the Power of a Number
    // Instruction: Create a method that takes two integers, base and exponent, and calculates the result of base raised to the power of exponent.
    // Use a for loop for this task.
    // Call this method in the main method.
    // Expected Result: If the user inputs base=2 and exponent=3, the output should be "8".
    public static void printPower(int base, int exponent) {
        int power = 1;
        for (int i = 1; i <= exponent; i++) {
            power = base * power;
        }
        System.out.println(power);
    }

    // Task 4: Check if a Number is Even (While Loop)
    // Instruction: Create a method that takes an integer N as input and checks if it is even. Use a while loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 4, the output should be "4 is even".
    public static void checkEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even.");
        }
    }

    // Task 5: Print Multiples of N up to M (For Loop)
    // Instruction: Create a method that takes two integers N and M as input, and prints the multiples of N up to M. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs N=3 and M=10, the output should be "3 6 9".
    public static void printMultiples(int n, int m) {
        for (int i = n; i <= m; i = i + n) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // Task 6: Print "Hello" N Times (While Loop)
    // Instruction: Create a method that takes an integer N as input and prints "Hello" N times. Use a while loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 3, the output should be:
    // "Hello"
    // "Hello"
    // "Hello"
    public static void printHello(int n) {
        while (n > 0) {
            System.out.println("Hello");
            n--;
        }
        System.out.println();
    }

    // Task 7: Print Numbers from 1 to N (For Loop)
    // Instruction: Create a method that takes an integer N as input and prints all numbers from 1 to N. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 5, the output should be "1 2 3 4 5".
    public static void printN(int n) {
        for (int i = 1; n >= i; i++) {
            System.out.print(i + " ");
        }
    }

    // Task 8: Print a Character N Times (For Loop)
    // Instruction: Create a method that takes a character and an integer N as input and prints the character N times in a single line. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs '*' and 5, the output should be "*****".
    public static void printCharacter(char c, int n) {
        for (int i = 1; n >= i; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    // Task 9: Calculate the Sum of the First N Natural Numbers (For Loop)
    // Instruction: Create a method that takes an integer N as input and calculates the sum of the first N natural numbers.
    // Use a for loop for this task.
    // Call this method in the main method.
    // Expected Result: If the user inputs 4, the output should be "10" (because 1 + 2 + 3 + 4 = 10).
    public static void printSum(int n) {
        int sum = 0;
        for (int i = 1; n >= i; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }


    // Task 10: Print a Countdown from N to 1 (While Loop)
    // Instruction: Create a method that takes an integer N as input and prints a countdown from N to 1. Use a while loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 5, the output should be "5 4 3 2 1".
    // Main method to call all tasks
    public static void printCountDown(int n) {
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
    }

    public static void main(String[] args) {
        // Task 1: Get user input for Task 1 and call method for Task 1

        Homework16.printOdd(7);
        // Task 2: Get user input for Task 2 and call method for Task 2
        printEven(5);

        // Task 3: Get user input for Task 3 and call method for Task 3
        printPower(2, 3);

        // Task 4: Get user input for Task 4 and call method for Task 4
        checkEven(4);

        // Task 5: Get user input for Task 5 and call method for Task 5

        printMultiples(3, 10);
        // Task 6: Get user input for Task 6 and call method for Task 6

        printHello(3);
        // Task 7: Get user input for Task 7 and call method for Task 7

        //printN(5);
        // Task 8: Get user input for Task 8 and call method for Task 8
        printCharacter('*', 5);

        // Task 9: Get user input for Task 9 and call method for Task 9

        printSum(4);
        // Task 10: Get user input for Task 10 and call method for Task 10
        printCountDown(5);
    }
}

