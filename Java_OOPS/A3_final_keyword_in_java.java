package Java_OOPS;

public class A3_final_keyword_in_java {
    public static void main(String[] args) {
        Circle3 c1 = new Circle3();
        // here we can't change value of c1.radius, because its declared as 'final' ie, value initialization can be once.
        System.out.println("area 1 " + c1.area());
    }
}

class Circle3 {
    // value of variables with final keyword can not be changed, its like unique and one time initialization
    // final methods can not be overriden.
    public final float radius;
    public static final float PI = 3.14f;

    public Circle3(float radius) {
        this.radius = radius;
    }

    public float area() {
        return PI * this.radius * this.radius;
    }
}
