public class MainApp {

    //Declare a main method here
    public static void main(String[] args) {


        // Step 1: Create an object of IncomeCalculator
        // This will allow us to use the methods to perform calculations
       IncomeCalculator incomeCalculator=new IncomeCalculator();

        // Step 2: Set the numbers for calculation
        // Call the method to assign two values for num1 and num2
        incomeCalculator.set(300,150);

        // Step 3: Calculate the monthly income
        // Call the method to calculate monthly income based on num1 (daily income)
        // Store the result and print it
       int monthly= incomeCalculator.getMonthly();
        System.out.println("Monthly income: "+ monthly);

        // Step 4: Perform addition
        // Call the method to add num1 and num2 and store the result
        // Print the result of the addition
        int addition=incomeCalculator.add();
        System.out.println("Addition: "+addition);

        // Step 5: Perform subtraction
        // Call the method to subtract num2 from num1 and store the result
        // Print the result of the subtraction
     int subtraction=incomeCalculator.sub();
        System.out.println("Subtraction: "+subtraction);

        // Step 6: Perform multiplication
        // Call the method to multiply num1 and num2 and store the result
        // Print the result of the multiplication
      int multiplication=incomeCalculator.multi();
        System.out.println("Multiplication: "+multiplication);

        // Step 7: Perform division
        // Call the method to divide num1 by num2 and store the result
        // Print the result of the division
        int division=incomeCalculator.division();
        System.out.println("Division: "+division);
    }
}