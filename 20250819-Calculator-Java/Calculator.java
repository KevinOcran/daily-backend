import java.util.Scanner;

public class Calculator {

    class MathUtils {
        public MathUtils(){

        }
        public double add(double x, double y) {
           return x + y; 
        }

        public double subtract(double x, double y){
            return  x - y;
        }

        public double multiply(double x, double y){
            return x*y;
        }

        public double divide(double x, double y){
                return x/y;
        }
    }

    public static void main(String[] args){
        Calculator calc = new Calculator();
        MathUtils util = calc.new MathUtils();
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;


        System.out.println("Welcome to the simple calculator.\nThis calculator only accepts to values at a time and only does addition(+), subtraction(-), multiplication(*) and divition(/).");
        while(isRunning){
            System.out.println("\nSelect an operation to do:\n\t1.Addition\n\t2.Subtraction\n\t3.Multiplication\n\t4.Divivtion\n\t0.Exit");
            int option =scan.nextInt();
        
        
            switch(option){
                case 1:
                    System.out.println("Please enter your first value:");
                    double x = scan.nextDouble();
                    System.out.println("Please enter your Second value:");
                    double y = scan.nextDouble();

                    System.out.println(util.add(x, y));
                    break;
                case 2:
                    System.out.println("Please enter your first value:");
                    double a = scan.nextDouble();
                    System.out.println("Please enter your Second value:");
                    double b = scan.nextDouble();
                    System.out.println(util.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Please enter your first value:");
                    double i = scan.nextDouble();
                    System.out.println("Please enter your Second value:");
                    double j = scan.nextDouble();
                    System.out.println(util.multiply(i, j));
                    break;
                case 4:
                    boolean running = true;
                    while(running){
                        System.out.println("Please enter your first value:");
                        double e = scan.nextDouble();
                        System.out.println("Please enter your Second value:");
                        double f = scan.nextDouble();
                        if(f==0){
                            System.err.println("denominator cannot be zero(0).\nPlease Try again!");
                        }
                        else{
                            System.out.println(util.divide(e, f));
                            running = false; 
                        }
                    }
                    break;
                case 0:
                    System.out.println("Ending Processes...");
                    isRunning = false;
                    break;
                default:
                    System.err.println("Please Choose one of the given Options:");
                    
            }
        }
        scan.close();
    }
    
}
