package com.westminster.classpractise.demo;

public class Product {

    private static int instanceCount = 0;

    private int id;
    private String name;
    private int qty;
    private boolean inStock;
    private double unitPrice;

    // needed so @RequestBody can create a Product from JSON
    public Product() {
        this(0, "", 0, false, 0.0);
    }

    public Product(int id, String name, int qty, boolean inStock, double unitPrice) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.inStock = inStock;
        this.unitPrice = unitPrice;
        instanceCount++;
    }

    public double calculateTotal() {
        return qty * unitPrice;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getQty() { return qty; }
    public boolean isInStock() { return inStock; }
    public double getUnitPrice() { return unitPrice; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setQty(int qty) { this.qty = qty; }
    public void setInStock(boolean inStock) { this.inStock = inStock; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
}