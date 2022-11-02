import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11,
                muz = 0.95, patlican = 5;
        double totalPrice=0;

        final DecimalFormat df = new DecimalFormat("0.00");

        Scanner in = new Scanner(System.in);

        System.out.print("Armut kaç kilo? :");
        totalPrice += in.nextDouble() * armut;

        System.out.print("Elma kaç kilo? :");
        totalPrice += in.nextDouble() * elma;

        System.out.print("Domates kaç kilo? :");
        totalPrice += in.nextDouble() * domates;

        System.out.print("Muz kaç kilo? :");
        totalPrice += in.nextDouble() * muz;

        System.out.print("Patlıcan kaç kilo? :");
        totalPrice += in.nextDouble() * patlican;

        System.out.println("Toplam tutar: "+ df.format(totalPrice));
    }
}
