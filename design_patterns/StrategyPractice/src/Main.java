public class Main {
    public static void main(String[] args) {
        Discount summer = new SummerDiscount();
        Discount winter = new WinterDiscount();

        Product jacket = new Product("Jacket", 50, summer);

        System.out.println("Jacket original price: $" + jacket.getPrice());
        System.out.println("Jacket discounted price: $" + jacket.getDiscountedPrice());
        System.out.println("Jacket discount type: " + jacket.getDiscountType().getDiscountName());

        jacket.setDiscountType(winter);
        System.out.println("New jacket discount type: " + jacket.getDiscountType().getDiscountName() +
                " (new price $" + jacket.getDiscountedPrice() + ")");
    }
}