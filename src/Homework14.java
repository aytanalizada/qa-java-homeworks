import java.util.Scanner;

public class Homework14 {

    // Task 1: Multiplication of First N Numbers (While Loop)
    // Instruction: Write a program that takes user input for a number N and calculates the product of numbers from 1 to N using a while loop.
    // Expected Result: If the user inputs 5, the output should be "Product: 120" (since 1*2*3*4*5=120).
    public static void multiplicationOfFirstNNumbersWhile() {
        // Implementation here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int i = 1;
        int product = 1;
        while (i <= n) {
            product = product * i;
            i++;
        }
        System.out.println("Product: " + product);
    }

    // Task 2: Count from N to 20 (Do-While Loop)
    // Instruction: Write a program that takes user input for a number N and prints numbers from N to 20 using a do-while loop.
    // Expected Result: If the user inputs 17, the output should be "17 18 19 20".
    public static void countFromNTo20DoWhile() {
        // Implementation here
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner1.nextInt();
        do {
            System.out.print(n + " ");
            n++;
        } while (n <= 20);
    }

    // Task 3: Print Numbers from 1 to N (For Loop)
    // Instruction: Write a program that takes user input for a number N and prints all numbers from 1 to N using a for loop.
    // Expected Result: If the user inputs 5, the output should be "1 2 3 4 5".
    public static void printNumbersFor() {
        // Implementation here
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int n = scanner2.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

    }

    // Task 4: Sum of Even Numbers from 1 to N (While Loop)
    // Instruction: Write a program that takes user input for a number N and calculates the sum of all even numbers from 1 to N using a while loop.
    // Expected Result: If the user inputs 10, the output should be "Sum of even numbers: 30" (since 2+4+6+8+10=30).
    public static void sumOfEvenNumbersWhile() {
        // Implementation here
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int n = scanner3.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum of even numbers: " + sum);
    }

    // Task 5: Print Digits of a Number in Reverse with Spaces (Do-While Loop)
    // Instruction: Write a program that takes user input for a number and prints its digits in reverse order with spaces between them using a do-while loop.
    // Expected Result: If the user inputs 12345, the output should be "5 4 3 2 1".
    public static void printDigitsReverseWithSpacesDoWhile() {
        // Implementation here
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int i = scanner4.nextInt();
        do {
            System.out.print(i % 10 + " ");
            i = i / 10;
        } while (i > 0);

    }

    // Task 6: Calculate Factorial of a Number (For Loop)
    // Instruction: Write a program that takes user input for a number N and calculates its factorial using a for loop.
    // Expected Result: If the user inputs 5, the output should be "Factorial: 120" (since 5! = 5*4*3*2*1 = 120).
    public static void calculateFactorialFor() {
        // Implementation here
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int n = scanner5.nextInt();
        int num = 1;
        for (int i = n; i >= 1; i--) {
            num = num * i;
        }
        System.out.println("Factorial: " + num);
    }

    // Task 7: Print Numbers from N to 1 in Reverse Order (While Loop)
    // Instruction: Write a program that takes user input for a number N and prints all numbers from N to 1 in reverse order using a while loop.
    // Expected Result: If the user inputs 5, the output should be "5 4 3 2 1".
    public static void printNumbersInReverseWhile() {
        // Implementation here
        Scanner scanner6 = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int i = scanner6.nextInt();
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }

    }

    // Task 8: Print Odd Numbers from 1 to N (Do-While Loop)
    // Instruction: Write a program that takes user input for a number N and prints all odd numbers from 1 to N using a do-while loop.
    // Expected Result: If the user inputs 10, the output should be "1 3 5 7 9".
    public static void printOddNumbersDoWhile() {
        // Implementation here
        Scanner scanner7 = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int num = scanner7.nextInt();
        int i = 1;
        do {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= num);

    }

    // Task 9: Count Down from N to 1 (For Loop)
    // Instruction: Write a program that takes user input for a number N and prints numbers from N down to 1 using a for loop.
    // Expected Result: If the user inputs 5, the output should be "5 4 3 2 1".
    public static void countDownFromNTo1For() {
        // Implementation here
        Scanner scanner9 = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int i = scanner9.nextInt();
        for (int n = i; n >= 1; n--) {
            System.out.print(n + " ");
        }
    }

    // Task 10: Print Sum of Numbers from 1 to N (While Loop)
    // Instruction: Write a program that takes user input for a number N and calculates the sum of all numbers from 1 to N using a while loop.
    // Expected Result: If the user inputs 5, the output should be "Sum: 15" (since 1+2+3+4+5=15).
    public static void sumOfNumbersWhile() {
        // Implementation here
        Scanner scanner9 = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int n = scanner9.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        multiplicationOfFirstNNumbersWhile();
        countFromNTo20DoWhile();
        printNumbersFor();
        sumOfEvenNumbersWhile();
        printDigitsReverseWithSpacesDoWhile();
        calculateFactorialFor();
        printNumbersInReverseWhile();
        printOddNumbersDoWhile();
        countDownFromNTo1For();
        sumOfNumbersWhile();
    }
}

