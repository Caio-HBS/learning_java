public class YamahaFactory {
    public YamahaProduct makeNewProduct(String productIdentifier) {

        return switch (productIdentifier) {
            case "jetski" -> new Jetski();
            case "keyboard" -> new Keyboard();
            case "car" -> new Car();
            default -> null;
        };
    }
}
