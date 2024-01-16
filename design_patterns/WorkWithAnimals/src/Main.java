public class Main{
    int justANum = 10;

    public static void main(String[] args){

        Dog nino = new Dog();

        nino.setName("Nino");
        System.out.println(nino.getName());

        nino.digHole();

        nino.setWeight(-1);

        // Everything is pass by value.
        // The original is not effected by changes in methods.

        int randNum = 10;
        nino.changeVar(randNum);

        System.out.println("randNum after method call: " + randNum);

        // Objects are passed by reference to the original object.
        // Changes in methods do effect the object.

        changeObjectName(nino);

        System.out.println("Dog name after method call: " + nino.getName());

        System.out.println("Animal Sound: " + nino.getSound());

        // Create a Dog and Cat object with the super class, but the Dog and Cat reference type.
        Dog doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("Doggy says: " + doggy.getSound());
        System.out.println("Kitty says: " + kitty.getSound() + "\n");

        // Now you can make arrays of Animals and everything just works.
        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        System.out.println("Doggy says: " + animals[0].getSound());
        System.out.println("Kitty says: " + animals[1].getSound() + "\n");

        // Sends Animal objects for processing in a method
        speakAnimal(doggy);

        // Polymorphism allows you to write methods that don't need to
        // change if new subclasses are created.

        // You can't reference methods or fields that aren't in Animal, if you do, you'll have to cast to the required
        // object.
        doggy.digHole();

        // You can execute a private method by using another public method in the class (not a good idea though).
        nino.accessPrivate();

        // Creating a Giraffe from an abstract class.
        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");

        System.out.println(giraffe.getName());
    }

    // Any methods that are in a class and not tied to an object must be labeled static. Every object created by this
    // class will share just one static method.
    public static void changeObjectName(Dog nino){
        nino.setName("Sandy");
    }

    // Receives Animal objects and makes them speak.
    public static void speakAnimal(Animal randAnimal){
        System.out.println("Animal says: " + randAnimal.getSound());
    }

    // This is a non-static method used to demonstrate that you can't call a non-static method inside a static method.
    public void sayHello(){
        System.out.println("Hello");
    }
}