package homework;

public class InheritanceHomeWork {

    public static void main(String[] args) {
        //Task 1 // Create an object of homework.Dog and call both makeSound() and bark() methods.
        Dog dog = new Dog();
        dog.bark();
        dog.makeSound();
        //Task 2 // Create an object of homework.Car, call the setType() method, and then print the type field.
        Car car = new Car();
        car.setType();
        System.out.println("homework.Car type: " + car.type);
        //Task 3// Create an object of homework.Cylinder and call all three methods: draw(), drawCircle(), and drawCylinder().
        Cylinder cylinder = new Cylinder();
        cylinder.draw();
        cylinder.drawCircle();
        cylinder.drawCylinder();
        //Task 4//// Create an object of homework.Manager and call all three methods: display(), showDetails(), and showFullDetails().
        Manager manager = new Manager();
        manager.display();
        manager.showDetails();
        manager.showFullDetails();
        //Task 5// Create objects of both homework.Apple and homework.Banana and call both taste() and flavor() methods.
        Apple apple = new Apple();
        Banana banana = new Banana();
        apple.taste();
        apple.flavor();
        banana.taste();
        banana.flavor();
        //Task 6// Create an object of homework.AdvancedCalculator and call the add methods with different parameters without calling the parent class methods explicitly.
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.add(1, 5);
        advancedCalculator.add(1.5, 5.5);
        //Task 7// Create an object of homework.Child and call both message() and displayParentMessage().
        Child child = new Child();
        child.message();
        child.displayParentMessage();
        //Task 8// Create an object of homework.SavingsAccount, deposit 1500, and call applyInterest().
        // Check and print the balance before and after applying interest.
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1500);
        System.out.println("Current balance after applying interest: " + savingsAccount.applyInterest());
        //Task 9// Create an object of homework.SportsCar and call accelerate() three times.
        SportsCar sportsCar = new SportsCar();
        for (int i = 1; i <= 3; i++) {
            sportsCar.accelerate();
        }
        //Task 10 // Create objects of homework.Smartphone and homework.Tablet and use them to turn on the devices and use battery until the low battery warning appears.
          Smartphone smartphone=new Smartphone();
          Tablet tablet=new Tablet();
          smartphone.batteryLevel=95;
          tablet.batteryLevel=35;
          smartphone.turnOn();
          tablet.turnOn();
          smartphone.useBattery(70);
          smartphone.useBattery(15);
          tablet.useBattery(10);
    }
}

// Task 1
// Create a base class called homework.Animal with a method makeSound() that prints "homework.Animal sound".
class Animal {
    public void makeSound() {
        System.out.println("homework.Animal sound");
    }
}

// Create a derived class called homework.Dog that extends homework.Animal and defines a new method bark() that prints "Bark".
class Dog extends Animal {
    public void bark() {
        System.out.println("Bark");
    }
}


// Task 2
// Create a base class homework.Vehicle with a field type initialized to "Generic homework.Vehicle".
class Vehicle {
    String type = "Generic homework.Vehicle";
}

// Create a derived class homework.Car that extends homework.Vehicle and sets the value of type to "homework.Car" in a method called setType().
class Car extends Vehicle {
    public void setType() {
        type = "homework.Car";
    }
}

// Task 3
// Create a class homework.Shape with a method draw() that prints "Drawing homework.Shape".
class Shape {
    public void draw() {
        System.out.println("Drawing homework.Shape");
    }
}

// Create a class homework.Circle that extends homework.Shape and defines a new method drawCircle() that prints "Drawing homework.Circle".
class Circle extends Shape {
    public void drawCircle() {
        System.out.println("Drawing homework.Circle");
    }
}

// Create another class homework.Cylinder that extends homework.Circle and defines a new method drawCylinder() that prints "Drawing homework.Cylinder".
class Cylinder extends Circle {
    public void drawCylinder() {
        System.out.println("Drawing homework.Cylinder");
    }
}

// Task 4
// Create a class homework.Person with a field name initialized to "John" and a method display() that prints the name.
class Person {
    String name = "John";

    public void display() {
        System.out.println("Name: " + name);
    }
}

// Create a class homework.Employee that extends homework.Person and adds a field salary initialized to 50000 with a method showDetails() that prints name and salary.
class Employee extends Person {
    int salary = 50000;

    public void showDetails() {
        System.out.println(name + "'s salary is " + salary);
    }
}

// Create another class homework.Manager that extends homework.Employee and adds a field department initialized to "IT" with a method showFullDetails() that prints name, salary, and department.
class Manager extends Employee {
    String department = "IT";

    public void showFullDetails() {
        System.out.println(name + " " + salary + " " + department);
    }
}

// Task 5
// Create a class homework.Fruit with a method taste() that prints "Taste of homework.Fruit".
class Fruit {
    public void taste() {
        System.out.println("Taste of homework.Fruit");
    }
}

// Create two derived classes homework.Apple and homework.Banana that extend homework.Fruit and have their own method flavor().
// homework.Apple should print "Taste of homework.Apple" and homework.Banana should print "Taste of homework.Banana".
class Apple extends Fruit {
    public void flavor() {
        System.out.println("Taste of homework.Apple");
    }
}

class Banana extends Fruit {
    public void flavor() {
        System.out.println("Taste of homework.Banana");
    }
}


// Task 6
// Create a class homework.Calculator with a method add(int a, int b) that returns the sum of two integers.
// Add another method add(double a, double b) that returns the sum of two doubles (this is method overloading).
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// Create a subclass homework.AdvancedCalculator that extends homework.Calculator and adds a method multiply(int a, int b) that returns the product of two integers.
class AdvancedCalculator extends Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }
}

// Task 7
// Create a base class homework.Parent with a method message() that prints "Message from homework.Parent".
class Parent {
    public void message() {
        System.out.println("Message from homework.Parent");
    }
}
// Create a derived class homework.Child that extends homework.Parent and overrides the message() method to print "Message from homework.Child".
// In the homework.Child class, create a method displayParentMessage() that creates an object of homework.Parent and calls the message() method from that object.

class Child extends Parent {
    public void message() {
        System.out.println("Message from homework.Child");
    }

    public void displayParentMessage() {
        Parent parent = new Parent();
        parent.message();
    }
}

// Task 8
// Create a base class homework.BankAccount with a method deposit(int amount) that increases the account balance and prints the balance.
class BankAccount {
    int balance = 0;

    public int deposit(int amount) {
        balance = balance + amount;
        System.out.println("Balance: " + balance);
        return balance;
    }
}

// Create a derived class homework.SavingsAccount that adds a method applyInterest() which increases the balance by 5% if the balance is above 1000.
class SavingsAccount extends BankAccount {
    public double applyInterest() {
        if (balance > 1000) {
            return balance + (double) (balance * 5) / 100;
        }
        return balance;
    }
}

// Task 9
// Create a class homework.Vehicle with a method drive() that prints "homework.Vehicle is driving".
class Vehicle2 {
    public void drive() {
        System.out.println("homework.Vehicle is driving");
    }
}

// Create a class homework.Car that extends homework.Vehicle and adds a field gear.
class Car2 extends Vehicle2 {
    int gear = 0;
}

// Create a class homework.SportsCar that extends homework.Car and has a method accelerate() that increases the gear by 1, up to a maximum of 5.
// Inside accelerate(), use a loop to call drive() and print the current gear.
class SportsCar extends Car2 {
    public void accelerate() {
        if (gear < 5) {
            gear++;
        }
        drive();
        System.out.println("Gear: " + gear);
    }
}

// Task 10
// Create a base class homework.Device with a method turnOn() that prints "homework.Device is turned on".
class Device {
    int batteryLevel = 0;

    void turnOn() {
        System.out.println("homework.Device is turned on");
    }

    public void useBattery(int amount) {
        batteryLevel = batteryLevel - amount;
        if (batteryLevel < 20) {
            System.out.println("Low battery warning");
        }

    }
}

// Create two derived classes homework.Smartphone and homework.Tablet.
class Smartphone extends Device {

}

class Tablet extends Device {

}
// Add a field batteryLevel in homework.Device and methods useBattery(int amount) in both homework.Smartphone and homework.Tablet that reduce batteryLevel.

// If batteryLevel is less than 20, print "Low battery warning".

