package Java_OOPS;

public class A5_private_access_modifiers {
    public static void main(String[] args) {
        Circle5 c1 = new Circle5(4.5f);
        c1.area();
        // here we can't do c1.radius, because radius inside class Circle5 is private
    }
}

class Circle5 {
    private float radius;

    Circle5(float radius) {
        this.radius = radius;
    }

    public float area() {
        return 3.14f * this.radius * this.radius;
    }
}
