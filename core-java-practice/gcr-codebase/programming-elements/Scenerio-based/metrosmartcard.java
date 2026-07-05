import java.util.Scanner;
public class metrosmartcard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount to be recharged:");
        double balance = sc.nextDouble();

    while (balance >  0) {
        System.out.println("Select the metro station:");
        System.out.println("1. Station A");
        System.out.println("2. Station B");
        System.out.println("3. Station C");
        int stationChoice = sc.nextInt();

        double fare = 0.0;

        switch (stationChoice) {
            case 1:
                fare = 2.50;
                break;
            case 2:
                fare = 3.00;
                break;
            case 3:
                fare = 3.50;
                break;
            default:
                System.out.println("Invalid station choice.");
                continue;
        }

        if (balance >= fare) {
            balance -= fare;
            System.out.println("Fare deducted: $" + fare);
            System.out.println("Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient balance. Please recharge your card.");
            break;
        }
        
    }
    
    }
}