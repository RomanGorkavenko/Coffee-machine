package HWSem6OOP.coffee_machine.data.impl;

public class Americano extends Espresso {

    private String additionalWater;

    public Americano(Espresso espresso, String additionalWater) {
        super(espresso.getCoffee(), espresso.getWater());
        this.additionalWater = additionalWater;

    }

    public String getAdditionalWater() {
        return additionalWater;
    }

    public void setAdditionalWater(String additionalWater) {
        this.additionalWater = additionalWater;
    }

    @Override
    public String toString() {
        return "Кофе: " + getCoffee() + "; Вода: " + getWater() + "; Дополнительная вода: " + additionalWater;
    }
}
