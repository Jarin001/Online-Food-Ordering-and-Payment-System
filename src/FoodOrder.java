class FoodOrder {
    private Food food;
    private FoodPreparationTemplate preparation;

    public FoodOrder(Food food, FoodPreparationTemplate preparation) {
        this.food = food;
        this.preparation = preparation;
    }

    public Food getFood() {
        return food;
    }

    public FoodPreparationTemplate getPreparation() {
        return preparation;
    }
}
