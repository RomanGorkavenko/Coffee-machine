package HWSem6OOP.coffee_machine.service.impl;

import HWSem6OOP.coffee_machine.data.Coffee;
import HWSem6OOP.coffee_machine.data.impl.Espresso;
import HWSem6OOP.coffee_machine.service.Sweetable;

public class EspressoBuilder implements Sweetable {
    private String coffee;
    private String water;

    public Coffee buildEspresso(){
        return new Espresso(coffee, water);
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public void setWater(String water) {
        this.water = water;
    }

    @Override
    public void addSweet(String amountOfSugar) {
        System.out.printf("Добавлено %s сахара.\n", amountOfSugar);
    }
}
