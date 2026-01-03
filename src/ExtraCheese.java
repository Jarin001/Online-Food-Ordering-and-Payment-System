class ExtraCheese extends FoodDecorator {

    public ExtraCheese(Food food) {
        super(food);
    }

    public String getDescription() {
        return food.getDescription() + ", Extra Cheese";
    }

    public double cost() {
        return food.cost() + 70;
    }
}
