package Java_OOPS;

public class A1_why_more_than_one_class {
    static float radius = 10.0f;
    public static void main(String[] args) {
        System.out.println(Circle.area(radius));
        System.out.println(Square.area(radius));
    }
}

class Circle {
    static float area(float radius) {
        return 3.14f * radius * radius;
    }
}

class Square {
    static float area(float side) {
        return side * side;
    }
}