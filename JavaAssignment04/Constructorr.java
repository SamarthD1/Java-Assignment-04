class Constructorr {
    String name;
    
    Constructorr(String name) {
        this.name = name;
    }
    
    void display() {
        System.out.println("Name: " + name);
    }
    
    public static void main(String[] args) {
        Constructorr p1 = new Constructorr("Ram");
        p1.display();
    }
}
