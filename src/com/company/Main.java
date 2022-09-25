package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Samsung");
        createObject("Apple");
        createObject("Xiaomi");

    }

    public static Phone createObject(String className) {
        switch (className) {
            case ("Samsung"):
                return new Samsung(" A32",15000,"Cерый").Print();
            case ("Apple"):
                return new Apple(" 14 ProMax",130000,512).Print();
            case ("Xiaomi"):
                return new Xiaomi(" Redmi 15c",37000,"Android 10").Print();
        }
        return new Phone();

    }
}