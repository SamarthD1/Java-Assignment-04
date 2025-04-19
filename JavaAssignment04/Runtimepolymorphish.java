class Parent {
    void show() {
        System.out.println("Parent class method.");
    }
}

class Runtimepolymorphish extends Parent {
    @Override
    void show() {
        System.out.println("Child class method.");
    }
    
    public static void main(String[] args) {
        Parent obj = new Runtimepolymorphish();
        obj.show();
    }
}
