class NithinCalc1 {
    public void calcOwner() {
        System.out.println("Nithin is owner of this calculator");
    }

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

class GaneshCalc extends NithinCalc1 {
    // Method overriding/ Run time polymorphism
    public void calcOwner() {
        System.out.println("Ganesh is the owner of this calc");
    }
}

public class PolymorphismTutorialDynamic {
    public static void main(String[] args) {
        GaneshCalc ganesh = new GaneshCalc();
        System.out.println("Adding three numbers " + ganesh.add(6,7,8));
        ganesh.calcOwner();
    }
}