import java.util.Scanner;

public class TriangleCalculator {
    Scanner scan = new Scanner(System.in);
    public class CalculatorManager{
        public void showMenu(){
            System.out.println("\n\nWelcome To the triangle calculator.\n\tThis Program calculates the area and perimeter of a triangle.\n");
            System.out.println("/tPlease select an option: \n");
            System.out.println("\t\t1.Calculate Area\n\t\t2.Calculate Perimeter\n\t\t3.Exit\n");
        }

        public int getUserChoice(){

            System.out.println("Please enter your choice(1-3): ");
            int choice = scan.nextInt();
            while (choice < 1 || choice > 3) {
                System.err.println("Invalid choice. Please enter a number between 1 and 3: ");
                scan.nextLine();
                choice = scan.nextInt();

        }
        return choice;
        }

        public void calculateArea(){
            System.out.println("Please enter the base of the triangle: ");
            double base = scan.nextDouble();
            scan.nextLine();
            while (base <= 0) {
                System.err.println("Base must be a positive number. Please enter again: ");
                base = scan.nextDouble();
                scan.nextLine();
            }
            System.out.println("Please enter the height of the triangle: ");
            double height = scan.nextDouble();
            scan.nextLine();
            while (height <= 0) {
                System.err.println("Height must be a positive number. Please enter again: ");
                height = scan.nextDouble();
                scan.nextLine();
            }
            double area = 0.5 * base * height;
            System.out.printf("The area of the triangle is: %.2f\n", area, "\n\n");

        }

        public void calculatePerimeter(){

            System.out.println("Please enter the lengths of the three sides of the triangle: ");
            System.out.print("Side 1: ");
            double side1 = scan.nextDouble();
            scan.nextLine();
            while (side1 <= 0) {
                System.err.println("Side must be a positive number. Please enter again: ");
                side1 = scan.nextDouble();
                scan.nextLine();
            }
            System.out.print("Side 2: ");
            double side2 = scan.nextDouble();
            scan.nextLine();
            while (side2 <= 0) {
                System.err.println("Side must be a positive number. Please enter again: ");
                side2 = scan.nextDouble();
                scan.nextLine();
            }
            System.out.print("Side 3: ");
            double side3 = scan.nextDouble();
            while (side3 <= 0) {
                System.err.println("Side must be a positive number. Please enter again: ");
                side3 = scan.nextDouble();
                scan.nextLine();
            }
            double perimeter = side1 + side2 + side3;
            System.out.printf("The perimeter of the triangle is: %.2f\n", perimeter, "\n\n");


        }

    }

    public static void main(String[] args){
        TriangleCalculator calculator = new TriangleCalculator();
        CalculatorManager manager = calculator.new CalculatorManager();
        manager.showMenu();
        
        int choice = manager.getUserChoice();
        while (choice != 3) {
            switch (choice) {
                case 1:
                    manager.calculateArea();
                    break;
                case 2:
                    manager.calculatePerimeter();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            manager.showMenu();
            choice = manager.getUserChoice();
        }
        System.out.println("Thank you for using the triangle calculator. Goodbye!");
        calculator.scan.close();
    }
}
