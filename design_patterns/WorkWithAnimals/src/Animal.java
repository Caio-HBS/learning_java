public class Animal {

    private String favFood;
    private String sound;
    private String name;
    private double height;
    private double speed;
    private int weight;

    public void setName(String newName) {
        // Validation would be here.
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double newHeight) {
        // Validation would be here.
        height = newHeight;
    }

    public double getHeight() {
        // Validation would be here.
        return height;
    }

    public void setWeight(int newWeight) {
        // Validation example.
        if (newWeight > 0) {
            weight = newWeight;
        } else {
            System.out.println("Weight must be bigger than 0.");
        }
    }

    public double getWeight() {
        // Validation would be here.
        return weight;
    }

    public void setFavFood(String newFavFood) {
        favFood = newFavFood;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSound(String newSound) {
        // Validation would be here.
        sound = newSound;
    }

    public String getSound() {
        // Validation would be here.
        return sound;
    }

    // A private method can only be accessed by other public methods
    // that are in the same class

    private void bePrivate() {
        System.out.println("I'm a private method.");
    }

    public static void main(String[] args) {

        Animal cleo = new Animal();
        cleo.setName("Cléo");

        System.out.println(cleo.getName());

    }

}
