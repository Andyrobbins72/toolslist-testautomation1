package co.uk.safebear.kennels;

public class Dog {

    //define your variables with an appropriate type

    private int age;
    private boolean isNeutered;
    private String breed;  //string starts with a capital S whereas all others are lower case

    //create a new method to set one of the above variables using another temp input variable

    public void setIsNeutered(boolean newIsNeutered) {
        isNeutered = newIsNeutered;
    }

    public void setBreed(String newBreed) {
        breed = newBreed;
    }

    public boolean getIsNeutered() {
        return isNeutered;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

}
