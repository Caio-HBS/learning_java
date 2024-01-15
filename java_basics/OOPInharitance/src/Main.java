public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", "Skyline r-32", "Black", 4);
        Plane plane = new Plane("Boeing", "737", "White", 4);

        car.move();
        car.stop();

        plane.move();
        plane.stop();
    }
}

class Vehicle {
    // Fields common to both vehicles.
    private String name;
    private String model;
    private String colour;

    public Vehicle(String name, String model, String colour) {
        this.name = name;
        this.model = model;
        this.colour = colour;
    }

    public void move() {
        System.out.println(this.name + " " + this.model + " started moving.");
    }
    public void stop() {
        System.out.println(this.name + " " + this.model + " stopped moving.");
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}

class Plane extends Vehicle {
    // Fields only present on this specific vehicle.
    private int engines;

    public Plane(String name, String model, String colour, int engines) {
        // Calling super simply means calling the parent constructor.
        super(name, model, colour);
        // Adding the new field.
        this.engines = engines;
    }

    // Overriding a method FOR THIS SPECIFIC CLASS.
    @Override
    public void move() {
        System.out.println(this.getName() + " " + this.getModel() + " is in the air.");
        // You could also call super to add/change the default behaviour like this: super.move();
    }

    @Override
    public void stop() {
        System.out.println(this.getName() + " " + this.getModel() + " is on the ground.");
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String name, String model, String colour, int doors) {
        super(name, model, colour);
        this.doors = doors;
    }
}