import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestPart {
    @Test
    public void testCoffee1() {
        Coffee espresso = new Coffee("Espresso", 20, new MakingEspresso());
        assertEquals("iki doz espresso", espresso.CoffeeDescription());

        Coffee cappuccino = new Coffee("Cappuccino", 27, new MakingCappuccino());
        assertEquals("bir doz espresso, sıcak süt ve süt köpüğü", cappuccino.CoffeeDescription());

        Coffee hotWater = new Coffee("Hot Water", 5, new MakingHotWater());
        assertEquals("sıcak su", hotWater.CoffeeDescription());

    };
    @Test
    public void testCoffee2() {
        Coffee espresso = new Coffee("Espresso", 20, new MakingEspresso());
        assertEquals("bir doz espresso", espresso.CoffeeDescription());

        Coffee cappuccino = new Coffee("Cappuccino", 27, new MakingCappuccino());
        assertEquals("bir doz espresso, sıcak süt ve süt köpüğü", cappuccino.CoffeeDescription());

        Coffee hotWater = new Coffee("Hot Water", 5, new MakingHotWater());
        assertEquals("beş doz sıcak su", hotWater.CoffeeDescription());

    };
    @Test
    public void testCoffeeLast() {
        Coffee espresso = new Coffee("Espresso", 20, new MakingEspresso());
        assertEquals("bir doz espresso", espresso.CoffeeDescription());

        Coffee cappuccino = new Coffee("Cappuccino", 27, new MakingCappuccino());
        assertEquals("bir doz espresso, iki doz pişmiş süt ve iki doz süt köpüğü", cappuccino.CoffeeDescription());

        Coffee hotWater = new Coffee("Hot Water", 5, new MakingHotWater());
        assertEquals("beş doz sıcak su", hotWater.CoffeeDescription());

    };

}
