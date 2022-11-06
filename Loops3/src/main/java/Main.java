import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();


        for(int i = 1; i <= num; i *= 4){
            System.out.println(i);
        }

        for(int i = 1; i <= num; i *= 5){
            System.out.println(i);
        }


    }
}
