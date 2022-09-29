
/**
 * Write a description of class Monkey here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Monkey extends Pet
{
    private String species;
    boolean eatsBananas;

    public Monkey(String species, double weight, String color, String name, boolean eatsBananas) {
        super(weight, color, name);
        this.species = species;
        this.eatsBananas = eatsBananas;
    }

    public void makeNoise()
    {
        System.out.println("The monkey goes OO OO");
    }

    public String toString(){
        return "Monkey " + "Species: " + species + "\nWeight: " + weight +
        "\nColour: " + color + "\nDoes it eat bananas?" + eatsBananas;
    }
}