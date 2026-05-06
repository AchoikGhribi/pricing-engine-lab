package com.example;

public class PricingCalculator {

    public double calculateSubtotal(Order order) {
        double subtotal = 0;
        for (Item item : order.getItems()) {
            subtotal += item.getTotalPrice();
        }
        return subtotal;
    }

    public double calculateDiscount(double subtotal, Order order) {
        double discount = subtotal * order.getDiscountCode().getRate();
        discount += subtotal * order.getCustomerType().getAdditionalDiscountRate();
        return discount;
    }

    public double calculateTax(double amount) {
        return amount * 0.15;
    }
}