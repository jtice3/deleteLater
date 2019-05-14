package animalInheritance;

public class Animal {
    private String name = "animal";
    private int age;
    private int weight;
    private String favFood;

    public Animal (String name, int age, int weight, String food) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.favFood = food;
    }

    public Animal () {

    }

    private void bday() {
        this.age++;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    protected String getName() {
        return name;
    }

    protected void eats() {
        System.out.println(this.name + " loves to eat " + favFood);
    }

    @Override
    public String toString() {
        return name + " is a " + this.getClass();
    }
}
