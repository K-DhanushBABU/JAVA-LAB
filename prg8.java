// 8.	Write a java program to read two positive integers and perform the division operation on them and display the result if a user enters a positive integer and non-zero denominator. Else, If the input is negative or the denominator is zero, generate negative number input and divide by zero exception to handle the scenario.

import java.util.Scanner;

public class prg8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two positive integers");

        try {
            Double numerator = input.nextDouble();
            double denominator = input.nextDouble();

            if (numerator > 0 && denominator > 0) {

                double result = numerator / denominator;
                System.out.println("the result is " + result);

            } else {
                System.out.println(
                        "Either the he input is negative or the denominator is zero ...please enter the positive integers only");
            }

        } catch (Exception e) {
            System.out.println("Error is" + e.getMessage());
        } finally {
            input.close();
            System.out.println("The code executed");
        }
    }
}
