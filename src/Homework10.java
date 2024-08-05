
// Create the file named Homework10.java under src

public class Homework10 {

    // Task 1: Introduction to Java
    // Print a welcome message to the console in uppercase
    // Expected Output: WELCOME TO JAVA PROGRAMMING!
    public static void javaIntro() {
        // Declare and initialize a String variable with the message
        String message = "WELCOME TO JAVA PROGRAMMING!";


        // Print the message

        System.out.println(message);
    }

    // Task 2: Java Get Started
    // Print the classic "Hello, World!" message with each word on a new line
    // Expected Output:
    // Hello,
    // World!
    public static void javaGetStarted() {
        // Declare and initialize a String variable with the message

        String message = "Hello,";
        String message2 = "World!";

        System.out.println(message);
        System.out.println(message2);


        // Print the message using newline characters


    }

    // Task 3: Java Syntax
    // Create a simple Java method that prints a message with a line break in the middle of the sentence
    // Expected Output: This is a simple
    // method in Java.
    public static void javaSyntax() {
        // Declare and initialize a String variable with the message

        String message = "This is a simple \nmethod in Java.";
        // Print the message with a line break in the middle
        System.out.println(message);
    }

    // Task 4: Java Output
    // Print a message and a number on the same line
    // Expected Output: The answer is: 42
    public static void javaOutput() {
        // Declare an integer variable with the value 42
        String message = "The answer is: ";
        int number = 42;


        // Print a message concatenated with the integer variable
        System.out.println(message + number);

    }

    // Task 5: Print Text
    // Print a custom text message with its length
    // Expected Output: Learning Java is fun! (Length: 22)
    public static void printText() {
        // Declare and initialize a String variable with the message
        String text = "Learning Java is fun! ";
        // Print the length of the message

        System.out.println(text + "(Length: " + text.length() + ")");
    }

    // Task 6: Print Numbers
    // Print an integer and a double value
    // Expected Output: Integer: 123, Double: 45.67
    public static void printNumbers() {
        // Declare and initialize an integer and a double variable
        int a = 123;
        double b = 45.67;


        // Print both values
        System.out.println("Integer: " + a + ", Double: " + b);

    }


    // Task 7: Java Comments
    // Demonstrate single-line and multi-line comments
    // Expected Output: Single-line comment above
    // Expected Output: Multi-line comment above
    public static void javaComments() {
        // Single-line comment
        String singleLine = "//String name=\"Aytan\"; ";

        // Multi-line comment

        String multiLine = "/*\n" +
                "    int a = 5;\n" +
                "    int b = 10;\n" +
                "    int c = 15;\n" +
                " */";
        // Print messages to demonstrate the comments

        System.out.println(singleLine + "\nSingle-line comment above");
        System.out.println(multiLine + "\nMulti-line comment above");
    }

    // Task 8: Java Variables
    // Declare and initialize different types of variables
    // Expected Output: Integer: 5, String: Hello, Boolean: true
    public static void javaVariables() {
        // Declare and initialize an integer, a String, and a boolean variable

        int a = 5;
        String name = "Hello";
        boolean b = true;
        // Print all variables
        System.out.println("Integer: " + a + ", String: " + name + ", Boolean: " + b);

    }

    // Task 9: Java Data Types
    // Demonstrate usage of different data types
    // Expected Output: Integer: 10, Double: 20.5, Char: A, Boolean: true
    public static void javaDataTypes() {
        // Declare and initialize variables of different data types

        int a = 10;
        double b = 20.5;
        char c = 'A';
        boolean d = true;

        // Print all variables

        System.out.println("Integer: " + a + ", Double: " + b + ", Char: " + c + ", Boolean: " + d);
    }

    // Task 10: Numbers
    // Perform basic arithmetic operations and print results
    // Expected Output: Sum: 30, Product: 200
    public static void numbers() {
        // Declare and initialize two integer variables
        int a = 20;
        int b = 10;


        // Print the results

        System.out.println("Sum: " + (a + b) + ", Product: " + (a * b));
    }

    // Task 11: Booleans
    // Demonstrate boolean operations
    // Expected Output: Is Java fun? true
    // Expected Output: Is fish tasty? false
    public static void booleans() {
        // Declare and initialize two boolean variables
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // Print both boolean values
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

    }

    // Task 12: Calculate Area of a Rectangle
    // Calculate and print the area of a rectangle given the length and width
    // Formula: Area = length * width
    // Expected Output: Area of the rectangle with length 8 and width 5 is 40
    public static void calculateRectangleArea() {
        // Declare and initialize variables for length and width

        int length = 8;
        int width = 5;

        // Print the area
        System.out.println("Area of the rectangle with length " + length + " and width " + width + " is " + (length * width));

    }

    // Task 13: Calculate Area of a Square
    // Calculate and print the area of a square given the side length
    // Formula: Area = side * side
    // Expected Output: Area of the square with side length 5 is 25
    public static void calculateSquareArea() {
        // Declare and initialize a variable for the side length
        int side = 5;

        // Print the area
        System.out.println("Area of the square with side length " + side + " is " + (side * side));

    }

    // Task 14: Calculate Area of a Circle
    // Calculate and print the area of a circle given the radius
    // Formula: Area = π * radius^2
    // Expected Output: Area of the circle with radius 7 is 153.93804002589985
    public static void calculateCircleArea() {
        // Declare and initialize a variable for the radius
        int radius = 7;

        // Print the area

        System.out.println("Area of the circle with radius " + radius + " is " + (Math.PI * radius * radius));
    }

    // Main method to run all tasks
    // Please do not modify the main method
    public static void main(String[] args) {
        javaIntro();
        javaGetStarted();
        javaSyntax();
        javaOutput();
        printText();
        printNumbers();
        javaComments();
        javaVariables();
        javaDataTypes();
        numbers();
        booleans();
        calculateRectangleArea();
        calculateSquareArea();
        calculateCircleArea();
    }
}