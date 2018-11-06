package L1_2;

public class WorkWithAnimals{

    int justANum = 10;

    public static void main(String[] args){

        Dog fido = new Dog();

        fido.setName("Fido");
        System.out.println(fido.getName());

        fido.digHole();

        fido.setWeight(-1);

        // Everything is pass by value
        // The original is not effected by changes in methods

        int randNum = 10;
        fido.changeVar(randNum);

        System.out.println("randNum after method call: " + randNum);

        // Objects are passed by reference to the original object
        // Changes in methods do effect the object

        changeObjectName(fido);

        System.out.println("Dog name after method call: " + fido.getName());
    }

    // Any methods that are in a class and not tied to an object must
    // be labeled static. Every object created by this class will
    // share just one static method

    public static void changeObjectName(Dog fido){

        fido.setName("Marcus");

    }

    // Receives Animal objects and makes them speak

    public static void speakAnimal(Animal randAnimal){

        System.out.println("Animal says: " + randAnimal.getSound());

    }

    // This is a non-static method used to demonstrate that you can't
    // call a non-static method inside a static method

    public void sayHello(){

        System.out.println("Hello");

    }

}
