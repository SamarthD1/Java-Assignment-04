class Animal {
    private boolean vegetarian;
    private String food;
    private int numOfLegs;

    public Animal() {
        this.vegetarian = false;
        this.food = "Unknown";
        this.numOfLegs = 4;
    }

    public Animal(boolean vegetarian, String food, int numOfLegs) {
        this.vegetarian = vegetarian;
        this.food = food;
        this.numOfLegs = numOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public String toString() {
        return "Animal [Vegetarian=" + vegetarian + ", Food=" + food + ", Num of Legs=" + numOfLegs + "]";
    }
}

class Cat extends Animal {
    private String color;

    public Cat() {
        super();
        this.color = "Unknown";
    }

    public Cat(boolean vegetarian, String food, int numOfLegs, String color) {
        super(vegetarian, food, numOfLegs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat [Color=" + color + ", " + super.toString() + "]";
    }
}

class Cow extends Animal {
    private String breed;

    public Cow() {
        super();
        this.breed = "Unknown";
    }

    public Cow(boolean vegetarian, String food, int numOfLegs, String breed) {
        super(vegetarian, food, numOfLegs);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cow [Breed=" + breed + ", " + super.toString() + "]";
    }
}

public class AnimalD {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println("Default Cat:");
        System.out.println(cat1);
        System.out.println();

        Cat cat2 = new Cat(false, "Fish", 4, "Black");
        System.out.println("Parameterized Cat:");
        System.out.println(cat2);
        System.out.println();

        Cow cow1 = new Cow();
        System.out.println("Default Cow:");
        System.out.println(cow1);
        System.out.println();

        Cow cow2 = new Cow(true, "Grass", 4, "Jersey");
        System.out.println("Parameterized Cow:");
        System.out.println(cow2);
    }
}
