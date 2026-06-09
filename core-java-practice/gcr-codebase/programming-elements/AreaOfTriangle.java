import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter Height in cm: ");
        double height = input.nextDouble();

        double areaInSqCm = 0.5 * base * height;
        double areaInSqInches = areaInSqCm / (2.54 * 2.54);

        System.out.println("The Area of Triangle in sq cm is "
                + areaInSqCm);

        System.out.println("The Area of Triangle in sq inches is "
                + areaInSqInches);

        input.close();
    }
}