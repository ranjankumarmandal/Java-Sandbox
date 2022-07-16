class NormalCalculator {
public int addTwoNumbers(int a, int b) {
        int ans = a + b;
        return ans;
        }

public int addThreeNumbers(int a, int b, int c) {
        int ans = a + b + c;
        return ans;
        }
        }

class AdvancedCalculator extends NormalCalculator {

    public int addFourNumbers(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    public int multiplyTwoNumbers(int a, int b) {
        return a*b;
    }
}

class SuperCalculator extends AdvancedCalculator {
    public int multiplyThreeNumbers(int a, int b, int c) {
        return a*b*c;
    }
}

class UltraSuperCalculator extends SuperCalculator {
    public int divide(int a, int b) {
        return a/b;
    }
}