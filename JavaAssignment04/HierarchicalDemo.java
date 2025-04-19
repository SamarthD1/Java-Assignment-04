class Parent {
    void parentMethod() {
        System.out.println("Parent class method.");
    }
}

class Child1 extends Parent {
    void child1Method() {
        System.out.println("Child1 class method.");
    }
}

class Child2 extends Parent {
    void child2Method() {
        System.out.println("Child2 class method.");
    }
}

public class HierarchicalDemo {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        obj1.parentMethod();  // Inherited from Parent
        obj1.child1Method();
        
        Child2 obj2 = new Child2();
        obj2.parentMethod();  // Inherited from Parent
        obj2.child2Method();
    }
}
