package com.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Item> items = new ArrayList<>();
    private CustomerType customerType;
    private DiscountCode discountCode;

    public void addItem(double price, int quantity) {
        items.add(new Item(price, quantity));
    }

    public List<Item> getItems() {
        return items;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public DiscountCode getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(DiscountCode discountCode) {
        this.discountCode = discountCode;
    }
}
