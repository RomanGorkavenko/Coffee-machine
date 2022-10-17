package HWSem6OOP.coffee_machine.data.impl;

import HWSem6OOP.coffee_machine.data.Coffee;

public class Espresso extends Coffee {
    public Espresso(String coffee, String water) {
        super(coffee, water);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffee='" + getCoffee() + '\'' +
                ", water='" + getWater() + '\'' +
                '}';
    }

}
