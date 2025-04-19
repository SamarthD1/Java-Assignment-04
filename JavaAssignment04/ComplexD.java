class Complex {
    private double real;
    private double imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex n) {
        return new Complex(this.real + n.real, this.imag + n.imag);
    }

    public Complex subtract(Complex n) {
        return new Complex(this.real - n.real, this.imag - n.imag);
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    @Override
    public String toString() {
        return real + (imag >= 0 ? " + " : " - ") + Math.abs(imag) + "i";
    }
}

class ComplexD {
    public static void main(String[] args) {
        Complex c1 = new Complex(4.5, 6.3);
        Complex c2 = new Complex(2.2, 3.1);
        Complex c3 = new Complex();

        System.out.println("Complex Number 1: " + c1);
        System.out.println("Complex Number 2: " + c2);
        System.out.println("Complex Number 3 (Default Constructor): " + c3);

        Complex sum = c1.add(c2);
        System.out.println("Sum: " + sum);

        Complex difference = c1.subtract(c2);
        System.out.println("Difference: " + difference);

        c3.setReal(5.5);
        c3.setImag(-4.5);
        System.out.println("Updated Complex Number 3: " + c3);

        System.out.println("Real part of Complex Number 3: " + c3.getReal());
        System.out.println("Imaginary part of Complex Number 3: " + c3.getImag());
    }
}
