public class Animal {

    private String name;
    private String sound;

    // Instead of using an interface in a traditional way we use an instance variable that is a subclass of the Fly's
    // interface.

    // Animal doesn't care what flyingType does, it just knows the behavior is available to its subclasses.

    // This is known as Composition : Instead of inheriting an ability through inheritance the class is composed with
    // Objects with the right ability.

    // Composition allows you to change the capabilities of objects at run time!

    public Flys flyingType;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }


    public void setSound(String newSound) {
        sound = newSound;
    }

    public String getSound() {
        return sound;
    }

	/* BAD
	* You don't want to add methods to the super class.
	* You need to separate what is different between subclasses
	* and the super class.
	public void fly(){

		System.out.println("I'm flying");

	}
	*/

    // Animal pushes off the responsibility for flying to flyingType.

    public String tryToFly() {
        return flyingType.fly();
    }

    // If you want to be able to change the flyingType dynamically add the following method.

    public void setFlyingAbility(Flys newFlyType) {
        flyingType = newFlyType;
    }
}