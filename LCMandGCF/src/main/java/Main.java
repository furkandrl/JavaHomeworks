import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);



        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();

        int numerator = (a > b) ? a : b;
        int denominator = (a < b) ? a : b; //to find greater number
        int remainder = numerator % denominator;

        while (remainder != 0)
        {
            numerator   = denominator;
            denominator = remainder;
            remainder   = numerator % denominator;
            //Keep on dividing the greater number by the smaller number until remainder becomes 0.
        }
        int gcd = denominator; //ebob
        int lcm = a * b / gcd; //ekok

        System.out.println(String.format("GCD of %d and %d = %d ",a, b, gcd));
        System.out.println(String.format("LCM of %d and %d = %d ",a, b, lcm));
    }

}
