package HWSem6OOP.coffee_machine.service.impl;

import HWSem6OOP.coffee_machine.data.Coffee;
import HWSem6OOP.coffee_machine.data.impl.Espresso;
import HWSem6OOP.coffee_machine.data.impl.Latte;

public class LatteBuilder extends EspressoBuilder {

    private int milk;

    public Coffee buildLatte() {
        return new Latte((Espresso) buildEspresso(), milk);
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void warmedMilk(int milk){
        milk /= 2;
        System.out.printf("Подогретое молоко %d ml\n", milk);
    }

    public void whippedMilk(int milk){
        milk /= 2;
        System.out.printf("Взбитое молоко %d ml\n", milk);
    }

}
