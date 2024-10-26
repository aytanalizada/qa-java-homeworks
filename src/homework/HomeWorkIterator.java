package homework;

import java.util.*;

public class HomeWorkIterator {

    //Here are the tasks with a note added about researching certain methods:
//        1. Create an Iterator for a List
// • Task: Write a Java program to create a list of integers, then use an Iterator to print each element of the list.
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(3);
        list.add(5);
        list.add(10);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        2. Remove Even Numbers from a List
// • Task: Write a program that creates a list of integers. Use an Iterator to remove all the even numbers from the list.
        Iterator<Integer> removeIterator = list.iterator();
        while (removeIterator.hasNext()) {
            Integer current = removeIterator.next();
            if (current % 2 == 0) {
                removeIterator.remove();
            }
        }
        System.out.println("This is remove result: " + list);
//        3. Count Occurrences of a Specific Value in a List
// • Task: Create a list of strings. Use an Iterator to count how many times a specific string appears in the list.
        ArrayList<String> specificValueList = new ArrayList<>();
        specificValueList.add("Germany");
        specificValueList.add("France");
        specificValueList.add("Poland");
        specificValueList.add("France");
        specificValueList.add("France");
        int count = 0;

        Iterator<String> valueList = specificValueList.iterator();
        while (valueList.hasNext()) {
            String value = valueList.next();
            if (value.equals("France")) {
                count++;
            }
        }
        System.out.println("France count: " + count);
//4. Find Maximum Value in a List
// • Task: Write a program that creates a list of integers. Use an Iterator to find and print the maximum value in the list.
        ArrayList<Integer> maxValue = new ArrayList<>();
        maxValue.add(1);
        maxValue.add(11);
        maxValue.add(-9);
        Iterator<Integer> findMaxValue = maxValue.iterator();
        int maxNumber = Integer.MIN_VALUE;
        while (findMaxValue.hasNext()) {
            int current = findMaxValue.next();
            if (maxNumber < current) {
                maxNumber = current;
            }
        }
        System.out.println("MaxNumber is : " + maxNumber);

//5. Reverse Print a List Using an Iterator
// • Task: Create a list of strings. Use an Iterator to print the elements in reverse order (using a ListIterator).
        ArrayList<String> reversePrint = new ArrayList<>();
        reversePrint.add("Good Morning");
        reversePrint.add("Hello");
        ListIterator<String> listIterator = reversePrint.listIterator(reversePrint.size());
        while (listIterator.hasPrevious()) {
            String curr = listIterator.previous();
            System.out.println(curr);
        }
//        6. Remove Duplicates from a List
// • Task: Write a program that creates a list of integers with duplicate values. Use an Iterator to remove the duplicate values from the list.
        ArrayList<Integer> duplicatedNum = new ArrayList<>();
        duplicatedNum.add(1);
        duplicatedNum.add(2);
        duplicatedNum.add(1);
        HashMap<Integer, Integer> map = new HashMap<>();
        Iterator<Integer> duplicatedIterator = duplicatedNum.iterator();
        while (duplicatedIterator.hasNext()) {
            int current = duplicatedIterator.next();
            if (!map.containsKey(current)) {
                map.put(current, 1);
            } else {
                duplicatedIterator.remove();
            }
        }
        System.out.println(duplicatedIterator);
//7. Modify Each Element in a List
// • Task: Create a list of integers. Use an Iterator to multiply each element in the list by 2 and update the list.
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        Iterator<Integer> numsIterator = nums.iterator();
        int index = 0;
        while (numsIterator.hasNext()) {
            int curr = numsIterator.next();
            curr = curr * 2;
            nums.set(index, curr);
            index++;
        }
        System.out.println(nums);
//        8. Check if All Elements Match a Condition
// • Task: Write a program that creates a list of integers. Use an Iterator to check if all elements in the list are positive numbers.
        List<Integer> matchConditionNums = new ArrayList<>();
        matchConditionNums.add(-1);
        matchConditionNums.add(100);
        matchConditionNums.add(20);
        Iterator<Integer> conditionNumsIterator = matchConditionNums.iterator();
        while (conditionNumsIterator.hasNext()) {
            Integer next = conditionNumsIterator.next();
            if (next > 0) {
                System.out.println("This number is positive: " + next);
            }
        }
//        9. Find Common Elements Between Two Lists Using Iterators
// • Task: Create two lists of integers. Use Iterators to find the common elements between the two lists and store them in a third list.

        List<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        List<Integer> nums2 = new ArrayList<>();
        nums2.add(2);
        nums2.add(3);
        nums2.add(4);
        List<Integer> nums3 = new ArrayList<>();
        Iterator<Integer> nums1Iterator = nums1.iterator();
        while (nums1Iterator.hasNext()) {
            int currNum1 = nums1Iterator.next();
            if (nums2.contains(currNum1)) {
                nums3.add(currNum1);
            }
        }
        System.out.println(nums3);

//        10. Filter a List Based on Condition
// • Task: Write a program that creates a list of strings. Use an Iterator to filter and print only the strings that start with a specific letter (e.g., ‘A’).
//Note:
//Some methods that you will need to use in these tasks (e.g., Iterator, ListIterator, remove(), hasNext(), next(), hasPrevious(), previous(), etc.) might require further research to understand their purpose and usage in Java. Make sure to look up the documentation and examples for these methods.
        List<String> names = new ArrayList<>();
        names.add("Aytan");
        names.add("Ayla");
        names.add("Ela");
        names.add("Leyla");
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            String currName = namesIterator.next();
            if(currName.startsWith("A")){
                System.out.println("This name is starts with A"+currName);
            }
        }
    }
}