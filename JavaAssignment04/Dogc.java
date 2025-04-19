interface Animal {
    void eat();
}

class Mammal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}

class Dogc extends Mammal implements Animal {
    public void eat() {
        System.out.println("Dog eats bones.");
    }
    
    public static void main(String[] args) {
        Dogc dog = new Dogc();
        dog.walk();  // Inherited from Mammal
        dog.eat();   // Implemented from Animal interface
    }
}
