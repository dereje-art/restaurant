package com.company;

public class MenuItem {

    //class variables
    private String name;
    private String description;
    private double price;
    private String category;
    private Boolean isNew;

    //constructors
    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = "description";
        this.price = price;

        this.category = "Not Categorized";
        this.isNew = false;

    }

    public MenuItem(String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }
    //methods
    //Getters and Setter

    public String getName() { return this.name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getIsNew() { return this.isNew; }

    public void setIsNew(boolean isNew) { this.isNew = isNew;}
}






