
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Pet
{
    // instance variables - replace the example below with your own
    private String family;
    private String name;

    /**
     * Constructor for objects of class Cat
     */
    public Cat(String family, String name, double weight, String color) {
        super(weight, color, name);
        this.family = family;
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("The cat goes MEW");
    }

    public String toString() {
        return "Cat " + "Name: " + name + "\nFamily: " + family +
        "\nWeight: " + weight + "\nColour: " + color;
    }
}
