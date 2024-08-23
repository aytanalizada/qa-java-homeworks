import java.security.PublicKey;

public class Homework17 {
    // Task 1: Create a Class for a Car
    // Instruction: Create a class called "Car" with fields like make, model, and year.
    // Create methods to set and get these values, and a method to display car information.
    // In the main method, create an object of Car and call the methods to display the car information.
    public static class Car {
        String make;
        String model;
        int year;

        public void drive() {

            System.out.println("My car information: " + make + " " + model + " " + year);
        }
    }


    // Task 2: Create a Class for a Person
    // Instruction: Create a class called "Person" with fields for name and age.
    // Add a method to display the person's name and age.
    // In the main method, create an object of Person and display the person's details.
    public static class Person {
        String name;
        int age;

        public void about() {
            System.out.println("Person information: " + name + " " + age);

        }
    }


    // Task 3: Create a Class for a Rectangle
    // Instruction: Create a class called "Rectangle" with fields for length and width.
    // Add a method to calculate and return the area of the rectangle.
    // In the main method, create an object of Rectangle and display the area.
    public static class Rectangle {
        double length;
        double width;

        public double area() {
            double area = length * width;
            System.out.println("Area: " + area);
            return area;
        }


    }

    // Task 4: Create a Class for a Book
    // Instruction: Create a class called "Book" with fields for title, author, and number of pages.
    // Add a method to display the book's information.
    // In the main method, create an object of Book and display the book details.
    public static class Book {
        String title;
        String author;
        int pageNumber;

        public void display() {
            System.out.println("Book's information: " + title + ", " + author + ", " + pageNumber);
        }
    }

    // Task 5: Create a Class for a Student
    // Instruction: Create a class called "Student" with fields for name and grade.
    // Add a method to display the student's name and grade.
    // In the main method, create an object of Student and display the student's details.
    public static class Student {
        String name;
        int grade;

        public void displayStudent() {
            System.out.println("Student's name is " + name + " and grade " + grade);
        }
    }

    // Task 6: Create a Class for a Circle
    // Instruction: Create a class called "Circle" with a field for the radius.
    // Add a method to calculate and return the area of the circle.
    // In the main method, create an object of Circle and display the area.
    public static class Circle {
        double radius;

        public double area() {
            double area = Math.PI * radius * radius;
            System.out.println("Circle area is " + area);
            return area;

        }
    }

    // Task 7: Create a Class for a Bank Account
    // Instruction: Create a class called "BankAccount" with fields for account number and balance.
    // Add methods to deposit and withdraw money, and a method to display the balance.
    // In the main method, create an object of BankAccount and perform some transactions.
    public static class BankAccount {
        int accountNumber;
        int accountBalance;

        public void deposit(int amount) {
            accountBalance = accountBalance + amount;
        }

        public void withdraw(int amount) {
            accountBalance = accountBalance - amount;
        }

        public void displayBalance() {
            System.out.println("Bank account number is: " + accountNumber + " and balance is: " + accountBalance);
        }
    }

    // Task 8: Create a Class for a Dog
    // Instruction: Create a class called "Dog" with fields for name and breed.
    // Add a method to display the dog's name and breed.
    // In the main method, create an object of Dog and display the dog's information.
    public static class Dog {
        String dogName;
        String dogBreed;

        public void display1() {
            System.out.println("Dog name is " + dogName + " and breed is " + dogBreed);
        }
    }

    // Task 9: Create a Class for a Movie
    // Instruction: Create a class called "Movie" with fields for title, director, and release year.
    // Add a method to display the movie's details.
    // In the main method, create an object of Movie and display the movie details.
    public static class Movie {
        String title;
        String director;
        int year;

        public void displayMovie() {
            System.out.println("Movie's details:Movie name is " + title + ", Director name is " + director + ",year " + year);
        }
    }

    // Task 10: Create a Class for a Laptop
    // Instruction: Create a class called "Laptop" with fields for brand, model, and price.
    // Add a method to display the laptop's information.
    // In the main method, create an object of Laptop and display the laptop's details.

    public static class Laptop {
        String laptopBrand;
        String laptopModel;
        int laptopPrice;

        public void displayLaptop() {
            System.out.println("Laptop's information: " + laptopBrand + " " + laptopModel + ", Price: " + laptopPrice + "$");
        }
    }

    // Main method to call all tasks
    public static void main(String[] args) {
        Car car = new Car();
        car.make = "Porcshe";
        car.model = "Cayenne";
        car.year = 2024;
        car.drive();

        Person person = new Person();
        person.name = "Aytan";
        person.age = 26;
        person.about();

        Rectangle rectangle = new Rectangle();
        rectangle.width = 2.50;
        rectangle.length = 4.50;
        rectangle.area();

        Book book = new Book();
        book.title = "Flowers";
        book.author = "Aytan";
        book.pageNumber = 7;
        book.display();

        Student student = new Student();
        student.name = "John";
        student.grade = 90;
        student.displayStudent();

        Circle circle = new Circle();
        circle.radius = 2.7;
        circle.area();

        BankAccount bankAccount = new BankAccount();
        bankAccount.accountBalance = 10000;
        bankAccount.accountNumber = 7777;
        bankAccount.deposit(100);
        bankAccount.withdraw(200);
        bankAccount.displayBalance();

        Dog dog = new Dog();
        dog.dogName = "Mocha";
        dog.dogBreed = "Poodle";
        dog.display1();

        Movie movie = new Movie();
        movie.title = "Home alone";
        movie.director = "Macaulay Culkin";
        movie.year = 1990;
        movie.displayMovie();

        Laptop laptop = new Laptop();
        laptop.laptopBrand = "Apple";
        laptop.laptopModel = "Macbook Pro 14";
        laptop.laptopPrice = 4000;
        laptop.displayLaptop();


    }
}

