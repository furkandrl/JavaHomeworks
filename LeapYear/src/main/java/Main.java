import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Year: ");
        int year = in.nextInt();

        if(year % 100 == 0 && year % 4 == 0){
            if(year % 400 == 0){
                System.out.println(year+" is a leap year.");
            }else{
                System.out.println(year+" is not a leap year.");
            }
        }else if(year % 4 == 0){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is not a leap year.");
        }
    }
}
