package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BakedGoodDB foodDB = new BakedGoodDB();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to find Gluten Free Baked Goods? (Y/N)");
        String responseStr = sc.nextLine();
        if (responseStr.equalsIgnoreCase("y")) {
            String foodStr = foodDB.getGlutenFreeFoods();
            System.out.println(foodStr);
        }
    }
}
