package advanced.enumCoding;

public enum PizzaSize {
    SMALL("Small size, Price: 5.99"), MEDIUM("Medium size, Price: 7.99"), LARGE("Large size, Price: 10.99");


    private String pizzaSizeText;

    PizzaSize(String pizzaSizeText){
        this.pizzaSizeText = pizzaSizeText;
    }

    public String getPizzaSizeText() {
        return pizzaSizeText;
    }
}
