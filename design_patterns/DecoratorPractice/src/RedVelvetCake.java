public class RedVelvetCake extends CakeToppingsDecorator {
    public RedVelvetCake(Cake newCake) {
        super(newCake);
    }

    @Override
    public String getDescription() {
        return tempCake.getDescription() + ", red food-colouring, buttermilk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 8.0;
    }
}
