package co.uk.safebear;

import co.uk.safebear.kennels.Owner;
import org.junit.Test;

public class OwnerTest {

    @Test
    public void OwnerTest(){
        Owner.setName("Robbins");

        System.out.println("Owners name is " + Owner.getName());

    }
}
