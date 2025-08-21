// CollectionsDemo.java
// Demonstrates basic usage of ArrayList and Map in Java
// Compile: javac CollectionsDemo.java
// Run:     java CollectionsDemo

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {
    public static void main(String[] args) {
        // --- ArrayList Example ---
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Fruits List (ArrayList): " + fruits);

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Iterating
        System.out.println("Iterating through fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // Removing element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // --- Map Example ---
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);

        System.out.println("\nStudent Scores (Map): " + studentScores);

        // Accessing value by key
        System.out.println("Bob's Score: " + studentScores.get("Bob"));

        // Iterating over Map
        System.out.println("Iterating through students and scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Updating a value
        studentScores.put("Alice", 90); // Alice’s score updated
        System.out.println("Updated Scores: " + studentScores);
    }
}

