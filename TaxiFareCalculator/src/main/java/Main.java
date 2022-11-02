import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double basePrice = 10;
        double minimumPrice = 20;
        double pricePerKm = 2.2;
        int km;
        double totalPrice;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Km amount: ");
        km = sc.nextInt();

        if(basePrice + (pricePerKm * km) < 20){
            totalPrice = minimumPrice;
        }else{
            totalPrice = basePrice + (pricePerKm * km);
        }

        System.out.print("Total price: "+totalPrice);

    }
}
