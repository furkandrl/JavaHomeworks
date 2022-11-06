import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int num;
        int sum = 0;

        do{
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if(num % 4 == 0){
                sum += num;
            }

        }while(num % 2 != 1);

        System.out.println("Sum: "+sum);
    }
}
