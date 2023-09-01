/*
* Owner: Betül Karaman
* bu classta genel olarak nesne üretimi yapıldı. nesnelerin özellikleri private keywordu ile korundu. böylelikle dışardan erişim engellendi.
* tüm özellikler, değişimi önlenebilmesi için final keywordu kullanılarak korundu.
* iyileştirme için gerekli yerlerde null kontrolleri yapılabilir.
*/


public class Coffee {
    private final String name;
    private final double price;
    private final CoffeeDescription description;

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

