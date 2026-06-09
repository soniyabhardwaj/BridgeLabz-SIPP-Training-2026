// Program to take User Input

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking User Input
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();

        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        System.out.print("Enter Your Height: ");
        double height = input.nextDouble();

        // Display User Details
        System.out.println("\n----- User Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        input.close();
    }
}