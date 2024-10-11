package homework;

public class AbstractionHomeWork {
    public static void main(String[] args) {
        //    Main Class Instructions:
//            1. Create an object of the WashingMachine class with a load capacity of your choice.
//            2. Call the following methods on the WashingMachine object:
//            • displayApplianceType()
// • calculatePower()
// • warrantyPeriod()
// • displayLoadCapacity()
        WashingMachine washingMachine = new WashingMachine(100);
        washingMachine.displayApplianceType("washingMachine");
        System.out.println("WashingMachine power:" + washingMachine.calculatePower());
        washingMachine.displayLoadCapacity();
        // 3. Create an object of the Refrigerator class with a temperature range of your choice.
//            4. Call the following methods on the Refrigerator object:
//            • displayApplianceType()
// • calculatePower()
// • warrantyPeriod()
// • displayCoolingTemperature()
        Refrigerator refrigerator = new Refrigerator(65);
        refrigerator.displayApplianceType("refrigerator");
        System.out.println("Refrigerator power: " + washingMachine.calculatePower());
        System.out.println("Refrigerator warranty period: "+refrigerator.warrantyPeriod());
        refrigerator.displayCoolingTemperature();

        // 5. Create an object of the Microwave class with a cooking mode of your choice.
//            6. Call the following methods on the Microwave object:
//            • displayApplianceType()
// • calculatePower()
// • warrantyPeriod()
// • displayCookingMode()
//    Power Calculation Examples:
//            • Washing Machine: If the washing machine uses 500 watts and is used for 2 hours, the power consumption is:
//    Power = 500 watts * 2 hours = 1000 watts
        Microwave microwave = new Microwave("defrost");
        System.out.println("Microwave power: " + washingMachine.calculatePower());
        System.out.println("Microwave warranty period: "+refrigerator.warrantyPeriod());
        microwave.displayCookingMode();

    }


   /* In this task, you will create an abstract class Appliance that defines the structure for different types of household appliances. You will then implement three concrete classes: WashingMachine, Refrigerator, and Microwave, which will inherit from the abstract class and provide their own implementation of the abstract methods.
            Each class will:
            • Define specific attributes (e.g., load capacity for a washing machine, temperature range for a refrigerator, etc.).
            • Implement a method to calculate power consumption based on the appliance’s usage.
            • Implement a method to determine the warranty period using certain conditions.
 • Include a concrete method to display the type of appliance. */
}
//  In the Main class, you will create objects of these three subclasses, and perform operations such as displaying the appliance type, calculating the power usage, and determining the warranty period.

// Create an abstract class Appliance:
//            1. Define two abstract methods:
//            • calculatePower(): This method should return a double representing the power consumption of the appliance.
//            • warrantyPeriod(): This method should return an int representing the warranty period (in years).
//            2. Define a concrete method displayApplianceType(String type):
//            • This method should print the type of appliance passed as a parameter.
abstract class Appliance {
    public abstract double calculatePower();

    public abstract int warrantyPeriod();

    public void displayApplianceType(String type) {
        System.out.println("Appliance: " + type);
    }
}

//    Create a subclass WashingMachine that extends Appliance:
//            1. Define an attribute loadCapacity (int) for the washing machine.
// 2. Create a constructor that initializes loadCapacity.
//            3. Implement calculatePower():
//            • Use the formula: Power = Watts * Hours of usage.
// • Example: Assume the washing machine uses 500 watts and is used for 2 hours.
// 4. Implement warrantyPeriod():
//            • If loadCapacity is 7 or more, return a warranty of 2 years.
// • Otherwise, return a warranty of 1 year.
// 5. Create a method displayLoadCapacity() to print the washing machine’s load capacity.
class WashingMachine extends Appliance {
    int loadCapacity;
    private final int WATT = 500;
    private final int USAGE_HOURS = 2;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculatePower() {
        return WATT * USAGE_HOURS;
    }

    public int warrantyPeriod() {
        if (loadCapacity >= 7) {
            return 2;
        }
        return 1;
    }

    public void displayLoadCapacity() {
        System.out.println("Washing machine’s load capacity is " + loadCapacity);
    }

}

//    Create a subclass Refrigerator that extends Appliance:
//            1. Define an attribute temperatureRange (int) for the refrigerator.
//            2. Create a constructor that initializes temperatureRange.
//            3. Implement calculatePower():
//            • Use the formula: Power = Power draw (Watts) * Running time (Hours).
//            • Example: Assume the refrigerator uses 100 watts and runs for 24 hours.
// 4. Implement warrantyPeriod():
//            • If temperatureRange is less than 5, return a warranty of 3 years.
// • Otherwise, return a warranty of 2 years.
// 5. Create a method displayCoolingTemperature() to print the refrigerator’s cooling temperature range.
class Refrigerator extends Appliance {
    int temperatureRange;
    private final int WATTS = 100;
    private final int RUN_TIME = 24;

    public Refrigerator(int temperatureRange) {
        this.temperatureRange = temperatureRange;
    }

    @Override
    public double calculatePower() {

        return WATTS * RUN_TIME;
    }

    @Override
    public int warrantyPeriod() {
        if (temperatureRange < 5) {
            return 3;
        }
        return 2;
    }

    public void displayCoolingTemperature() {
        System.out.println("The refrigerator’s cooling temperature range is " + temperatureRange);
    }
}

//    Create a subclass Microwave that extends Appliance:
//            1. Define an attribute cookingMode (String) for the microwave.
//            2. Create a constructor that initializes cookingMode.
//            3. Implement calculatePower():
//            • Use the formula: Power = Wattage * Usage time (in hours).
//            • Example: Assume the microwave uses 1200 watts and is used for 30 minutes (divide minutes by 60 to convert to hours).
//            4. Implement warrantyPeriod():
//            • If cookingMode is “defrost”, return a warranty of 2 years.
// • Otherwise, return a warranty of 1 year.
// 5. Create a method displayCookingMode() to print the microwave’s cooking mode.
class Microwave extends Appliance {
    private String cookingMode;

    private final int WATTS = 1200;
    private final int RUN_TIME = 30 / 60;

    public Microwave(String cookingMode) {
        this.cookingMode = cookingMode;
    }

    @Override
    public double calculatePower() {
        return WATTS * RUN_TIME;
    }

    @Override
    public int warrantyPeriod() {
        if (this.cookingMode.equals("defrost")) {
            return 2;
        }
        return 1;
    }

    public void displayCookingMode() {
        System.out.println("Microwave’s cooking mode:" + cookingMode);
    }
}