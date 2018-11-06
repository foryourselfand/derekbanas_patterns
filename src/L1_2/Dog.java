package L1_2;

public class Dog extends Animal {

    public Dog() {

        // Executes the parents constructor
        // Every class has a constructor whether you make it or not

        super();

        // Sets bark for all Dog objects by default

        setSound("Bark");

    }

    public void digHole() {

        System.out.println("Dug a hole");

    }


    /* This private method can only be accessed through using other
     * methods in the class */

    public void changeVar(int randNum) {

        randNum = 12;

        System.out.println("randNum in method value: " + randNum);

    }

    private void bePrivate() {
        System.out.println("In a private method");
    }

    // The constructor initializes all objects

    public void accessPrivate() {
        bePrivate();
    }

}