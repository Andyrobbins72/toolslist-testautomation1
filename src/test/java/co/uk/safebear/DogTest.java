package co.uk.safebear;

import co.uk.safebear.kennels.Dog;
import org.junit.Test;

public class DogTest {

    @Test
    public void Dogtest() {

        //create a list of objects with each line seperated by the semi-colon
        Dog rufus = new Dog();
        Dog fido = new Dog();
        Dog bouncer = new Dog();
        Dog bob = new Dog();

        //set the state for each object
        rufus.setIsNeutered(true);
        rufus.setBreed("Terrier");
        fido.setIsNeutered(false);
        fido.setBreed("Pitbull");
        bouncer.setIsNeutered(true);
        bouncer.setBreed("Poodle");
        bob.setIsNeutered(false);
        bob.setBreed("Terrier");

        //display output onto the screen for each object
        System.out.println("Rufus' neutered status is " + rufus.getIsNeutered() + " and breed is " + rufus.getBreed());
        System.out.println("Fido's neutered status is " + fido.getIsNeutered() + " and breed is " + fido.getBreed());
        System.out.println("Bouncer's neutered status is " + bouncer.getIsNeutered() + " and breed is " + bouncer.getBreed());
        System.out.println("Bob's neutered status is " + bob.getIsNeutered() + " and breed is " + bob.getBreed());
    }

}