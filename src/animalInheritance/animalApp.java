package animalInheritance;

public class animalApp {
    public static void main(String[] args) {
        Animal generic = new Animal();
        System.out.println(generic.getName());
        System.out.println(generic.toString());
        Dog roxy = new Dog("Roxy", 5, 40, "salmon", "stick");
        System.out.println(roxy.getName());
        System.out.println(roxy.toString());
        roxy.playWith();

        Animal pete = new Dog("Pete", 10, 50, "cheese", "ball");
        acceptAnimal(pete);



    }
    public static void acceptAnimal(Animal randAnimal) {
        System.out.println(randAnimal.getName());
        randAnimal.eats();
    }
}
