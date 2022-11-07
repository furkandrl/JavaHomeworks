import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        double result = 0;

        for(int i = 1; i <= n; i++){
            result += (1.0 / i);
        }
        System.out.println(result);
    }
}
