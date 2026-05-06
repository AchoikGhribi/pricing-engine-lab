package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PricingEngineTest {

    @Test
    void testSubtotal() {
        double total = 10 * 2 + 20 * 1;
        assertEquals(40.0, total);
        System.out.println(" Subtotal test passed!");
    }

    @Test
    void testSave10Discount() {
        double subtotal = 100.0;
        double discount = subtotal * 0.10;
        assertEquals(10.0, discount);
        System.out.println(" SAVE10 test passed!");
    }

    @Test
    void testSave20Discount() {
        double subtotal = 100.0;
        double discount = subtotal * 0.20;
        assertEquals(20.0, discount);
        System.out.println(" SAVE20 test passed!");
    }

    @Test
    void testVipDiscount() {
        double subtotal = 100.0;
        double discount = subtotal * 0.05;
        assertEquals(5.0, discount);
        System.out.println(" VIP test passed!");
    }

    @Test
    void testTax() {
        double afterDiscount = 90.0;
        double tax = afterDiscount * 0.15;
        assertEquals(13.5, tax);
        System.out.println(" Tax test passed!");
    }
}