class PizzaPreparation extends FoodPreparationTemplate {

    protected void prepareIngredients() {
        System.out.println("Preparing dough, cheese, and toppings.");
    }

    protected void cook() {
        System.out.println("Baking the pizza.");
    }
}