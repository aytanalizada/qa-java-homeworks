package homework;

import java.lang.reflect.Array;
import java.util.*;

public class HomeWorkArrayList {


    public static void main(String[] args) {


        //### Task 1: Add and Print Elements in ArrayList
//- Create an `ArrayList` called `namesList` that holds string elements.
//        - Add at least three elements to the list (e.g., names).
//        - Iterate over `namesList` and print each element.
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Anna");
        namesList.add("Bella");
        namesList.add("Ella");
        for (String name : namesList) {
            System.out.println(name);
        }
//        ### Task 2: Add and Print Elements in LinkedList
//- Create a `LinkedList` called `cityList` that stores string elements.
//        - Add at least three elements to `cityList` (e.g., city names).
//        - Print all the elements in `cityList`.
        LinkedList<String> cityList = new LinkedList<>();
        cityList.add("Paris");
        cityList.add("Bruges");
        cityList.add("Milan");
        System.out.println(cityList);

//        ### Task 3: Add and Print Key-Value Pairs in HashMap
//- Create a `HashMap` called `ageMap` that maps string keys to integer values.
//- Add at least three key-value pairs (e.g., name as the key and age as the value).
//        - Print out all the key-value pairs from `ageMap`.
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 24);
        ageMap.put("Leon", 25);
        ageMap.put("Simba", 27);
        System.out.println(ageMap);
//        ### Task 4: Add and Print Elements in HashSet
//- Create a `HashSet` called `fruitSet` that stores unique string elements.
//- Add at least three elements to `fruitSet` (e.g., fruits).
//        - Print all the elements in `fruitSet`.
        HashSet<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Oranges");
        System.out.println(fruitSet);
//        ### Task 5: Remove an Element from ArrayList
//- Create an `ArrayList` called `productList` with at least three elements.
//- Remove one element from `productList`.
//        - Print the list before and after the removal.
        ArrayList<String> productList = new ArrayList<>();
        productList.add("Bread");
        productList.add("Rise");
        productList.add("Water");

        productList.remove("Bread");
        System.out.println(productList);
//        ### Task 6: Add an Element at the Beginning of LinkedList
//- Create a `LinkedList` called `bookList` and add at least two elements.
//        - Add an element to the beginning of `bookList`.
//        - Print `bookList` after adding the element at the beginning.
        LinkedList<String> bookList = new LinkedList<>();
        bookList.add("Animals");
        bookList.add("Flowers");
        bookList.addFirst("Tests");
        System.out.println(bookList);

//### Task 7: Check if a Key Exists in HashMap
//- Create a `HashMap` called `employeeMap` with at least three key-value pairs.
//        - Use a method to check if a specific key exists in `employeeMap`.
//        - Print a message indicating whether the key is present.
        HashMap<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Aytan", 27);
        employeeMap.put("Ayla", 26);
        employeeMap.put("Leyla", 24);
        if (employeeMap.containsKey("Ayla")) {
            System.out.println("Ayla is exist in the Map");
        }
//### Task 8: Check if a Value Exists in HashSet
//- Create a `HashSet` called `animalSet` with at least three elements.
//- Use a method to check if a particular element exists in `animalSet`.
//        - Print a message indicating whether the element is present.
        HashSet<Integer> animalSet = new HashSet<>();
        animalSet.add(20);
        animalSet.add(21);
        animalSet.add(22);
        if (animalSet.contains(22)) {
            System.out.println("AnimalSet has 22 number");
        }
//### Task 9: Clear All Elements from ArrayList
//- Create an `ArrayList` called `countryList` with at least three elements.
//- Use the method to clear all elements from `countryList`.
//        - Print `countryList` before and after clearing it.
        ArrayList<String> countryList = new ArrayList<>();
        countryList.add("Germany");
        countryList.add("Spain");
        countryList.add("Italy");
        System.out.println(countryList);
        countryList.clear();
        System.out.println(countryList);
//### Task 10: Get Size of LinkedList
//- Create a `LinkedList` called `carList` with at least two elements.
//- Use a method to get the size (number of elements) of `carList`.
//        - Print the size of `carList`.
//        ---
        LinkedList<Integer> carList = new LinkedList<>();
        carList.add(15);
        carList.add(16);
        System.out.println(carList.size());
//        ### Task 11: Employee Management System using HashMap and LinkedList
//**Objective**: This task involves managing employees by department using both `HashMap` and `LinkedList`.
//        - Create a `HashMap` where the key is the department name, and the value is a `LinkedList` of employees working in that department.
//        - Write options for the user to:
//        1. Add a new department.
//  2. Add an employee to a specific department.
//  3. Remove an employee from a department.
//        4. Display all employees in each department.
        HashMap<String, LinkedList<String>> departmentEmployees = new HashMap<>();
        LinkedList<String> hrEmployees = new LinkedList<>();
        hrEmployees.add("Ayla");
        departmentEmployees.put("HR", hrEmployees);
        System.out.println(departmentEmployees);
        departmentEmployees.get("HR").add("Leyla");
        System.out.println(departmentEmployees);
        //Remove the employee from department
        LinkedList<String> hr = departmentEmployees.get("HR");
        hr.remove("Leyla");
        departmentEmployees.put("HR", hr);
        System.out.println(hrEmployees);

//
//        **Research**: You will need to research how to use methods like:
//        - `putIfAbsent()` for initializing departments.
//        - Working with a `LinkedList` to add or remove employees.
//### Task 12: Student Grades Management using HashMap and HashSet
//**Objective**: This task involves managing students' grades for different subjects using both `HashMap` and `HashSet`.
//        - Create a `HashMap` where the key is the student's name and the value is another `HashMap` that stores subjects as keys and grades as values.
//        - Write options for the user to:
//        1. Add a new student.
//  2. Add a new subject and grade for a student.
//        3. Display all subjects and grades for each student.
//        4. Calculate and display the average grade for a particular student.
//
//**Research**: You will need to research how to:
//        - Handle nested `HashMap` structures.
//- Use `containsKey()` to check for existing entries.
//        - Calculate averages by iterating over the values in the inner `HashMap`.
//Ensure that your print statements are clear and descriptive, formatting the output in a way that makes the results easy to read and understand (e.g., using labels for each printed value).
        HashMap<String, HashMap<String, Integer>> studentSubjects = new HashMap<>();
        //Add new Student
        studentSubjects.put("Kate", new HashMap<>());
        //Add new subjects to student
        HashMap<String, Integer> kateSubjects = studentSubjects.get("Kate");
        kateSubjects.put("Alegbra", 90);
        kateSubjects.put("Chemistry", 75);
        studentSubjects.put("Kate", kateSubjects);
        //Get student subjects and print it
        System.out.println("Kate subjects:" + studentSubjects.get("Kate"));

        //Get student grades to calculate average
        int total = 0;
        HashMap<String, Integer> kateSubjectsMap = studentSubjects.get("Kate");
        for (Map.Entry<String, Integer> entry : kateSubjectsMap.entrySet()) {
            total = total + entry.getValue();
        }
        int average = total / kateSubjectsMap.size();
        System.out.println("Kate average of grade: " + average);


    }


}