


public class MyCoffeeFactory {

    public Coffee createCoffee(CoffeeType type) {

        Coffee coffee = switch (type) {
            case AMERICANO -> new Americano("Americano");
            case ESPRESSO -> new Espresso("Espresso");
            case MOKKO -> new Mokko("Mokko");
            // in this simple example, we don't need the default case because
            // when we specify coffeeType, the IDE doesn't allow
            // we to specify any other type, except for what we specified in enum

        };

        return coffee;
    }
}


