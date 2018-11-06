package L1_2;

public class Cat extends Animal {

    // The constructor initializes all objects

    public static final double FAVNUMBER = 3.14;

    // If you want to make sure a method isn't overridden mark it as Final

    public Cat() {

        // Executes the parents constructor
        // Every class has a constructor whether you make it or not

        super();

        // Sets bark for all Dog objects by default

        setSound("Meow");

    }

    // A field marked with final can't be changed

    final void attack() {
        // Do stuff that can never change
    }

    // A class labeled as final can't be extended

}