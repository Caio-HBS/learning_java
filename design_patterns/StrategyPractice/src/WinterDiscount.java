public class WinterDiscount implements Discount {
    @Override
    public int giveDiscount(final int amount) {
        return amount - 10;
    }

    @Override
    public String getDiscountName() {
        return "Winter Discount";
    }
}