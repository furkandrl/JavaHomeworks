import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pricePerKm = 0.10;
        double basePrice;//price without discounts
        double ageDiscount=0;
        double roundTripDiscount = 0;
        double totalPrice;

        System.out.print("Enter the distance in Km: ");
        int km = in.nextInt();

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        System.out.print("Enter 1 for one-way or 2 for round-trip ticket: ");
        int type = in.nextInt();

        if( km > 0 && age > 0){
            basePrice = km * pricePerKm;
            if(age < 12){
                ageDiscount = basePrice * 0.5;
            }else if(age >= 12 && age <= 24){
                ageDiscount = basePrice * 0.1;
            }else if(age > 65){
                ageDiscount = basePrice * 0.3;
            }

            double priceAfterDiscount = basePrice - ageDiscount;

            if(type == 1 || type == 2){
                if(type == 2){
                    roundTripDiscount = priceAfterDiscount * 0.2;
                }else{
                    roundTripDiscount = 0;
                }
            }else{
                System.out.println("You entered wrong type of ticket");
            }

             totalPrice = (priceAfterDiscount - roundTripDiscount) * type; // if type 2-> 2 way ticket
            System.out.println("Total price: "+ totalPrice);
        }else{
            System.out.println("Distance and your age must be bigger than 0");
        }

    }
}
