package HWSem6OOP.coffee_machine.controller;

import HWSem6OOP.coffee_machine.data.Coffee;
import HWSem6OOP.coffee_machine.service.impl.EspressoBuilder;

public class ControllerEspresso {
    private final EspressoBuilder espressoBuilder;

    public ControllerEspresso() {
        this.espressoBuilder = new EspressoBuilder();
    }

    public Coffee getEspresso(String coffee, String water){
        System.out.println("Ваш Espresso готов: ");
        espressoBuilder.setCoffee(coffee);
        espressoBuilder.setWater(water);

        return espressoBuilder.buildEspresso();
    }
}
