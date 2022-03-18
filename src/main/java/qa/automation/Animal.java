package qa.automation;

public class Animal{

    public String breed;
    private double price;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        }else{
            System.out.println("Invalid data!");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    public Animal(String breed, double price) {
        setBreed(breed);
        setPrice(price);
    }
}
