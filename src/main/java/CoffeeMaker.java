

public class CoffeeMaker {

    private final MyCoffeeFactory coffeeFactory;

    public CoffeeMaker(MyCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public void orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);

        coffee.grindCoffee();

        coffee.makeCoffee();

        coffee.giItAway();

        System.out.println("Enjoy your " + coffee.getName() + "\n Thanks for choosing us!");

    }


}



