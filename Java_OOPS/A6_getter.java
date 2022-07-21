package Java_OOPS;

public class A6_getter {
    public static void main(String[] args) {
        Student1 s1 = new Student1(3.4f);
        System.out.println(s1.getRadius());
    }
}

class Student1 {
    private float radius;

    public Student1(float radius) {
        this.radius = radius;
    }

    // getter method - this method used to return some values from a class
    public float getRadius() {
        return this.radius;
    }
}
