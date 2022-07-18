package Java_OOPS;

class Circle {
    public float area(float radius) {
        return 3.14f * radius;
    }
}

public class A_z_more_than_one_object_of_a_class {
   public static void main(String[] args) {
       Circle c1 = new Circle();
       System.out.println("first area" + c1.area(2.1f));

       Circle c2 = new Circle();
       System.out.println("second area" + c2.area(10f));

       Circle c3 = new Circle();
       System.out.println("third aread" + c3.area(15.2f));
   }
}
