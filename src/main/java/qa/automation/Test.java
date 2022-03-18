package qa.automation;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Siamese", 100, "Katty", true, 6);
        System.out.println("Name: " + cat1.getName());
        System.out.println("Breed: " + cat1.getBreed());
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Tail: " + cat1.isHasTail());
        System.out.println("Price: " + cat1.getPrice());
        cat1.run();
        cat1.jump();
        cat1.eat();
    }


}