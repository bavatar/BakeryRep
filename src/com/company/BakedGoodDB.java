package com.company;

import java.util.ArrayList;
import java.util.List;

public class BakedGoodDB {
    private BakedGood bakedGood;
    private List<BakedGood> bakedGoods;

    public BakedGoodDB() {
        bakedGoods = new ArrayList<>();
        // String name, double price, String expDate, boolean glutenFree, boolean diabeticFriendly, boolean peanutFree, int qtyInStock
        bakedGood = new BakedGood("corn bread", 2.98, "9-16-2019", false, false, true, 5);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("banana bread", 3.00, "9-17-2019", false, false, true, 0);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("sour dough", 3.50, "9-18-2019", false, false, true, 50);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("croissant", 3.01, "9-18-2019", true, false, true, 50);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("diet croissant", 4.00, "9-18-2019", false, true, true, 50);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("pumpernickel", 5.00, "9-18-2019", false, true, true, 50);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("cup cake", 4.50, "9-18-2019", false, false, true, 50);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("red velvet cake", 2.99, "9-18-2019", false, false, false, 10);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("ch chip cookie", 2.78, "9-18-2019", true, true, true, 50);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("french bread", 4.98, "9-18-2019", false, false, true, 50);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("oatmeal bread", 3.98, "9-19-2019", true, true, true, 50);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("gluten free bread", 1.98, "9-19-2019", true, true, true, 50);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("apple streudel", 2.97, "9-20-2019", false, false, true, 50);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("glazed donuts", 2.95, "9-20-2019", false, false, true, 20);
        bakedGoods.add(bakedGood);
        bakedGood = new BakedGood("plain donuts", 2.94, "9-21-2019", false, true, true, 50);
        bakedGoods.add(bakedGood);
    }

    public BakedGood getBakedGood() {
        return bakedGood;
    }

    public void setBakedGood(BakedGood bakedGood) {
        this.bakedGood = bakedGood;
    }

    public List<BakedGood> getBakedGoods() {
        return bakedGoods;
    }

    public void setBakedGoods(List<BakedGood> bakedGoods) {
        this.bakedGoods = bakedGoods;
    }

    public String getGlutenFreeFoods(){
        String outStr = "";
        for (BakedGood bg : bakedGoods){
            if (bg.isGlutenFree()){
                if (bg.getQtyInStock()>0) {
                    outStr += bg.getName() + ", ";
                }
            }
        }
        outStr = "Your Gluten Free Choices: " + outStr;
        outStr = outStr.replaceAll(", $", "");
        return outStr;
    }
}
