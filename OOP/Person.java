package OOP;

public class Person extends PeopleAbstractDemo implements OrganismInterfaceDemo{
    public Person(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is working.");
    }

    @Override
    public void eat() {
        System.out.println("Human cook food.");
    }

    @Override
    public void drink() {
        System.out.println("Human mix drink");
    }

    @Override
    public void sleep() {
        System.out.println("Human make bed.");
    }

    //Overloading
    public void printSalary(int salary){
        System.out.println("Salary is " + salary + "$");
    }
    public void printSalary(double salary){
        System.out.println("Salary is " + salary + "$");
    }
}
