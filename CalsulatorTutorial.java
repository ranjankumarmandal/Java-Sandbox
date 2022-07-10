class Calculator {
    int a;
    int b;

    public void add() {
        int ans = a + b;
        System.out.println("Sum of two numbers is " + ans);
    }

}

public class CalsulatorTutorial {
    public static void main(String[] args) {
        Calculator nithinCalc = new Calculator();
        nithinCalc.a = 10;
        nithinCalc.b = 15;
        nithinCalc.add(); // Before

        nithinCalc.b = 29;
        nithinCalc.add(); //After
    }
}