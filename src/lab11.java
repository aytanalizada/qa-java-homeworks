public class lab11 {

    public static void main(String[] args) {
        printDataTypes();
        performArithmeticOperations();
        evaluateBooleanExpressions();
        useCharDataType();
        calculateRectangleArea();
        useStringDataType();
        performTypeCasting();
        demonstrateOperators();
        concatenateStrings();
        combineNumbersAndStrings();
        useSpecialCharacters();
        useMathClassMethods();
    }

    // Task 1: Java Data Types - Define and print different data types
    public static void printDataTypes() {
        // Instructions: Define variables of different primitive data types (int, float, double, char, boolean). Print each variable.
        // Expected output:
        // Integer: 10
        // Float: 20.5
        // Double: 30.123
        // Char: A
        // Boolean: true

        // Declare variables:
        int a = 10;
        float f = 20.5f;
        double d = 30.123d;
        char c = 'A';
        boolean b = true;
        // Print variables:
        System.out.println("Integer: " + a + "\nFloat: " + f + "\nDouble: " + d + "\nChar: " + c + "\nBoolean: " + b);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 2: Numbers - Perform arithmetic operations
    public static void performArithmeticOperations() {
        // Instructions: Define two integer variables and perform addition, subtraction, multiplication, and division. Print the results.
        // Expected output:
        // Addition: 20
        // Subtraction: 10
        // Multiplication: 75
        // Division: 3

        // Declare variables:
        int a = 15;
        int b = 5;
        int c = 12;

        // Print results:
        System.out.println("Addition: " + (a + b) + "\nSubtraction: " + (a - b) + "\nMultiplication: " + (a * b) + "\nDivision: " + (a % c));
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 3: Booleans - Use boolean variables in expressions
    public static void evaluateBooleanExpressions() {
        // Instructions: Define boolean variables and use them in logical expressions. Print the results.
        // Expected output:
        // Is Java fun? true
        // Is fish tasty? false
        // Is Java fun and fish tasty? false
        // Is Java fun or fish tasty? true

        // Declare variables:
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        boolean isJavaFunAndFishTasty = false;
        boolean isJavaFunOrFishTasty = true;
        // Print results:
        System.out.println("Is Java fun? " + isJavaFun + "\nIs fish tasty? " + isFishTasty + "\nIs Java fun and fish tasty? " + isJavaFunAndFishTasty + "\nIs Java fun or fish tasty? " + isJavaFunOrFishTasty);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 4: Characters - Use char data type
    public static void useCharDataType() {
        // Instructions: Define a char variable and print it. Print the ASCII value of the character.
        // Expected output:
        // Grade: B
        // ASCII value of grade: 66

        // Declare variable:
        char grade = 'B';

        // Print results:
        System.out.println("Grade: " + grade + "\nASCII value of grade: " + (int) grade);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 5: Real-Life Example - Calculate area of a rectangle
    public static void calculateRectangleArea() {
        // Instructions: Define length and width of a rectangle as double variables. Calculate and print the area.
        // Formula: Area = length * width

        // Declare variables:
        double length = 5.6;
        double width = 6.5;
        System.out.println("Area = " + (length * width));
        // Calculate and print area:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 6: Non-primitive Types - Use String data type
    public static void useStringDataType() {
        // Instructions: Define a String variable and print it. Print the length of the string.
        // Expected output:
        // Greeting: Hello, World!
        // Length of greeting: 13


        // Declare variable:
        String a = "Hello, World!";
        // Print results:
        System.out.println("Greeting: " + a + "\nLength of greeting: " + a.length());
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 7: Java Type Casting - Perform type casting
    public static void performTypeCasting() {
        // Instructions: Cast a double to an int and print the result. Cast an int to a double and print the result.
        // Expected output:
        // Double value: 9.78
        // Casted to int: 9
        // Int value: 100
        // Casted to double: 100.0

        // Declare variables:
        double d = 9.78;
        int i = (int) d;
        int a = 100;
        double b = 100.0;
        // Print results:
        System.out.println("Double value: " + d + "\nCasted to int: " + i + "\nInt value: " + a + "\nCasted to double: " + b);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 8: Java Operators - Use different operators
    public static void demonstrateOperators() {
        // Instructions: Use arithmetic, relational, and logical operators. Print the results.
        // Expected output:
        // a + b = 30
        // a > b = false
        // a < b && b > 15 = true

        // Declare variables:
        int a = 10;
        int b = 20;

        // Print results:
        System.out.println("a+b= " + (a + b) + "\na > b " + (a > b) + "\na < b && b > 15= " + (a < b && b > a));
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 9: Java Strings - String concatenation
    public static void concatenateStrings() {
        // Instructions: Concatenate two strings and print the result.
        // Expected output:
        // Concatenated string: Hello World

        // Declare variables:
        String a="Hello";
        String b= "World";
        // Concatenate and print:
        System.out.println(a+" "+b);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 10: Numbers and Strings - Combine numbers and strings
    public static void combineNumbersAndStrings() {
        // Instructions: Combine a string with a number and print the result.
        // Expected output:
        // The number is 100

        // Declare variables:
     String a="The number is ";
     int b=100;
        // Print result:
        System.out.println(a+" "+b);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 11: Special Characters - Use special characters in strings
    public static void useSpecialCharacters() {
        // Instructions: Define a string with special characters like new line (\n) and tab (\t). Print the string.
        // Expected output:
        // String with special characters:
        // Line1
        // Line2	Tabbed

        // Declare variable:
    String a= "Line1";
    String b="Line2";
    String text="String with special characters:";
    String tab="Tabbed";

        // Print result:
        System.out.println(text+"\n"+a+"\n"+b+"\t"+tab);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 12: Java Math - Use Math class methods
    public static void useMathClassMethods() {
        // Instructions: Use methods from the Math class to perform different calculations. Print the results.
        // Expected output:
        // Square root of 16: 4.0
        // Random value between 57 and 260: <random value between 57 and 260>

        // Declare variables:
       double squareRoot=Math.sqrt(16);
       double randomNumber=57+Math.random()*(260-57);
        // Print results:
        System.out.println("Square root of 16: "+squareRoot);
        System.out.println("Random value between 57 and 260: "+randomNumber);
        System.out.println("-----------");  // Do not touch this line
    }
}








