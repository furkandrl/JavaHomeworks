import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = in.nextInt();
        System.out.print("Enter its power: ");
        int power = in.nextInt();
        in.close();

        System.out.println(power(base, power));
    }

    static double power(int base, int power){
        if(power > 0){
            return base * power(base, power - 1);
        }else if(power < 0){
            return power(base, power + 1) / base; //for negative powers
        }else{
            return 1;
        }
    }
}
