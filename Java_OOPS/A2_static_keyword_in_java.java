package Java_OOPS;

public class A2_static_keyword_in_java {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(12.1f);
        System.out.println("area 1" + c1.area());

        Circle2 c2 = new Circle2(18.9f);
        System.out.println("area 2 " + c2.area());

        // here variable PI will get created only once for Circle2, here its used for memory management in java.
    }
}

class Circle2 {
    public float radius;
    public static float PI = 3.14f;
    // static keyword is common for all objects for a class, it does not get created every time when a single object is created but it is always common for all objects and its unique for a class.
    // In Java, static keyword is mainly used for memory management.

    public Circle2() {
    }

    public Circle2(float radius) {
        this.radius = radius;
    }

    public float area() {
        return PI * this.radius * this.radius;
    }
}
