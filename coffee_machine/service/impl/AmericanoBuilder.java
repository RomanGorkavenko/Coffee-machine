package HWSem6OOP.coffee_machine.service.impl;

import HWSem6OOP.coffee_machine.data.impl.Americano;
import HWSem6OOP.coffee_machine.data.Coffee;
import HWSem6OOP.coffee_machine.data.impl.Espresso;

public class AmericanoBuilder extends EspressoBuilder {
    private String additionalWater;

    public Coffee buildAmericano(){
        return new Americano((Espresso) buildEspresso(), additionalWater);
    }

    public void setAdditionalWater(String additionalWater) {
        this.additionalWater = additionalWater;
    }
}
