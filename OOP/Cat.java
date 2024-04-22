package OOP;

public class Cat extends AnimalAbstractDemo implements OrganismInterfaceDemo{

    public Cat(String name, int age, String group) {
        super(name, age, group);
    }

    @Override
    public void play() {
        System.out.println("Cat " + this.getName() + " play with ball.");
    }

    @Override
    public void eat() {
        System.out.println("Cat " + this.getName() + " eat pate.");
    }

    @Override
    public void drink() {
        System.out.println("Cat " + this.getName() + " drink in bowl.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + this.getName() + " sleep on lap.");
    }
}
