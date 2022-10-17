package HWSem6OOP.coffee_machine.data.impl;

public class Latte extends Espresso {

    private int milk;

    public Latte(Espresso espresso, int milk) {
        super(espresso.getCoffee(), espresso.getWater());
        this.milk = milk;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Кофе: " + getCoffee() + "; Вода: " + getWater() + "; Молоко: " + milk + " ml.";
    }
}
