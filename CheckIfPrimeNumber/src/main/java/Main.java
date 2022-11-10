import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if (isPrime(n, 2)){
            System.out.println("It is a prime number.");
        }else{
            System.out.println("It is NOT prime number.");
        }

    }

    static boolean isPrime(int n, int i){
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }
}
