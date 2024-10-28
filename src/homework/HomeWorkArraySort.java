package homework;

import java.util.*;

public class HomeWorkArraySort {
    public static void main(String[] args) {


//### 1. **ArrayList: Add, Sort, and Handle Empty List**
//        - **Add**: `5, 12, 3, 19, 7` to the `ArrayList`.
//        - **Print**:
//        - If the list is **not empty**: Print the sorted list, e.g., `[3, 5, 7, 12, 19]`.
//        - If the list is **empty**: Print the exception message, e.g., "The list is empty. Cannot sort."
//        ---
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(12);
        arrayList.add(3);
        arrayList.add(19);
        arrayList.add(7);
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            System.out.println("The list is not empty: " + arrayList);
        } else {
            throw new RuntimeException("The list is empty. Cannot sort.");

        }


//        ### 2. **LinkedList: Add, Iterate, and Handle Invalid Removal**
//        - **Add**: `"John", "Sarah", "Michael", "Anna", "Tom"` to the `LinkedList`.
//        - **Print**:
//        - Print each name while iterating through the list.
//        - If attempting to remove `"Chris"` (which is not in the list), print the exception message, e.g., "Name 'Chris' not found in the list."
//        ---
        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Sarah");
        names.add("Michael");
        names.add("Anna");
        names.add("Tom");
        for (String name : names) {
            System.out.println(name);
        }
//        if (!names.remove("Chris")) {
//            throw new RuntimeException("Name 'Chris' not found in the list.");
//        }

//        ### 3. **HashMap: Add, Search, and Throw Custom Exception**
//        - **Add**:
//        - `"Alice" -> 30`
//        - `"Bob" -> 25`
//        - `"Charlie" -> 35`
//        - **Instructions**:
//        - Implement a method that searches for a key in the `HashMap`. If the key is not found, throw a custom exception, `KeyNotFoundException`.
//        - **Print**:
//        - If searching for `"Bob"` and **found**: Print, e.g., "Bob is 25 years old."
//        - If searching for `"David"` and **not found**: Catch the exception and print, e.g., "KeyNotFoundException: Key 'David' not found."
        HashMap<String, Integer> nameMap = new HashMap<>();
        nameMap.put("Alice", 30);
        nameMap.put("Bob", 25);
        nameMap.put("Charlie", 35);
        //  searchInMap(nameMap);
//        ---
//        ### 4. **HashSet: Add, Check for Duplicate, and Throw Exception**
//        - **Add**: `"Apple", "Banana", "Grape", "Mango"` to the `HashSet`. Then attempt to add `"Apple"` again (duplicate).
//        - **Print**:
//        - If a duplicate is **found**: Print the exception message, e.g., "Duplicate element 'Apple' found."
//        - If no duplicates: No message about duplicates should be printed.
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grape");
        fruits.add("Mango");
//        if (!fruits.add("Apple")){
//           throw new RuntimeException("Duplicate element 'Apple' found.");
//        }


//---
//        ### 5. **ArrayList: Find Element and Handle Not Found Exception**
//        - **Add**: `"Dog", "Cat", "Rabbit"` to the `ArrayList`.
//        - **Print**:
//        - If searching for `"Dog"` and **found**: Print, e.g., "Element 'Dog' found."
//        - If searching for `"Fish"` and **not found**: Print the exception message, e.g., "Element 'Fish' not found in the list."
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");
        if (animals.contains("Dog")) {
            System.out.println("Element 'Dog' found.");
        }
        // if (!animals.contains("Fish")){
        //   throw new RuntimeException("Element 'Fish' not found in the list.");
        // }
//        ---
//        ### 6. **LinkedList: Remove First Element and Handle Empty List**
//        - **Add**: `"Pineapple", "Strawberry"` to the `LinkedList`.
//        - **Print**:
//        - If the first element is **removed**: Print the updated list, e.g., `["Strawberry"]`.
//        - If the list is **empty**: Print the exception message, e.g., "Cannot remove from an empty list."
        LinkedList<String> fruitsName = new LinkedList<>();
        fruitsName.add("Pineapple");
        fruitsName.add("Strawberry");
        if (fruitsName.removeFirst() != null) {
            System.out.println(fruitsName);
        }
        // if (fruitsName.isEmpty()){
        //   throw new RuntimeException("Cannot remove from an empty list.");
        //  }
//        ---
//        ### 7. **HashMap: Retrieve Value and Handle Missing Key**
//        - **Add**:
//        - `"Tom" -> 45`
//        - `"Jerry" -> 22`
//        - `"Spike" -> 30`
//        - **Print**:
//        - If searching for `"Tom"` and **found**: Print, e.g., "Tom is 45 years old."
//        - If searching for `"Butch"` and **not found**: Print the exception message, e.g., "Key 'Butch' not found."
        HashMap<String, Integer> nameAge = new HashMap<>();
        nameAge.put("Tom", 45);
        nameAge.put("Jerry", 22);
        nameAge.put("Spike", 30);
        if (nameAge.containsKey("Tom")) {
            System.out.println("Tom is 45 years old.");
        }
        //   if (!nameAge.containsKey("Butch")){
        //    throw new RuntimeException("Key 'Butch' not found.");
        // }
//        ---
//        ### 8. **HashSet: Remove and Handle Missing Element**
//        - **Add**: `"New York", "London", "Tokyo"` to the `HashSet`.
//        - **Print**:
//        - If `"London"` is **removed**: Print the updated set, e.g., `["New York", "Tokyo"]`.
//        - If trying to remove `"Rome"` (which is not in the set): Print the exception message, e.g., "Element 'Rome' not found in the set."
        HashSet<String> cityName = new HashSet<>();
        cityName.add("New York");
        cityName.add("London");
        cityName.add("Tokyo");
//        if (cityName.remove("London")) {
//            System.out.println(cityName);
//        }
//        if (!cityName.remove("Rome")) {
//            throw new RuntimeException("Element 'Rome' not found in the set.");
//        }
//        ---
//        ### 9. **ArrayList: Modify Element and Handle Invalid Index**
//        - **Add**: `"Apple", "Banana"` to the `ArrayList`.
//        - **Print**:
//        - If the second element is **modified** to `"Orange"`: Print the updated list, e.g., `["Apple", "Orange"]`.
//        - If the index is **invalid** (e.g., trying to modify index 5): Print the exception message, e.g., "Invalid index: 5."
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.set(1, "Orange");
        System.out.println(fruit);
        if (fruit.size() < 5) {
            throw new RuntimeException("Invalid index: 5.");
        }
//        ---
//        ### 10. **LinkedList: Insert at Index and Handle Invalid Index**
//        - **Add**: `"Monday", "Tuesday"` to the `LinkedList`.
//        - **Print**:
//        - If `"Wednesday"` is **inserted** at index 1: Print the updated list, e.g., `["Monday", "Wednesday", "Tuesday"]`.
//        - If the index is **invalid** (e.g., trying to insert at index 10): Print the exception message, e.g., "Invalid index: 10."
        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add(1, "Wednesday");
        if (days.size() < 10) {
            throw new RuntimeException("Invalid index: 10.");
        }
    }

    public static void searchInMap(HashMap<String, Integer> nameMap) {
        if (nameMap.containsKey("Bob")) {
            System.out.println("Bob is " + nameMap.get("Bob") + " years old.");
        }
        if (!nameMap.containsKey("David")) {
            throw new KeyNotFoundException("KeyNotFoundException: Key 'David' not found.");
        }
    }

}

class KeyNotFoundException extends RuntimeException {
    public KeyNotFoundException() {
        super();
    }

    public KeyNotFoundException(String message) {
        super(message);
    }

}