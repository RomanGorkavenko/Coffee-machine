package HWSem6OOP.coffee_machine.service.impl;

import HWSem6OOP.coffee_machine.data.Coffee;
import HWSem6OOP.coffee_machine.data.impl.Espresso;
import HWSem6OOP.coffee_machine.data.impl.Mocha;

public class MochaBuilder extends EspressoBuilder {
    private String chocolate;
    private String whippedCream;
    private String milk;

    public Coffee buildMocha(){
        return new Mocha(chocolate, (Espresso) buildEspresso(), milk, whippedCream);
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    public void setWhippedCream(String whippedCream) {
        this.whippedCream = whippedCream;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }
}
