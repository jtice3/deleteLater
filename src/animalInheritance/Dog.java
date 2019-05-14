package animalInheritance;

public class Dog extends Animal {
    private String favToy = "";

    public Dog (String name, int age, int weight, String food, String favToy) {
        // invoking base-class(Animal) constructor
        super(name, age, weight, food);
        this.favToy = favToy;
    }

    public void playWith () {
        System.out.println("Plays with " + favToy);
    }

    private void moves() {
        System.out.println(this.getName() + " bolts around");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "pet=" + getName() +
                '}';
    }
}
