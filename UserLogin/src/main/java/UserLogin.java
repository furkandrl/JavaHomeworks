import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String username, password;
        //Initial username=patika, password=java123;

        Scanner in = new Scanner(System.in);

        String select;

        System.out.print("Username: ");
        username = in.nextLine();
        System.out.print("Password: ");
        password = in.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("You logged in successfully.");
        }else{
            System.out.println("Your username or password is wrong.");
            System.out.println("Do you want to enter a new password? (press Y or N):");
            select = in.nextLine();
            if(select.equals("y") || select.equals("Y")){
                boolean isSame = true;//is the password entered same with the initial one
                while(isSame) {//if the password is same, ask again
                    System.out.print("Enter your new password: ");
                    String temp = in.nextLine();
                    if (!temp.equals("java123")) {
                        password = temp;
                        System.out.println("Password changed.");
                        isSame = false;
                    }else if(temp.equals("java123"))
                    System.out.println("Failed. Enter another password: ");
                }
            }else if(select.equals("n") || select.equals("N")){
                System.out.println("Quitting...");
            }
        }
    }
}
