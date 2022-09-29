import java.util.ArrayList;

/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    public static void main(String args[]) {
    System.out.println("Running the Zoo program");
    Cat cat1 = new Cat("Calico", "Patches", 7, "White/Black/Orange");
    Cat cat2 = new Cat("Tabby", "Simba", 10, "Orange");
    Cat cat3 = new Cat("Siamese", "Alvin", 9, "White");
    Dog dog1 = new Dog("Golden", "Buddy", 28, "Gold");
    Dog dog2 = new Dog("Husky", "Nala", 25, "Black/White");
    Bird bird1 = new Bird("Parrot", 4, "Rainbow", true);
    Bird bird2 = new Bird("Penguin", 30, "Black", false);
    Fish fish1 = new Fish("Salmon", 22, "Steel", "Freddie", "Saltwater");
    Fish fish2 = new Fish("Trout", 10, "Rainbow", "Louie", "Freshwater");
    Monkey monkey1 = new Monkey("Baboon", 80, "Brown", "Donkey", true);
    Monkey monkey2 = new Monkey("Capuchin", 9, "Grey", "Diddy", false);
    
    ArrayList<Animal> critterList = new ArrayList<Animal>();
    
    critterList.add(cat1);
    critterList.add(cat2);
    critterList.add(cat3);
    critterList.add(dog1);
    critterList.add(dog2);
    critterList.add(bird1);
    critterList.add(bird2);
    critterList.add(fish1);
    critterList.add(fish2);
    critterList.add(monkey1);
    critterList.add(monkey2);
    
    for (Animal a: critterList) {
       System.out.println(a.toString());
       a.makeNoise();
    }
}
}
