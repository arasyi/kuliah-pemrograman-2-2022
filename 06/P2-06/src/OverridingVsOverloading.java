public class OverridingVsOverloading {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
//        p.sayHello();
        c.sayHello();
        c.apapun(3);
        c.apapun(3.0);
    }
}

class Parent {
    void apapun(int i) {
        System.out.println(i * 2);
    }

    void sayHello() {
        System.out.println("Hello");
    }
}

class Child extends Parent {
    // override
    void apapun(int i) {
        System.out.println(i * 3);
    }

    // overload
    void apapun(double i) {
        System.out.println(i * 3);
    }

    void sayHello() {
        super.sayHello(); // Hello
        System.out.println("Welcome to UISI");
    }
}
