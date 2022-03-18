package qa.automation;

public class Cat extends Animal implements AnimalActions {

    private String name;
    private boolean hasTail;
    private int age;

    public Cat(String breed, double price, String name, boolean hasTail, int age) {
        super(breed, price);
        setName(name);
        setHasTail(hasTail);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }else {
            System.out.println("Invalid data!");
        }
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }else{
            System.out.println("Invalid data!");
        }
    }

    @Override
    public void run()  {System.out.println(name + " is running...");}

    @Override
    public void jump()  {System.out.println(name + " is jumping...");}

    @Override
    public void eat() {System.out.println(name + " is eating...");}
    }
