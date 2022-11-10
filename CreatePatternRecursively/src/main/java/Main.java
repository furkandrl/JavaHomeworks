import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        pattern(n);
    }

    static void pattern(int a){
        System.out.print(a+" ");
        if(a > 0){
            pattern(a - 5);
            System.out.print(a+" ");
        }
    }
}
