/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author tuan anh
 */
public class Food {

    private String id;
    private String name;
    private String description;
    private double price;
    private int cookingTime;
    private boolean status;

    public Food() {
    }

    public Food(String id, String name, String description, double price, int cookingTime, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.cookingTime = cookingTime;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Food{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", cookingTime=" + cookingTime + ", status=" + status + '}';
    }

}
