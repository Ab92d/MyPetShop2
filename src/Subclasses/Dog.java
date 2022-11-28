package Subclasses;

import Interfaces.Walk;

public class Dog extends Pet implements Walk {

    // This constructor derives from the Pet class. The variables are
    // not listed here, but are extended from the Pet class.
    public Dog(String name, int age) {
        super(name, age);
    }

    // This method can only be used by the Subclasses.Dog class and any of its child classes
    public void dig() {
        System.out.println(getName() + " digs a hole!");
    }

    // This Method overrides the make sound method found in the Pet Class.
    // Overrides is implemented here so doesnt need to be stated
    public void makeSound() {
        System.out.println("Wooff!!!");
    }

    // This method must be created as teh class is a subclass of Pets
    public void eats(){
        System.out.println("Nom Nom Nom");
    }
}


