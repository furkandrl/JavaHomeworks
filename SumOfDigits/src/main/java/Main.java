import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = 0;

        while(num % 10 != 0){
            sum += num % 10;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
