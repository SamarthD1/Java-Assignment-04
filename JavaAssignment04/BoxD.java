class Box {
    double length, width, height;

    public Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(Box ob) {
        this.length = ob.length;
        this.width = ob.width;
        this.height = ob.height;
    }

    public void printBox() {
        System.out.println("Box Dimensions: " + length + " x " + width + " x " + height);
    }
}

class BoxWt extends Box {
    double weight;

    public BoxWt() {
        super();
        this.weight = 1.0;
    }

    public BoxWt(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public BoxWt(BoxWt ob) {
        super(ob);
        this.weight = ob.weight;
    }

    public void printBoxWt() {
        printBox();
        System.out.println("Weight: " + weight);
    }
}

class BoxColor extends BoxWt {
    String color;

    public BoxColor() {
        super();
        this.color = "White";
    }

    public BoxColor(double length, double width, double height, double weight, String color) {
        super(length, width, height, weight);
        this.color = color;
    }

    public BoxColor(BoxColor ob) {
        super(ob);
        this.color = ob.color;
    }

    public void printBoxColor() {
        printBoxWt();
        System.out.println("Color: " + color);
    }
}

public class BoxD {
    public static void main(String[] args) {
        BoxColor defaultBox = new BoxColor();
        System.out.println("Default Box:");
        defaultBox.printBoxColor();
        System.out.println();

        BoxColor paramBox = new BoxColor(5, 4, 3, 10.5, "Red");
        System.out.println("Parameterized Box:");
        paramBox.printBoxColor();
        System.out.println();

        BoxColor copiedBox = new BoxColor(paramBox);
        System.out.println("Copied Box:");
        copiedBox.printBoxColor();
    }
}
