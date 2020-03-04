interface Bicycle {

    // wheel revolutions per minute
    void changeCadance(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBreakers(int decrement);
}