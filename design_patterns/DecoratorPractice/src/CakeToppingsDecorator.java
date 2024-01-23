abstract class CakeToppingsDecorator implements Cake {
    protected Cake tempCake;

    public CakeToppingsDecorator(Cake newCake) {
        tempCake = newCake;
    }

    public String getDescription() {
        return tempCake.getDescription();
    }

    public double getCost() {
        return tempCake.getCost();
    }
}
