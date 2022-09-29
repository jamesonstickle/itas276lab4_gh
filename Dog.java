
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Pet
{
    // instance variables - replace the example below with your own
    private String breed;

    /**
     * Constructor for objects of class Cat
     */
    public Dog(String breed, String name, double weight, String color) {
        super(weight, color, name);
        this.breed = breed;
    }

    public void makeNoise()
    {
        System.out.println("The dog goes BORK");
    }

    public String toString(){
        return "Dog " + "Name: " + name + "\nBreed: " + breed +
        "\nWeight: " + weight + "\nColour: " + color;
    }
}
