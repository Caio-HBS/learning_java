

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car("Nissan", "Skyline r-32", "Black", 2);
        Car newNewCar = new Car("Ferrari", "Testarossa", "White", 2);
        Car defaultCar = new Car();

        System.out.println("---FIRST CAR---");

        System.out.println(newCar.getName());
        System.out.println(newCar.getModel());
        System.out.println(newCar.getColour());
        System.out.println(newCar.getDoors());

        newCar.move();
        newCar.stop();

        System.out.println("\n\n---SECOND CAR---");

        System.out.println(newNewCar.getName());
        System.out.println(newNewCar.getModel());
        System.out.println(newNewCar.getColour());
        System.out.println(newNewCar.getDoors());

        newNewCar.move();
        newNewCar.stop();

        System.out.println("\n\n---DEFAULT CAR---");

        System.out.println(defaultCar.getName());
        System.out.println(defaultCar.getModel());
        System.out.println(defaultCar.getColour());
        System.out.println(defaultCar.getDoors());

        defaultCar.move();
        defaultCar.stop();
    }
}