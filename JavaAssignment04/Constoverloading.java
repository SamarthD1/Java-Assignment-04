class Constoverloading {
    String brand;
    int speed;
    
    Constoverloading() {
        brand = "Unknown";
        speed = 0;
    }
    
    Constoverloading(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    
    void display() {
        System.out.println("Car: " + brand + ", Speed: " + speed);
    }
    
    public static void main(String[] args) {
        Constoverloading car1 = new Constoverloading();
        Constoverloading car2 = new Constoverloading("BMW", 200);
        car1.display();
        car2.display();
    }
}
