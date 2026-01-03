class BasicFood extends Food {
    private String description;
    private double price;

    public BasicFood(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return price;
    }
}
