import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*Scanner in = new Scanner(System.in).useLocale(Locale.GERMANY);
*///for languages that use comma to separate instead of point
        System.out.print("Please enter your height in meters: ");
        double height = in.nextDouble();
        System.out.print("Please enter your wight in Kg: ");
        double kg = in.nextDouble();

        System.out.println("Your BMI is: "+(kg/(height*height)));
    }
}
