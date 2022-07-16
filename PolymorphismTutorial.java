class NithinCalc {
    // Method overloading/ Compile time polymorphism
    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }

    public double add(double a, double b) {
        return a+b;
    }
}

public class PolymorphismTutorial {
    public static void main(String[] args) {
        NithinCalc obj = new NithinCalc();
        System.out.println("Adding two numbers is " + obj.add(5,6)); // 11
        System.out.println("Adding three numbers is " + obj.add(5,6, 7)); //18
        System.out.println("Adding two doubles is " + obj.add(5.678,6.789));
    }
}