class GrandParent {
    void grandParentMethod() {
        System.out.println("Grandparent class method.");
    }
}

class Parent extends GrandParent {
    void parentMethod() {
        System.out.println("Parent class method.");
    }
}

class Child2 extends Parent {
    void childMethod() {
        System.out.println("Child class method.");
    }

    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.grandParentMethod();  // Inherited from GrandParent
        obj.parentMethod();       // Inherited from Parent
        obj.childMethod();
    }
}
