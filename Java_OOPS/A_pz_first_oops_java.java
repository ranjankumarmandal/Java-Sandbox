package Java_OOPS;

public class A_pz_first_oops_java {
    static float radius = 10.0f;
    public static void main(String[] args) {
        System.out.println(Circle.area(radius));
    }
}

class Circle {
    public static float area(float radius) {
        return 3.14f * radius * radius;
    }
}
