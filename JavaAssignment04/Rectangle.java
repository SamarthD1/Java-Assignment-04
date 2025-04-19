class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;
    Rectangle() { }
    Rectangle(float length, float width) {
    this.length = length;
    this.width = width;
    }
    float getLength() {
    return length;
    }
    void setLength(float length) {
    this.length = length;
    }
    float getWidth() {
    return width;
    }
    void setWidth(float width) {
    this.width = width;
    }
    double getArea() {
    return length * width;
    }
    double getPerimeter() {
    return 2 * (length + width);
    }
    public String toString() {
    return "Rectangle[length=" + length + ", width=" + width + "]";
    }
    public static void main(String[] args) {
    Rectangle r = new Rectangle(5.0f, 3.0f);
    System.out.println(r);
    System.out.println("Area: " + r.getArea());
    System.out.println("Perimeter: " + r.getPerimeter());
    }
    }