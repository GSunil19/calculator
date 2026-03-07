package org.example;
import java.util.Scanner;

public class Calculator {

    public static double sqrt(double x) {
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double ln(double x) {
        return Math.log(x);
    }

    public static double power(double x, double b) {
        return Math.pow(x, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log (ln)");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    System.out.println("Result: " + sqrt(num));
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println("Result: " + factorial(n));
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    double l = sc.nextDouble();
                    System.out.println("Result: " + ln(l));
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter power: ");
                    double p = sc.nextDouble();
                    System.out.println("Result: " + power(base, p));
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}