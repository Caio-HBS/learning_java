public class Product {

    public String name;
    public int price;
    public Discount discountType;

    public Product(String name, int price, Discount discountType) {
        this.name = name;
        this.price = price;
        this.discountType = discountType;
    }

    public int getPrice() {
        return price;
    }

    public Discount getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Discount newDiscount) {
        this.discountType = newDiscount;
    }

    public int getDiscountedPrice() {
        return discountType.giveDiscount(price);
    }
}
