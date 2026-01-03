class ExtraSauce extends FoodDecorator {

    public ExtraSauce(Food food) {
        super(food);
    }

    public String getDescription() {
        return food.getDescription() + ", Extra Sauce";
    }

    public double cost() {
        return food.cost() + 30;
    }
}