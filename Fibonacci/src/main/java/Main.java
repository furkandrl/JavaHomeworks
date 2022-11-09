import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int t1 = 0, t2 = 1;// first 2 numbers

        int nextNum = t1 + t2;

        System.out.println(t1);
        System.out.println(t2);
        for (int i = 3; i <= num; i++) {
            System.out.println(nextNum);
            t1 = t2;
            t2 = nextNum;
            nextNum = t1 + t2;
        }
    }
}
