package OOP;

public class Test {
    public static void main(String[] args) {
        Person tung = new Person("Tung", 29, "Khuat Duy Tien");
        Cat meow = new Cat("Meow", 2, "Động vật họ mèo");
        System.out.println("Test overloading:");
        tung.printSalary(10);
        tung.printSalary(10f);
        System.out.println("Test overriding:");
        meow.sleep();
    }
}
