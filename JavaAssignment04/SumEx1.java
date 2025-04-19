class SumEx1 {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double sum(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        SumEx1 obj = new SumEx1();
        System.out.println("Sum of two integers: " + obj.sum(10, 20));
        System.out.println("Sum of three integers: " + obj.sum(10, 20, 30));
        System.out.println("Sum of two doubles: " + obj.sum(10.5, 20.5));
        System.out.println("Sum of three doubles: " + obj.sum(10.5, 20.5, 30.5));
    }
}
