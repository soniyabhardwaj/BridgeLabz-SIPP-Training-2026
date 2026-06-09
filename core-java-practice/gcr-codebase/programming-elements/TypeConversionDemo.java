// Program to demonstrate Type Conversion

public class TypeConversionDemo {
    public static void main(String[] args) {

        // Implicit Type Conversion
        int integerValue = 100;
        double doubleValue = integerValue;

        System.out.println("Integer Value: " + integerValue);
        System.out.println("Converted Double Value: " + doubleValue);

        // Explicit Type Conversion
        double decimalNumber = 25.75;
        int convertedInteger = (int) decimalNumber;

        System.out.println("Original Double Value: " + decimalNumber);
        System.out.println("Converted Integer Value: " + convertedInteger);
    }
}