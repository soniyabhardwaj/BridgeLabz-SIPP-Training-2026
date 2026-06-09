import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("Results are: "
                + result1 + ", "
                + result2 + ", "
                + result3 + ", "
                + result4);

        input.close();
    }
}