class FoodOrderFactory {

    public static FoodOrder createOrder(
            String foodType,
            boolean extraCheese,
            boolean extraSauce) {

        Food food;
        FoodPreparationTemplate preparation;

        switch (foodType.toLowerCase()) {
            case "pizza":
                food = new BasicFood("Pizza", 500);
                preparation = new PizzaPreparation();
                break;

            case "burger":
                food = new BasicFood("Burger", 250);
                preparation = new BurgerPreparation();
                break;

            default:
                throw new IllegalArgumentException("Unknown food type");
        }

        if (extraCheese) food = new ExtraCheese(food);
        if (extraSauce) food = new ExtraSauce(food);

        return new FoodOrder(food, preparation);
    }
}
