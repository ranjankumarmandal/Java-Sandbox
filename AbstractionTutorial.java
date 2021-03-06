abstract class Shape {
    abstract void drawShape();
    abstract double perimeter();
    abstract double area();

    void func() {
        System.out.println("This is example");
    }
    // 1. abstract methods need no implementation
    // 2. When some class extends this, that class must override/implement these methods
    // 3. You can have normal methods also
}

interface ShapeInterface {
    abstract void drawShape();
    abstract double perimeter();
    abstract double area();
    // 1. interfaces provide 100% abstraction but abstract classes not
    // 2. we can do inheritance with keyword implements
    // 3. You can not use normal methods here like abstract classes
}



class Rectangle extends Shape {
    double length;
    double breadth;

    public void drawShape() {
        System.out.println("Drawing rectangle");
    }

    public double perimeter() {
        return 2*(length+breadth);
    }

    public double area() {
        return length*breadth;
    }
}

class Square extends Shape {
    double side;

    public void drawShape() {
        System.out.println("Drawing square");
    }

    public double perimeter() {
        return 4*side;
    }

    public double area() {
        return side*side;
    }
}

public class AbstractionTutorial {
    public static void main(String[] args) {

    }
}