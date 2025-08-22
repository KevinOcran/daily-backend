// ConsoleTools.java
// A small utility package for CLI input/output in Java

import java.util.Scanner;

public class ConsoleTools {
    private static final Scanner scanner = new Scanner(System.in);

    // Read integer with validation
    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("[Error] Please enter a valid integer!");
            }
        }
    }

    // Read double with validation
    public static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("[Error] Please enter a valid number!");
            }
        }
    }

    // Read string (non-empty)
    public static String readString(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine().trim();
    }

    // Print a banner around text
    public static void printBanner(String text) {
        String border = "=".repeat(text.length() + 6);
        System.out.println(border);
        System.out.println("== " + text + " ==");
        System.out.println(border);
    }

    // Wait for Enter key
    public static void waitForEnter() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }

    // Clear screen (simulation)
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Example demo
    public static void main(String[] args) {
        printBanner("Console Tools Demo");
        String name = readString("Enter your name:");
        int age = readInt("Enter your age:");
        double gpa = readDouble("Enter your GPA:");

        clearScreen();
        printBanner("Summary");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        waitForEnter();
    }
}

