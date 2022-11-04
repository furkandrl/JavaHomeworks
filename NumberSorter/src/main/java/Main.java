import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//sorting from smallest to biggest
        System.out.print("Enter number a: ");
        int a = sc.nextInt();

        System.out.print("Enter number b: ");
        int b = sc.nextInt();

        System.out.print("Enter number c: ");
        int c = sc.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a < b < c");
            }
            if (c < b) {
                System.out.println("a < c < b");
            }
        } else if (b < a && b < c) {
            if (c < a) {
                System.out.println("b < c < a");
            }
            if (a < c) {
                System.out.println("b < a < c");
            }
        } else if (c < a && c < b) {
            if (b < a) {
                System.out.println("c < b < a");
            }
            if (a < b) {
                System.out.println("c < a < b");
            }
        }
    }
}
