package com.example;

import java.util.Scanner;

public class PricingEngine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price for item " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            order.addItem(price, quantity);
        }

        System.out.print("Customer type (REGULAR/VIP): ");
        order.setCustomerType(CustomerType.valueOf(scanner.next().toUpperCase()));

        System.out.print("Discount code (SAVE10/SAVE20/NONE): ");
        order.setDiscountCode(DiscountCode.valueOf(scanner.next().toUpperCase()));

        PricingCalculator calculator = new PricingCalculator();
        double subtotal = calculator.calculateSubtotal(order);
        double discount = calculator.calculateDiscount(subtotal, order);
        double afterDiscount = subtotal - discount;
        double tax = calculator.calculateTax(afterDiscount);
        double finalPrice = afterDiscount + tax;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);

        scanner.close();
    }
}