package com.company;

public class Samsung extends Phone implements Printable{

    private String color ;

    public Samsung(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public Phone Print() {
        System.out.println("Модель -" + getName() + "\nЦена: " + getPrice() + "\nЦвет: " +color);


        return null;
    }
}