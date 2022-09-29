
/**
 * Write a description of class Bird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bird extends Animal
{
    private boolean canFly;
    private String species;

    public Bird(String species, double weight, String color, boolean canFly) {
        super(weight, color);
        this.species = species;
        this.canFly = canFly;
    }

    public void makeNoise()
    {
        System.out.println("The bird goes CHIRP");
    }

    public String toString(){
        return "Bird " + "Species: " + species + "\nWeight: " + weight +
        "\nColour: " + color + "\nCan it fly? " + canFly;
    }
}
