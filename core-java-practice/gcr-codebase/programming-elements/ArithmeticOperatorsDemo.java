// Program to perform Arithmetic Operations

import java.util.Scanner;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter First Number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = input.nextInt();

        // Arithmetic Operations
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int modulus = firstNumber % secondNumber;

        // Display Results
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Modulus = " + modulus);

        input.close();
    }
}