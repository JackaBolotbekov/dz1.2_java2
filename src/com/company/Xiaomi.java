package com.company;

public class Xiaomi extends Phone implements Printable{

    private String OS;

    public Xiaomi(String name, int price, String OS) {
        super(name, price);
        this.OS = OS;
    }

    @Override
    public Phone Print() {
        System.out.println("\nМодель -" + getName() + "\nЦена: " + getPrice() + "\nОперационная система: " + OS);

        return null;
    }
}