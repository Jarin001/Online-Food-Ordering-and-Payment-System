abstract class FoodPreparationTemplate {

    public final void prepareFood() {
        prepareIngredients();
        cook();
        pack();
        serve();
    }

    protected abstract void prepareIngredients();
    protected abstract void cook();

    protected void pack() {
        System.out.println("Packing food.");
    }

    protected void serve() {
        System.out.println("Serving food.");
    }
}
