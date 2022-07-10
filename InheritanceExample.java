class NormalCalculator {

    public int doubleNumber(int a) {
        return 2*a;
    }

    public int addTwoNumbers(int a, int b) {
        return a+b;
    }

    public int addThreeNumbers(int a, int b, int c) {
        return a+b+c;
    }
}

class AdvancedCalculator extends NormalCalculator {
    public int addFourNumbers(int a, int b, int c, int d) {
        return a+b+c+d;
    }
}

class SuperCalculator extends AdvancedCalculator {
    public int multiplyTwoNumbers(int a, int b) {
        return a*b;
    }

    public int multiplyThreeNumbers(int a, int b, int c) {
        return a*b*c;
    }
}

class UltraSuperCalculator extends SuperCalculator {
    public int divide(int a, int b) {
        return a/b;
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        SuperCalculator pdCalc = new SuperCalculator();
        System.out.println("Addition of four numbers is " + pdCalc.addFourNumbers(5, 3, 8, 9));
        System.out.println("Doubling a nu");

    }
}