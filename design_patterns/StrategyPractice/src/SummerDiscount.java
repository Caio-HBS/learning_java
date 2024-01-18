public class SummerDiscount implements Discount {
    @Override
    public int giveDiscount(final int amount) {
        return amount - 15;
    }

    @Override
    public String getDiscountName() {
        return "Summer Discount";
    }
}
