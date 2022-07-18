package Java_OOPS;

public class a_z1_constructors {
    public static void main(String[] args) {
        Circle c1 = new Circle(12.1f);
        System.out.println("area is " + c1.area());

        Circle c2 = new Circle(26.1f);
        System.out.println("area is " + c2.area());
    }
}

class Circle {
    public float radius;
    public Circle(float radius) {
        this.radius = radius;
    }

    public float area() {
        return 3.14f * radius * radius;
    }
}
