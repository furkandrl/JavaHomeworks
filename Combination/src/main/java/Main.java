import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);


        System.out.print("To calculate C(n,r)");
        System.out.println("Enter n: ");
        int n = in.nextInt();
        System.out.println("Enter r: ");
        int r = in.nextInt();

        int combination = factorial(n) / (factorial(r) * (factorial(n - r)));

        System.out.println("C(n, r) = "+combination);
    }
    public static int factorial(int a){ //method to calculate factorial of each number
        int fact = 1;
        for (int i = 1; i <= a; i++){
            fact = fact * i;
        }
        return fact;
    }
}
