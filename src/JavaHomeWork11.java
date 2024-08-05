public class JavaHomeWork11 {

    // Task 1: Java Data Types
    // Demonstrate usage of different data types
    // Expected Output: Integer: 10, Double: 20.5, Char: A, Boolean: true
    public static void javaDataTypes() {
        // Declare and initialize variables of different data types
        int a = 10;
        double b = 20.5;
        char c = 'A';
        boolean d = true;


        // Print all variables
        System.out.println("Integer: " + a + "," + " Double: " + b + ", Char: " + c + ", Boolean: " + d);

    }

    // Task 2: Data Types
    // Declare and initialize variables with all primitive data types
    // Expected Output: Byte: 100, Short: 1000, Int: 10000, Long: 100000L, Float: 10.5f, Double: 20.5, Char: B, Boolean: false
    public static void dataTypes() {
        // Declare and initialize variables of all primitive data types
        byte a = 100;
        short b = 1000;
        int c = 10000;
        long d = 100000L;
        float f = 10.5f;
        double l = 20.5;
        char s = 'B';
        boolean e = false;


        // Print all variables
        System.out.println("Byte: " + a + ", Short: " + b + ", Int: " + c + ", Long: " + d + ", Float: " + f + ", Double: " + l + ", Char: " + s + ", Boolean: " + e);
    }

    // Task 3: Numbers
    // Perform basic arithmetic operations and print results
    // Expected Output: Sum: 15, Difference: 5, Product: 50, Quotient: 2, Remainder: 1
    public static void numbers() {
        // Declare and initialize two integer variables
        int a = 10;
        int b = 5;
        int c = 3;
        int d = 2;


        // Print the results
        System.out.println("Sum: " + (a + b) + ", Difference: " + (a - b) + ", Product: " + (a * b) + ", Quotient: " + (a / b) + ", Remainder: " + (c % d));
    }

    // Task 4: Booleans
    // Demonstrate boolean operations
    // Expected Output: Is Java fun? true
    // Expected Output: Is the sky green? false
    public static void booleans() {
        // Declare and initialize two boolean variables
        boolean isJavaFun = true;
        boolean isSkyGreen = false;

        // Print both boolean values
        System.out.println("Is Java fun? " + isJavaFun + "\n" + "Is the sky green? " + isSkyGreen);

    }

    // Task 5: Characters
    // Demonstrate character usage and print a char variable
    // Expected Output: The first letter of the alphabet is A
    public static void characters() {
        // Declare and initialize a char variable

        char a = 'A';
        String text = "The first letter of the alphabet is ";
        // Print the char variable
        System.out.println(text + a);
    }

    // Task 6: Java Type Casting
// Demonstrate implicit and explicit type casting with different numeric types and String to numeric casting
// Expected Output: Implicit Casting (byte to int): 42 , Explicit Casting (int to short): 1000, Explicit Casting (double to float): 15.99
    public static void javaTypeCasting() {
        // Declare and initialize a variable for implicit casting (Widening Casting)
        byte b = 42;
        // Implicit casting (Widening Casting) (byte to int)
        int i = b;
        // Declare and initialize a variable for implicit casting (Widening Casting)
        int i1 = 1000;
        // Explicit casting (Narrowing Casting) (int to short)
        short s = (short) i1;
        // Declare and initialize a variable for implicit casting (Widening Casting)
        double d = 15.99d;
        // Explicit casting (Narrowing Casting) (double to float)
        float f = (float) d;
        // Print all values
        System.out.println("Implicit Casting (byte to int): " + i + ", Explicit Casting (int to short): " + s + ", Explicit Casting (double to float): " + f);

    }


    // Task 7: Java Type Casting
    // Demonstrate implicit and explicit type casting
    // Expected Output: Implicit Casting: 10.0, Explicit Casting: 10
    public static void javaTypeCastingManipulation() {
        // Declare and initialize a variable for implicit casting (Widening Casting)
        int in = 10;

        // Perform implicit casting
        double db = in;

        // Declare and initialize a variable for explicit casting (Narrowing Casting)
        double dn = 10.1;
        int nt = (int) dn;
        // Print both values
        System.out.println("Implicit Casting: " + db + ", Explicit Casting: " + nt);
    }

    // Task 8: Java Operators
    // Demonstrate the usage of various operators
    // Expected Output: Addition: 15, Subtraction: 5, Multiplication: 50, Division: 2, Remainder: 1
    // Expected Output: AND: true, OR: true, NOT: false
    public static void javaOperators() {
        // Declare and initialize two integer variables
        int a = 10;
        int b = 5;

        // Perform arithmetic operations
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int re = 5 % 4;
        // Declare and initialize two boolean variables
        boolean x = true;
        boolean y = true;
        // Print the results
        System.out.println("Addition:" + add + ", Subtraction: " + sub + ", Multiplication: " + mul + ", Division: " + div + ", Remainder: " + re);
        System.out.println("AND: " + (x && y) + ", OR:" + (x || y) + ", NOT: " + !(x == y));
    }

    // Task 9: Comparison Operators
    // Demonstrate the usage of comparison operators
    // Expected Output: 10 > 5: true, 10 < 5: false, 10 == 10: true, 10 != 5: true, 10 >= 5: true, 10 <= 5: false
    public static void comparisonOperators() {
        // Declare and initialize variables
        int x = 10;
        int y = 5;

        // Perform comparison operations
        boolean b1 = x > y;
        boolean b2 = x < y;
        boolean b3 = x == 10;
        boolean b4 = x != y;
        boolean b5 = x >= y;
        boolean b6 = x <= y;
        // Print the results
        System.out.println(x + " > " + y + ": " + b1 + ", " + x + " < " + y + ": " + b2 + ", " + x + " == " + x + ": " + b3 + ", " + x + " != " + y + ": " + b4 + "," + " " + x + " >= " + y + ": " + b5 + ", " + x + " <= " + y + ": " + b6);
    }

    // Task 9: Comparison Operators
// Demonstrate the usage of comparison operators with different data types
// Expected Output: 10.5 > 5: true, 10.5 < 20.5: true, 10.5 == 10.5: true, 'a' != 'b': true
    public static void comparisonOperatorsManipulation() {
        // Declare and initialize variables

        double d = 10.5;
        int i = 5;
        double d1 = 20.5;
        double d2 = 10.5;
        char a = 'a';
        char b = 'b';


        // Perform comparison operations
        boolean b3 = d > i;
        boolean b1 = d < d1;
        boolean b2 = d == d2;
        boolean b4 = a != b;
        // Print the results
        System.out.println(d + " > " + i + ": " + b3 + ", " + d + " < " + d1 + ": " + b1 + ", " + d + " == " + d2 + ": " + b2 + ", " + "'a'" + " !=" + "'b'" + ": " + b4);
    }


    // Task 11: Assignment Operators
    // Demonstrate the usage of assignment operators
    // Expected Output: Add and Assign: 15, Subtract and Assign: 5, Multiply and Assign: 50, Divide and Assign: 2, Modulus and Assign: 1
    public static void assignmentOperators() {
        // Declare and initialize a variable

        int i = 10;
        int i2 = 3;
        // Add and assign (And then print the num)
        i += 5;
        System.out.print("Add and Assign: " + i);

        // Subtract and assign (And then print the num)

        i -= 10;
        System.out.print(", Subtract and Assign: " + i);
        // Multiply and assign (And then print the num)
        i *= 10;
        System.out.print(", Multiply and Assign: " + i);

        // Divide and assign (And then print the num)

        i /= 25;
        System.out.print(", Divide and Assign: " + i);
        // Modulus and assign (And then print the num)
        i2 %= i;
        System.out.println(", Modulus and Assign: " + i2);
    }

    // Task 12: Relational Operators
    // Demonstrate the usage of relational operators
    // Expected Output: 10 is equal to 10: true, 10 is not equal to 5: true, 10 is greater than 5: true, 10 is less than 5: false
    public static void relationalOperators() {
        // Declare and initialize variables
        int x = 10;
        int y = 5;

        // Perform relational operations
        boolean b1 = x == 10;
        boolean b2 = x != y;
        boolean b3 = x > y;
        boolean b4 = x < y;
        // Print the results
        System.out.println("10 is equal to 10: " + b1 + ", 10 is not equal to 5: " + b2 + ", 10 is greater than 5: " + b3 + ", 10 is less than 5: " + b4);
    }

    // Main method to run all tasks
    // Please do not modify the main method
    public static void main(String[] args) {
        javaDataTypes();
        dataTypes();
        numbers();
        booleans();
        characters();
        javaTypeCastingManipulation();
        javaTypeCasting();
        javaOperators();
        comparisonOperators();
        comparisonOperatorsManipulation();
        assignmentOperators();
        relationalOperators();
    }
}
