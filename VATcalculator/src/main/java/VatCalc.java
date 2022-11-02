import java.util.Scanner;

public class VatCalc {
    public static void main(String[] args) {
        double amount, vatRatio;
        double vatAmount, priceWithVat;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount: ");

        amount = sc.nextInt();


        if(amount>0 && amount<1000){
            vatRatio = 0.18;
            vatAmount = vatRatio * amount;
            priceWithVat = amount + vatAmount;
            System.out.println("VAT amount: "+vatAmount);
            System.out.println("Price with VAT: "+priceWithVat);
        }else if(amount>1000){
            vatRatio = 0.08;
            vatAmount = vatRatio * amount;
            priceWithVat = amount + vatAmount;
            System.out.println("VAT amount: "+vatAmount);
            System.out.println("Price with VAT: "+priceWithVat);
        }
    }
}
