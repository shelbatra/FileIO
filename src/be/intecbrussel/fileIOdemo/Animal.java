package be.intecbrussel.fileIOdemo;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private transient String favouriteFood;
    private double weight;
    public static final long serialVersionUID = 100;

    public Animal(String name, String favouriteFood, double weight) {
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
