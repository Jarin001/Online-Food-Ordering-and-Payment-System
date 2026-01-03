abstract class FoodDecorator extends Food {
    protected Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }
}
