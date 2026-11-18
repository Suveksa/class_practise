package com.westminster.classpractise.demo;

public class DigitalProduct extends Product {

    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct() {
        super();
    }

    public DigitalProduct(int id, String name, int qty, boolean inStock,
                          double unitPrice, String downloadUrl, double fileSizeMB) {
        super(id, name, qty, inStock, unitPrice);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() { return downloadUrl; }
    public double getFileSizeMB() { return fileSizeMB; }
}