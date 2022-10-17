package HWSem6OOP.coffee_machine.controller;

import HWSem6OOP.coffee_machine.data.Coffee;
import HWSem6OOP.coffee_machine.service.impl.LatteBuilder;

public class ControllerLatte {

    private final LatteBuilder latteBuilder;

    public ControllerLatte() {
        this.latteBuilder = new LatteBuilder();
    }

    public Coffee getLatte(String coffee, String water, int milk){
        System.out.println("Ваш Латте готов: ");
        latteBuilder.setCoffee(coffee);
        latteBuilder.setWater(water);
        latteBuilder.setMilk(milk);
        latteBuilder.warmedMilk(milk);
        latteBuilder.whippedMilk(milk);

        return latteBuilder.buildLatte();
    }

    public Coffee getLatteSweet(String coffee, String water, int milk, String sweet){
        System.out.println("Ваш Латте готов: ");
        latteBuilder.setCoffee(coffee);
        latteBuilder.setWater(water);
        latteBuilder.setMilk(milk);
        latteBuilder.warmedMilk(milk);
        latteBuilder.whippedMilk(milk);
        latteBuilder.addSweet(sweet);

        return latteBuilder.buildLatte();
    }

}
