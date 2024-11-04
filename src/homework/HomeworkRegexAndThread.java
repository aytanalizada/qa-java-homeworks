package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkRegexAndThread {
    public static void main(String[] args) {
//    Regex Tasks (Instructions)
// 1. Task 1: Check Valid Email
// • Instruction: Use regex to validate the email format of the given string. If the email is valid, print "Valid Email"; otherwise, print "Invalid Email". Remember to use Pattern.compile() and Matcher.
        String emailAddress = "test@gmail.com";
        Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        boolean isEmailAddress = emailPattern.matcher(emailAddress).matches();
        System.out.println(isEmailAddress);
//            2. Task 2: Find All Words
// • Instruction: Create a method that takes a sentence as input and uses regex to find and print all the words in that sentence. Use Pattern.compile() and Matcher to match words.
        findAllWords("My name is Tester tester");
//            3. Task 3: Validate Phone Number
// • Instruction: Use regex to check if the given phone number string matches the format (XXX) XXX-XXXX. If it matches, print "Valid Phone Number"; otherwise, print "Invalid Phone Number". Make sure to use Pattern.compile() and Matcher.
        String phoneNumber = "(123) 456-7890";
        Pattern pattern = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}");
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Valid Phone Number");
        } else {
            System.out.println("Invalid Phone Number");
        }
//            4. Task 4: Extract Digits
// • Instruction: Write a method to extract all digits from the given string using regex. Print each digit found. Use Pattern.compile() and Matcher for this task.
        String input = "The price is 123 dollars and 45 cents.";
        extractDigits(input);

// 5. Task 5: Replace Vowels
// • Instruction: Use regex to replace all vowels in the given string with an asterisk (*). Print the modified string. Ensure to use Pattern.compile() and Matcher.
        String vowelInput = "I was born in Sheki city";
        Pattern vowelPattern = Pattern.compile("[AEIOUaeiou]");
        Matcher vowelMatcher = vowelPattern.matcher(vowelInput);
        String modifiedString = vowelMatcher.replaceAll("*");
        System.out.println(modifiedString);
//    Reminder for Regex
// • Make sure to use Pattern.compile() and Matcher methods to complete the tasks.
//            Threads Tasks (Instructions)
// 1. Task 1: Message Thread
// • Instruction: Create a class that extends Thread. In the run method, display the message "Message Thread is running" when the thread starts.
        MyThread myThread = new MyThread();
        myThread.start();
//            2. Task 2: Number Runnable
// • Instruction: Create a class that implements Runnable. In the run method, display the numbers from 1 to 5 when the thread is executed.
        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.start();
// 3. Task 3: Sleep Thread
// • Instruction: Create a class that extends Thread. In the run method, print a message indicating the thread is going to sleep, sleep for 2 seconds, and then print another message indicating it has woken up.
        SleepThread sleepThread = new SleepThread();
        sleepThread.start();
//            4. Task 4: Custom Message Thread
// • Instruction: Create a class that extends Thread and accepts a custom message in its constructor. In the run method, print the custom message when the thread is run.
        CustomMessageThread customMessageThread = new CustomMessageThread("Custom message in its constructor");
        customMessageThread.start();
//            5. Task 5: Join Thread
// • Instruction: Create a class that extends Thread. In the run method, perform a task (e.g., print a message), then ensure the main thread waits for this thread to finish by using join().
//    Reminder for Threads
// • Make sure to understand how to use Thread.start(), Thread.sleep(), Thread.join(), and Runnable.run() methods in your implementations.
        JoinThread joinThread = new JoinThread();
        joinThread.start();
        try {
            joinThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted ");
            Thread.currentThread().interrupt();
        }
        System.out.println("Main thread continues after joinThread has finished.");

    }

    private static void findAllWords(String sentence) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void extractDigits(String input) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Message Thread is running");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

class SleepThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread is going to sleep");
            Thread.sleep(2000);
            System.out.println("Thread has woken up!");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted during sleep.");
            Thread.currentThread().interrupt();
        }
    }
}

class CustomMessageThread extends Thread {

    private final String message;

    public CustomMessageThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}

class JoinThread extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running and performing a task");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
            Thread.currentThread().interrupt();
        }
        System.out.println("Thread task is completed.");
    }
}
