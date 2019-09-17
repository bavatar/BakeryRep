package com.company;

public class BakedGood {
    private String name = "";
    private double price = 0.0;
    private String expDate = "";
    private boolean glutenFree = false;
    private boolean diabeticFriendly = false;
    private boolean peanutFree = false;
    private int qtyInStock = 0;

    public BakedGood() {
    }

    public BakedGood(String name, double price, String expDate, boolean glutenFree, boolean diabeticFriendly,
                     boolean peanutFree, int qtyInStock) {
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.glutenFree = glutenFree;
        this.diabeticFriendly = diabeticFriendly;
        this.peanutFree = peanutFree;
        this.qtyInStock = qtyInStock;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public boolean isDiabeticFriendly() {
        return diabeticFriendly;
    }

    public void setDiabeticFriendly(boolean diabeticFriendly) {
        this.diabeticFriendly = diabeticFriendly;
    }

    public boolean isPeanutFree() {
        return peanutFree;
    }

    public void setPeanutFree(boolean peanutFree) {
        this.peanutFree = peanutFree;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}
