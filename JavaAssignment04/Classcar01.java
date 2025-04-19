class Classcar01 
{
    String brand;
    int speed;
    
    Classcar01(String brand, int speed) 
    {
        this.brand = brand;
        this.speed = speed;
    }
    
    void displayCar() 
    {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + " km/h");
    }
    
    public static void main(String[] args) 
    {
        Classcar01 car1 = new Classcar01("Toyota", 180);
        car1.displayCar();
    }
}
