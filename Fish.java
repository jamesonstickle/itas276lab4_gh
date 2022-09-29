
/**
 * Write a description of class Fish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fish extends Pet
{
    private String species;
    private String waterType;

    public Fish(String species, double weight, String color, String name, String waterType) {
        super(weight, color, name);
        this.species = species;
        this.waterType = waterType;
    }

    public void makeNoise()
    {
        System.out.println("The fish goes SPLASH");
    }

    public String toString(){
        return "Fish " + "Species: " + species + "\nWeight: " + weight +
        "\nColour: " + color + "\nSalt or Fresh water?" + waterType;
    }
}
