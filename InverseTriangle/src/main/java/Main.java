import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();


        for (int i = 1; i < n; i++) {

            for(int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * n - (2 * i + 1)); k++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
