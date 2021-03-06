package Java_OOPS;

public class a_z1_constructors {
    public static void main(String[] args) {
        Circle c1 = new Circle(12.1f);
        System.out.println("area is " + c1.area());

        Circle c2 = new Circle(26.1f);
        System.out.println("area is " + c2.area());

        Circle c3 = new Circle();
        System.out.println("here area will be zero - " + c3.area());
    }
}

class Circle {
    public float radius;

    // default constructor
    public Circle() {
    }

    // parameterised constructor
    public Circle(float radius) {
        this.radius = radius;
    }

    public float area() {
        return 3.14f * this.radius * this.radius;
    }
}
