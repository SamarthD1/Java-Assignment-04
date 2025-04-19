class Person {
    public String name;
    private int age;
    protected String country;
    
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Rama";
        p.setAge(30);
        System.out.println("Name: " + p.name + ", Age: " + p.getAge());
    }
}


