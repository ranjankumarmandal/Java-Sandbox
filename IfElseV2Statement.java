import java.util.Scanner;

public class IfElseV2Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt(); // sc.next(); -> to scan string

        if(num%15 == 0) {
            System.out.println("Fizz Bizz");
        }
        else if(num%5 == 0) {
            System.out.println("Fizz");
        }
        else if(num%3 == 0) {
            System.out.println("Bizz");
        }
        else {
            System.out.println("Nothing");
        }
    }
}