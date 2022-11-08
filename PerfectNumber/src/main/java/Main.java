import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = 0; //sum of all multiples

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if(sum == num){
            System.out.print(num+" is a perfect number.");
        }else{
            System.out.print(num+" is NOT a perfect number");
        }
    }
}
