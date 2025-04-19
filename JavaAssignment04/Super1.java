class Animal {
    String type;

    Animal(String type) {
        this.type = type;
    }

    void showType() {
        System.out.println("Type: " + type);
    }
}

class Super1 extends Animal {
    String breed;

    Super1(String type, String breed) {
        super(type); // Calls Animal constructor
        this.breed = breed;
    }

    void display() {
        super.showType(); // Calls parent class method
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Super1 dog = new Super1("Mammal", "Labrador");
        dog.display();
    }
}
