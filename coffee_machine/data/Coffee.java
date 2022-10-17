package HWSem6OOP.coffee_machine.data;

public abstract class Coffee {
    private String coffee;
    private String water;

    public Coffee(String coffee, String water) {
        this.coffee = coffee;
        this.water = water;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }
}
