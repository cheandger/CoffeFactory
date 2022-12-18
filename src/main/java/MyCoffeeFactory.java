


public class MyCoffeeFactory {

    public Coffee createCoffee(CoffeeType type) {

        Coffee coffee = switch (type) {
            case AMERICANO -> new Americano("Americano");
            case ESPRESSO -> new Espresso("Espresso");
            case MOKKO -> new Mokko("Mokko");


        };

        return coffee;
    }
}


