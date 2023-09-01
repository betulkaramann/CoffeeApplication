public class Coffee {
    private String name;
    private double price;
    private CoffeeDescription description;

    public Coffee(String name, double price, CoffeeDescription description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public String CoffeeDescription() {
        return description.makingCoffee();
    }

}

