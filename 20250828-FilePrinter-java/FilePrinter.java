// FilePrinter.java
// Simple CLI program to print the contents of a file line by line.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilePrinter {
    public static void main(String[] args) {
        // Check if filename is provided
        if (args.length != 1) {
            System.out.println("Usage: java FilePrinter <filename>");
            return;
        }

        String filename = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.printf("%3d | %s%n", lineNumber++, line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
