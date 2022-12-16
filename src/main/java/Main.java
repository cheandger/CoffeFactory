


public class Main {

    public static void main(String[] args) {

        MyCoffeeFactory myCoffeeFactory = new MyCoffeeFactory();

        CoffeeMaker coffeeMaker = new CoffeeMaker(myCoffeeFactory);

        coffeeMaker.orderCoffee(CoffeeType.ESPRESSO);

    }
}
