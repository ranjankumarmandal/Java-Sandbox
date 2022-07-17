package Java_OOPS;

public class A_1st_object {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        c1.radius = 10.0f;
        System.out.println(c1.area());

        Circle1 c2 = new Circle1();
        c2.radius = 11.1f;
        System.out.println(c2.area());
    }
}

class Circle1 {
    float radius;
    public float area() {
        return 3.14f * radius * radius;
    }
}

