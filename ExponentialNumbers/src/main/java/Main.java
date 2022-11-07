import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.print("Enter its power: ");
        int k = in.nextInt();
        int numWithPower = 1;

        for(int i = 0; i < k; i++){
            numWithPower *= n;

        }
        System.out.println("Exponential number is: "+numWithPower);
    }
}
