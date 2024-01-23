public class SpongeCake implements Cake {

    @Override
    public String getDescription() {
        return "Plain cake dough";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
