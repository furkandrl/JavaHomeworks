import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int triesLeft = 3; // you may try 3 time to log in
        int balance = 1000;

        while(triesLeft > 0){
            System.out.print("Enter your username: ");
            String username = in.nextLine();
            System.out.print("Enter your password: ");
            String pass = in.nextLine();

        if(username.equals("dereli") && pass.equals("patika")){
            System.out.println("Welcome to the bank.");
            System.out.println("1-Deposit money\n" +
                    "2-Withdraw money\n" +
                    "3-Check balance\n" +
                    "4-Quit");
            System.out.print("Please enter the action(in number) : ");
            int selection = in.nextInt();
            if(selection != 4) {
                switch (selection) {
                    case 1:
                        System.out.print("Enter the amount: ");
                        int amount = in.nextInt();
                        balance += amount;
                        break;
                    case 2:
                        System.out.print("Enter the amount: ");
                        amount = in.nextInt();
                        if (amount > balance) {
                            System.out.println("Insufficient funds.");
                        } else {
                            balance -= amount;
                        }
                        break;
                    case 3:
                        System.out.print("Balance: " + balance);
                        break;
                    default:
                        System.out.println("You entered wrong key.");
                }
            }else if(selection == 4)
                System.out.print("Have a nice day.");
                break;
        }
        else {
            triesLeft--;
            System.out.println("Wrong credentials, try again.");
            if (triesLeft == 0) {
                System.out.println("Your account has been blocked. Contact with the bank");
            }

        }
        }
    }
}
