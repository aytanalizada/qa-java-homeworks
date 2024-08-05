import java.util.Random;

public class HomeWork12 {

    public static void main(String[] args) {
        analyzeBooleanValues();
        mergeStringWithNumber();
        convertStringCase();
        generateRandomNumber();
        demonstrateCharacterOperations();
        calculateTriangleArea();
        useEscapeSequences();
        applyExplicitTypeCasting();
        exploreStringMethods();
        illustrateLogicalOperators();
        performComplexArithmetic();
        displayDataTypes();
    }

    // Task 1: Analyze Boolean Values - Determine the outcome of various logical conditions
    public static void analyzeBooleanValues() {
        // Instructions: Define boolean variables and evaluate different logical expressions. Print the results.
        // Expected output:
        // Is Java versatile? true
        // Is Python slow? false
        // Is Java versatile and Python slow? false
        // Is Java versatile or Python slow? true
        boolean isJavaVersatile = true;
        boolean isPythonSlow = false;

        // Declare variables:
        System.out.println("Is Java versatile? " + isJavaVersatile + "\nIs Python slow? " + isPythonSlow);
        System.out.println("Is Java versatile and Python slow? " + (isJavaVersatile && isPythonSlow));
        System.out.println("Is Java versatile or Python slow? " + (isJavaVersatile || isPythonSlow));
        // Print results:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 2: Merge String with Number - Concatenate a string and a number in a formatted message
    public static void mergeStringWithNumber() {
        // Instructions: Combine a string with a number and print the result.
        // Expected output:
        // The total is 50

        // Declare variables:
        String a = "The total is ";
        int b = 50;
        // Concatenate and print:
        String c = a.concat(b + "");
        System.out.println(c);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 3: Convert String Case - Change the case of characters in a string
    public static void convertStringCase() {
        // Instructions: Convert a string to uppercase and lowercase, then print the results.
        // Expected output:
        // Uppercase: JAVA PROGRAMMING
        // Lowercase: java programming

        // Declare variable:
        String a = "Java Programing";
        String b = a.toUpperCase();
        String c = a.toLowerCase();
        // Convert and print:
        System.out.println("Uppercase: " + b + "\nLowercase: " + c);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 4: Generate Random Number - Produce a random number within a specified range
    public static void generateRandomNumber() {
        // Instructions: Generate a random number between 96 and 330 and print the result.
        // Expected output:
        // Random number between 96 and 330: <random number>

        // Declare variables:
        int a = ((int) (Math.random() * 97) + 233);
        // Print result:
        System.out.println("Random number between 96 and 330: " + a);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 5: Demonstrate Character Operations - Show the result of character arithmetic and ASCII value
    public static void demonstrateCharacterOperations() {
        // Instructions: Define a char variable and perform operations such as finding its ASCII value and the next character in the sequence. Print the results.
        // Expected output:
        // Character: C
        // ASCII value: 67
        // Next character: D

        // Declare variable:
        char c = 'C';
        int a = (int) c;
        int d = a + 1;
        char b = (char) d;
        // Print results:
        System.out.println("Character: " + c + "\nASCII value: " + a + "\nNext character: " + b);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 6: Calculate Triangle Area - Find the area of a right triangle
    public static void calculateTriangleArea() {
        // Instructions: Define base and height of a right triangle and calculate the area. Print the result.
        // Formula: Area = 0.5 * base * height

        // Declare variables:
        int height = 4;
        int base = 3;
        double area = 0.5 * base * height;
        // Calculate and print area:
        System.out.println("Area = " + area);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 7: Use Escape Sequences - Show the use of escape sequences in a formatted string
    public static void useEscapeSequences() {
        // Instructions: Define a string with escape sequences and print it.
        // Expected output:
        // Formatted string with escape sequences: Here is a new line:\nHere is a tab:\tAnd a backslash:\\

        // Declare variable:
        String a = "Here is a new line:\nHere is a tab:\tAnd a backslash:\\\\";
        // Print result:
        System.out.println(a);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 8: Apply Explicit Type Casting - Cast between floating-point and integer types
    public static void applyExplicitTypeCasting() {
        // Instructions: Perform explicit type casting between float and int, and int and double. Print the results.
        // Expected output:
        // Float value: 12.34
        // Casted to int: 12
        // Int value: 45
        // Casted to double: 45.0

        // Declare variables:
        float f = 12.34f;
        int i = (int) f;
        int i1 = 45;
        double d = i1;
        // Print results:
        System.out.println("Float value: " + f + "\nCasted to int: " + i + "\nInt value: " + i1 + "\nCasted to double: " + d);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 9: Explore String Methods - Use length() and indexOf()
    public static void exploreStringMethods() {
        // Instructions: Define a String variable and use length() and indexOf() methods. Print the results.
        // Expected output:
        // Length of string: 11
        // Index of 'e': 1

        // Declare variables:
        String txt = "Hello Java ";
        // Print results:
        System.out.println("Length of string: " + txt.length());
        System.out.println("Index of 'e': " + txt.indexOf('e'));
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 10: Illustrate Logical Operators - Evaluate expressions using different logical operators
    public static void illustrateLogicalOperators() {
        // Instructions: Use various logical operators to evaluate expressions. Print the results.
        // Expected output:
        // a & b = false
        // a | b = true
        // !(a && b) = true

        // Declare variables:
        boolean b = true;
        boolean a = false;
        boolean c = a & b;
        boolean d = a | b;
        boolean v = !(a && b);
        // Print results:
        System.out.println("a & b = " + c + "\na | b = " + d + "\n!(a && b) = " + v);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 11: Perform Complex Arithmetic - Compute the result of multiple arithmetic expressions
    public static void performComplexArithmetic() {
        // Instructions: Define variables and compute the result of several arithmetic expressions. Print the results.
        // Expected output:
        // Sum: 45
        // Difference: 15
        // Product: 150
        // Quotient: 5

        // Declare variables:
        int a = 30;
        int b = 15;
        int c = 10;
        // Print results:
        System.out.println("Sum: " + (a + b) + "\nDifference: " + (a - b) + "\nProduct: " + (b * c) + "\nQuotient: " + (b * c / a));
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 12: Display Data Types - Print the default values of different data types
    public static void displayDataTypes() {
        // Instructions: Define variables of different primitive data types (byte, short, long, double, boolean). Print each variable.
        // Expected output:
        // Byte: 0
        // Short: 0
        // Long: 0
        // Double: 0.0
        // Boolean: false

        // Declare variables:
        byte b = 0;
        short s = b;
        long l = s;
        double d = l;
        boolean bl = b == 5;
        // Print variables:
        System.out.println("Byte: " + b + "\nShort: " + s + "\nLong: " + l + "\nDouble: " + d + "\nBoolean: " + bl);
        System.out.println("-----------");  // Do not touch this line
    }
}
