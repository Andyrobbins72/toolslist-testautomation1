package co.uk.safebear;

import co.uk.safebear.kennels.Dog;
import org.junit.Test;

public class DogTest {

    @Test
    public void Dogtest() {

        //create a list with each line seperated by the semi-colon

        Dog Rufus = new Dog();
        Dog Fido = new Dog();
        Dog Bouncer = new Dog();
        Dog Bob = new Dog();

        //set the state
        Rufus.setIsNeutered(true);
        Fido.setIsNeutered(false);
        Bouncer.setIsNeutered(true);
        Bob.setIsNeutered(false);

    }

}