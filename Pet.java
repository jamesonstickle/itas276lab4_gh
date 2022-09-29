
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Pet extends Animal {
    protected String name;

    /**
     * Constructor for objects of class Animal
     */
    public Pet(double weight, String name, String color) {
        super(weight, color);
        this.name = name;
    }
}