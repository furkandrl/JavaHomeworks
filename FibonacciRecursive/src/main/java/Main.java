import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter number n to find nth element of a Fibonacci series: ");
        int find = in.nextInt();

        System.out.println(fibo(find));
    }
    static int fibo(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
