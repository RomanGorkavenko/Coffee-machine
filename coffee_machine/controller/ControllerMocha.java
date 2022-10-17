package HWSem6OOP.coffee_machine.controller;

import HWSem6OOP.coffee_machine.data.Coffee;
import HWSem6OOP.coffee_machine.service.impl.MochaBuilder;

public class ControllerMocha {
    private final MochaBuilder mochaBuilder;

    public ControllerMocha() {
        this.mochaBuilder = new MochaBuilder();
    }

    public Coffee getMocha(String chocolate, String coffee, String water, String milk, String whippedCream){
        System.out.println("Ваш Мокко готов: ");
        mochaBuilder.setChocolate(chocolate);
        mochaBuilder.setCoffee(coffee);
        mochaBuilder.setWater(water);
        mochaBuilder.setMilk(milk);
        mochaBuilder.setWhippedCream(whippedCream);

        return mochaBuilder.buildMocha();
    }
}
