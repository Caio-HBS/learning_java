public class Car {
    // Defining fields.
    private String name;
    private String colour;
    private String model;
    private int doors;

    // Since all the fields above are private, we need "getters" and "setters" to access those fields on the outside the
    // class. GETTERS simply return the private values to outside the function. As for SETTERS, we can add validation
    // before actually changing the value of a field.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Validation would come here.
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        // Validation would come here.
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        // Validation would come here.
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        // Validation would come here.
        this.doors = doors;
    }

    // Actual constructor.
    public Car(String name, String model, String colour, int doors) {
        // Similar to "self" in Python and other languages.
        this.name = name;
        this.model = model;
        this.colour = colour;
        this.doors = doors;
    }

    // Providing default values for constructor.
    public Car() {
        this("Name", "Model", "Colour", 4);
    }

    // Methods.
    public void move() {
        System.out.println("The car (" + this.name + " " + this.model + ") is moving.");
    }

    public void stop() {
        System.out.println("The car ("+ this.name + " " + this.model + ") stopped!");
    }
}
