package com.company;

public class Apple extends Phone implements Printable{

    private int memory;

    public Apple(String name, int price, int memory) {
        super(name, price);
        this.memory = memory;
    }

    @Override
    public Phone Print() {
        System.out.println("\nМодель -" + getName() + "\nЦена: " + getPrice() + "\nПамять: " + memory);

        return null;
    }
}