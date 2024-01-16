public class Cat extends Animal{
    public Cat(){
        super();

        setSound("Meow");
    }

    // "Final" keyword prevents the method from being overridden in subclasses.
    final void attack(){
        // Code for method that CAN'T be changed.
    }

    public static final double FAVNUMBER = 3.14;
    // A class labeled as final can't be extended.
}