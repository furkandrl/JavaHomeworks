import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int num;
        int sum = 0;
        int count = 0;

        System.out.print("Enter a number: ");
        num = in.nextInt();

        for(int i = 1; i<=num; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum += i;
                count++;
            }
        }

        System.out.println("Average: "+sum/count);



    }
}
