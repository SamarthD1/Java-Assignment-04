class Sum {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismD1 {
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println("Sum of two integers: " + sum.add(10, 20));
        System.out.println("Sum of two doubles: " + sum.add(10.5, 20.5));
        
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}

