package HWSem6OOP.coffee_machine.controller;

import HWSem6OOP.coffee_machine.data.Coffee;
import HWSem6OOP.coffee_machine.service.impl.AmericanoBuilder;

public class ControllerAmericano {
    private final AmericanoBuilder americanoBuilder;

    public ControllerAmericano() {
        this.americanoBuilder = new AmericanoBuilder();
    }

    public Coffee getAmericano(String coffee, String water, String additionalWater){
        System.out.println("Ваш Americano готов: ");
        americanoBuilder.setCoffee(coffee);
        americanoBuilder.setWater(water);
        americanoBuilder.setAdditionalWater(additionalWater);

        return americanoBuilder.buildAmericano();
    }

    public Coffee getAmericanoSweet(String coffee, String water, String additionalWater, String sweet){
        System.out.println("Ваш Americano готов: ");
        americanoBuilder.setCoffee(coffee);
        americanoBuilder.setWater(water);
        americanoBuilder.setAdditionalWater(additionalWater);
        americanoBuilder.addSweet(sweet);

        return americanoBuilder.buildAmericano();
    }
}
