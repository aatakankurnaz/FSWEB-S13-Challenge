package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 10),
    PREMIUM("Premium Plan", 20),
    VIP("VIP Plan", 30);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

