public class LoopExample {
    public static void main(String[] args) {
        /*for(int i=1; i<=0; i++) {
            System.out.println("Value of i is " + i);
        }*/
        /*int i=1;
        while(i<=0) {
            System.out.println("Value of i is " + i);
            i = i+3;
        }*/
        int i=1;
        do {
            System.out.println("Value of i is " + i);
            i++;
        } while(i<=0);
    }
}