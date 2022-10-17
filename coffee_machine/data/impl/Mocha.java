package HWSem6OOP.coffee_machine.data.impl;

public class Mocha extends Espresso {
    private String chocolate;
    private String whippedCream;
    private String milk;


    public Mocha(String chocolate, Espresso espresso, String milk, String whippedCream) {
        super(espresso.getCoffee(), espresso.getWater());
        this.chocolate = chocolate;
        this.milk = milk;
        this.whippedCream = whippedCream;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    public String getWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(String whippedCream) {
        this.whippedCream = whippedCream;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Шоколад: " + chocolate + "; Кофе: " + getCoffee() + "; Вода: " + getWater() + "; Молоко: " + milk +
                "; Взбитые сливки: " + whippedCream;
    }
}
