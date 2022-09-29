
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Animal
{
    // instance variables - replace the example below with your own
    protected double weight;
    protected String color;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public abstract void makeNoise();
}
