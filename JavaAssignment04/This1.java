class This1 {
    String name;
    int age;

    This1() {
        this("Unknown", 0); // Calls parameterized constructor
    }

    This1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        This1 s1 = new This1();
        This1 s2 = new This1("Rohan", 21);

        s1.display();
        s2.display();
    }
}
