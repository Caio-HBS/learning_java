public class Dog extends Animal {

    public void digHole() {
        System.out.println("Dug a hole.");
    }

    public void changeVar(int randNum) {
        randNum = 12;

        System.out.println("randNum in method value: " + randNum);
    }

    private void bePrivate() {
        System.out.println("In a private method.");
    }

    public void accessPrivate() {
        bePrivate();
    }

    public Dog() {
        // Executes the parent's constructor.
        super();

        // Sets bark for all Dog objects by default.
        setSound("Bark");
    }
}