import java.util.Scanner;

public class PurchasePriceCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Unit Price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR "
                + totalPrice);

        input.close();
    }
}