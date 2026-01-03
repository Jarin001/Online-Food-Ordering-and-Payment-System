class BurgerPreparation extends FoodPreparationTemplate {

    protected void prepareIngredients() {
        System.out.println("Preparing bun, patty, and vegetables.");
    }

    protected void cook() {
        System.out.println("Grilling the burger.");
    }
}