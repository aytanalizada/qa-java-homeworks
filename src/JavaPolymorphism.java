import java.nio.channels.FileChannel;

public class JavaPolymorphism {
    public static void main(String[] args) {
        // Task 1 // In the main method, create objects of Cat,Dog, and Cow, and call the makeSound() method for each
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        cat.makeSound();
        dog.makeSound();
        cow.makeSound();
        //Task 2// In the main method, create objects of Circle, Rectangle, and Triangle, and call the draw() method for each
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        circle.draw();
        rectangle.draw();
        triangle.draw();
        //Task 3// In the main method, create objects of CreditCardPayment and PayPalPayment, and call the processPayment() method for each
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();
        creditCardPayment.processPayment();
        payPalPayment.processPayment();
        //Task 4// In the main method, create objects of Car, Bike, and Truck, and call the startEngine() method for each
        Car car = new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();
        car.startEngine();
        bike.startEngine();
        truck.startEngine();
        //Task 5// In the main method, create objects of FullTimeEmployee, PartTimeEmployee, and ContractEmployee, and call the calculateBonus() method for each
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        ContractEmployee contractEmployee = new ContractEmployee();
        fullTimeEmployee.calculateBonus();
        partTimeEmployee.calculateBonus();
        contractEmployee.calculateBonus();
        //Task 6// In the main method, create objects of Guitar, Piano, and Drum, and call the play() method for each
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Drum drum = new Drum();
        guitar.play();
        piano.play();
        drum.play();
        //Task 7// In the main method, create objects of SavingsAccount and FixedDepositAccount, and call the calculateInterest() method for each
        SavingsAccount savingsAccount = new SavingsAccount();
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount();
        savingsAccount.calculateInterest();
        fixedDepositAccount.calculateInterest();
        //Task 8// In the main method, create objects of AudioPlayer and VideoPlayer, and call the playMedia() method for each
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();
        audioPlayer.playMedia();
        videoPlayer.playMedia();
        //Task 9// In the main method, create objects of OnlineOrder and InStoreOrder, and call the processOrder() method for each
        OnlineOrder onlineOrder = new OnlineOrder();
        InStoreOrder inStoreOrder = new InStoreOrder();
        onlineOrder.processOrder();
        inStoreOrder.processOrder();
        //Task 10// In the main method, create objects of Bird, Fish, and Mammal, and call the move() method for each
        Bird bird = new Bird();
        Fish fish = new Fish();
        Mammal mammal = new Mammal();
        bird.move();
        fish.move();
        mammal.move();
    }
}

// Task 1: Method Overriding with Animal Classes
// Create a base class Animal with a method makeSound() that prints "Animal makes a sound"
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Create derived classes Cat, Dog, and Cow, each overriding makeSound() to print their respective sounds
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog makes a sound");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow makes a sound");
    }
}

// Task 2: Shape Drawing with Overriding
// Create a base class Shape with a method draw() that prints "Drawing a generic shape"
class Drawing {
    public void draw() {
        System.out.println("Drawing a generic shape");
    }
}

// Create derived classes Circle, Rectangle, and Triangle, each overriding draw() to print their respective drawings
class Circle extends Drawing {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Drawing {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Triangle extends Drawing {
    public void draw() {
        System.out.println("Drawing Triangle");

    }
}

// Task 3: Polymorphism with Payment Processing
// Create a base class Payment with a method processPayment() that prints "Processing a generic payment"
class Payment {
    public void processPayment() {
        System.out.println("Processing a generic payment");
    }
}

// Create derived classes CreditCardPayment and PayPalPayment, each overriding processPayment() to print their respective payment types
class CreditCardPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing a credit card payment");
    }
}

class PayPalPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing a paypal payment");
    }
}

// Task 4: Polymorphism with Vehicles
// Create a base class Vehicle with a method startEngine() that prints "Starting generic vehicle engine"
class Vehicle {
    public void startEngine() {
        System.out.println("Starting generic vehicle engine");
    }
}

// Create derived classes Car, Bike, and Truck, each overriding startEngine() to print their respective engine starts
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting generic car engine");
    }
}

class Bike extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting generic bike engine");
    }

}

class Truck extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting generic truck engine");
    }

}

// Task 5: Employee Polymorphism
// Create a base class Employee with a method calculateBonus() that prints "Generic employee bonus"
class Employee {
    public void calculateBonus() {
        System.out.println("Generic employee bonus");
    }
}

// Create derived classes FullTimeEmployee, PartTimeEmployee, and ContractEmployee, each overriding calculateBonus() to print their respective bonuses
class FullTimeEmployee extends Employee {
    @Override
    public void calculateBonus() {
        System.out.println("Generic full time employee bonus");
    }
}

class PartTimeEmployee extends Employee {
    @Override
    public void calculateBonus() {
        System.out.println("Generic part time employee bonus");
    }
}

class ContractEmployee extends Employee {
    @Override
    public void calculateBonus() {
        System.out.println("Generic contract employee bonus");
    }
}

// Task 6: Polymorphism with Instruments
// Create a base class Instrument with a method play() that prints "Playing a generic instrument"
class Instrument {
    public void play() {
        System.out.println("Playing a generic instrument");
    }
}

// Create derived classes Guitar, Piano, and Drum, each overriding play() to print their respective sounds
class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing a Guitar instrument");
    }
}

class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing a Piano instrument");
    }
}

class Drum extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing a Drum instrument");
    }
}

// Task 7: Polymorphism in Banking System
// Create a base class BankAccount with a method calculateInterest() that prints "Calculating interest for a generic bank account"
class BankAccount {
    public void calculateInterest() {
        System.out.println("Calculating interest for a generic bank account");
    }
}

// Create derived classes SavingsAccount and FixedDepositAccount, each overriding calculateInterest() to print their respective interest calculations
class SavingsAccount extends BankAccount {
    @Override
    public void calculateInterest() {
        System.out.println("Calculating interest for a saving bank account");
    }
}

class FixedDepositAccount extends BankAccount {
    @Override
    public void calculateInterest() {
        System.out.println("Calculating interest for a fixed deposit bank account");
    }
}

// Task 8: Polymorphism with Media Players
// Create a base class MediaPlayer with a method playMedia() that prints "Playing media in a generic way"
class MediaPlayer {
    public void playMedia() {
        System.out.println("Playing media in a generic way");
    }
}

// Create derived classes AudioPlayer and VideoPlayer, each overriding playMedia() to print their respective media types
class AudioPlayer extends MediaPlayer {
    @Override
    public void playMedia() {
        System.out.println("Playing media in a audio player way");
    }
}

class VideoPlayer extends MediaPlayer {
    @Override
    public void playMedia() {
        System.out.println("Playing media in a video player way");
    }
}

// Task 9: Polymorphism with Orders
// Create a base class Order with a method processOrder() that prints "Processing a generic order"
class Order {
    public void processOrder() {
        System.out.println("Processing a generic order");
    }
}

// Create derived classes OnlineOrder and InStoreOrder, each overriding processOrder() to print their respective order processing messages
class OnlineOrder extends Order {
    @Override
    public void processOrder() {
        System.out.println("Processing a online order");
    }
}

class InStoreOrder extends Order {
    @Override
    public void processOrder() {
        System.out.println("Processing a in store order");
    }
}

// Task 10: Polymorphism with Animals and Behaviors
// Create a base class Animal1 with a method move() that prints "Animal is moving"
class Animal1 {
    public void move() {
        System.out.println("Animal is moving");
    }
}

// Create derived classes Bird, Fish, and Mammal, each overriding move() to print their respective modes of movement
class Bird extends Animal1 {
    @Override
    public void move() {
        System.out.println("Bird is moving");
    }
}

class Fish extends Animal1 {
    public void move() {
        System.out.println("Fish is moving");
    }
}

class Mammal extends Animal1 {
    public void move() {
        System.out.println("Mammal is moving");
    }
}

