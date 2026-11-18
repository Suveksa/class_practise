package com.westminster.classpractise.demo;

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
        super();
    }

    public PhysicalProduct(int id, String name, int qty, boolean inStock,
                           double unitPrice, double weightKg, String dimensions) {
        super(id, name, qty, inStock, unitPrice);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() { return weightKg; }
    public String getDimensions() { return dimensions; }
}