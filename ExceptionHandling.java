import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a ");
            int a = sc.nextInt();
            System.out.println("Enter the value of b ");
            int b = sc.nextInt();
            System.out.println("before division");
            int ans = a / b;
            System.out.println("after division");
            System.out.println("Division of two numbers is " + ans);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Arithmetic exception occurred and division by 0 is not possible");
        } catch (InputMismatchException e) {
            System.out.println("Input is not proper");
        }
    }