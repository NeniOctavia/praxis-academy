class ACMEBicycle implements Bicycle {

    int cadance = 0;
    int speed = 0;
    int gear = 1;

    // The compiler will now require that methods
    // changeCadande, changeGear, speedUp, and apply
    //all be implemented.Complication will fail if those
    // methods are missing fron this class

    void changeCadande(int newValue){
        cadance = newValue;
    }

    Void changeGear(int newValue){
        gear = newValue;
    }

    void speedUp(int newValue) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
        cadance + " speed:" +
        speed + " gear:" + gear);
    }
}