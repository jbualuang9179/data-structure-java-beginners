package com.tanntime;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Write your code here.
//        demoArrayList1();
        demoSimpleArrayList();
    }


//    public static void advArrayList() {
//        ArrayList<Drink> menus = createDrinkData();
//        for (Drink menu : menus) {
//            System.out.println(menu.toString());
//        }
//
//        // create instance
//        Drink m = new Drink("lemon", "Juice", 50);
//        System.out.println(menus.contains(m));
//
//
//    }

    public static void demoSimpleArrayList() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana"); // 0
        fruits.add("orange"); // 1
        fruits.add("kiwi"); // 2

        System.out.println(fruits.get(1));
        System.out.println(fruits.indexOf("orange"));
        System.out.println(fruits.contains("kiwi"));

        // add value into array
        fruits.add(1, "coconut");
        System.out.println(fruits.toString());
        System.out.println(fruits.get(2));

        fruits.add(0, "apple");
        System.out.println(fruits.toString());

        // edit value
        fruits.set(1, "mango");
        System.out.println(fruits.toString());
    }

    // ArrayList
    public static void demoArrayList1() {
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("orange", "Juice", 40));
        menus.add(new Drink("Apple", "Juice", 45));
        menus.add(new Drink("lemon", "Juice", 50));
        menus.add(new Drink("Coke", "Soda", 25));
        menus.add(new Drink("Sprite", "Soda", 25));
        menus.add(new Drink("Fanta", "Soda", 25));
        menus.add(new Drink("Latte", "Coffee", 70));
        menus.add(new Drink("Mocha", "Coffee", 80));
        menus.add(new Drink("Cappuccino", "Coffee", 90));
        menus.add(new Drink("Espresso", "Coffee", 65));

        // ArrayList via index
//        System.out.println(menus.get(3));

        // --- iterate
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }
    }
}
