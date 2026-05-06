package com.example;

public enum CustomerType {
    REGULAR(0.0),
    VIP(0.05);

    private final double additionalDiscountRate;

    CustomerType(double additionalDiscountRate) {
        this.additionalDiscountRate = additionalDiscountRate;
    }

    public double getAdditionalDiscountRate() {
        return additionalDiscountRate;
    }
}
