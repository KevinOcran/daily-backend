import java.util.Scanner;

public class GradeCalculator {
    public class GradesManager {
        private int totalGrades;
        private int numberOfGrades;

        public GradesManager() {
            this.totalGrades = 0;
            this.numberOfGrades = 0;
        }

        public void addGrade(int grade) {
            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Grade must be between 0 and 100.");
            }
            totalGrades += grade;
            numberOfGrades++;
        }

        public double calculateAverage() {
            if (numberOfGrades == 0) {
                throw new IllegalStateException("No grades available to calculate average.");
            }
            return (double) totalGrades / numberOfGrades;
        }

        public void resetGrades() {
            totalGrades = 0;
            numberOfGrades = 0;
        }

        public int getTotalGrades() {
            return totalGrades;
        }

        public int getNumberOfGrades() {
            return numberOfGrades;
        }

        public void showMenu() {
            System.out.println("1. Add Grade");
            System.out.println("2. Calculate Average");
            System.out.println("3. Reset Grades");
            System.out.println("4. Show Total Grades and Count");
            System.out.println("5. Exit");
        }
    }
    public static void main(String[] args) {
        GradesManager gradesManager = new GradeCalculator().new GradesManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            gradesManager.showMenu();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter grade (0-100): ");
                    int grade = scanner.nextInt();
                    try {
                        gradesManager.addGrade(grade);
                        System.out.println("Grade added successfully.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        double average = gradesManager.calculateAverage();
                        System.out.printf("Average grade: %.2f%n", average);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    gradesManager.resetGrades();
                    System.out.println("Grades reset successfully.");
                    break;
                case 4:
                    System.out.println("Total Grades: " + gradesManager.getTotalGrades());
                    System.out.println("Number of Grades: " + gradesManager.getNumberOfGrades());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            scanner.close();
        }
    }
    
}
