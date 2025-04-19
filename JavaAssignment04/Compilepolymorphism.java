class Compilepolymorphism {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Compilepolymorphism obj = new Compilepolymorphism();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5.5, 2.3));
    }
}
