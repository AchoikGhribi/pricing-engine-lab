import java.util.Scanner;

public class PricingEngine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();

        double[] prices = new double[n];
        int[] quantities = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter price for item " + (i + 1) + ": ");
            prices[i] = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            quantities[i] = scanner.nextInt();
        }

        System.out.print("Customer type (REGULAR/VIP): ");
        String customerType = scanner.next();

        System.out.print("Discount code (SAVE10/SAVE20/NONE): ");
        String discountCode = scanner.next();

        double subtotal = 0;
        for(int i = 0; i < n; i++) {
            subtotal += prices[i] * quantities[i];
        }

        double discount = 0;
        if(discountCode.equals("SAVE10")) {
            discount = subtotal * 0.10;
        } else if(discountCode.equals("SAVE20")) {
            discount = subtotal * 0.20;
        }

        if(customerType.equals("VIP")) {
            discount += subtotal * 0.05;
        }

        double afterDiscount = subtotal - discount;
        double tax = afterDiscount * 0.15;
        double finalPrice = afterDiscount + tax;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);

        scanner.close();
    }
}