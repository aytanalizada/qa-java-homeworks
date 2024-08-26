public class homework18 {


    public static void main(String[] args) {
        IncomeCalculator incomeCalculator = new IncomeCalculator(300, 150);
        System.out.println("Monthly income: " + incomeCalculator.getMonthly());
        System.out.println("Add: " + incomeCalculator.add());
        System.out.println("Substraction: " + incomeCalculator.sub());
        System.out.println("Multiplication: " + incomeCalculator.multi());
        System.out.println("Division: " + incomeCalculator.division());
    }
}

class IncomeCalculator {

    // Declare attributes here to hold two numbers for calculations
    int num1;
    int num2;

    // Method to set the numbers for calculation (Constructor method)
    // This method takes two parameters and assigns them to the attributes num1 and num2
    public IncomeCalculator(int myNum1, int myNum2) {
        num1 = myNum1;
        num2 = myNum2;
    }


    // Method to calculate monthly income
    // This method assumes num1 holds the daily income and multiplies it by 30 to get the monthly income
    public int getMonthly() {
        return num1 * 30;
    }


    // Method for addition
    // This method returns the sum of num1 and num2
    public int add() {
        int sum = num1 + num2;
        return sum;
    }


    // Method for subtraction
    // This method returns the difference between num1 and num2
    public int sub() {
        return num1 - num2;
    }

    // Method for multiplication
    // This method returns the product of num1 and num2
    public int multi() {
        return num1 * num2;
    }

    // Method for division
    // This method returns the result of dividing num1 by num2, but ensures no division by zero occurs
    public int division() {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
}