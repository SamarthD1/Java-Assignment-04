class Circle {
    // Private instance variable
    private double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0; // Default radius value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method to return radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius; // Area = π * r^2
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius; // Circumference = 2 * π * r
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Circle object using the default constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.calculateArea());
        System.out.println("Circumference: " + circle1.calculateCircumference());
        
        System.out.println(); // Line break

        // Creating a Circle object using the parameterized constructor
        Circle circle2 = new Circle(5.5);
        System.out.println("Circle 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.calculateArea());
        System.out.println("Circumference: " + circle2.calculateCircumference());
    }
}
