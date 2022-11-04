import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1, n2; //operands
        String select; //operator

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        n1 = in.nextInt();
        System.out.print("Enter the second number: ");
        n2 = in.nextInt();
        System.out.print("Enter the operator(/,*,+,-): ");// +, -, * or /
        select = in.next();

        switch (select){
            case "+":
                System.out.println("Result: "+ (n1+n2));
                break;
            case "-":
                System.out.println("Result: "+ (n1-n2));
                break;
            case "*":
                System.out.println("Result: "+ (n1*n2));
                break;
            case "/":
                if(n2>0)
                    System.out.println("Result: "+ (n1/n2));
                else
                    System.out.println("You can't divide a number by zero");
                break;
            default:
                System.out.println("Wrong input, please try again");// if input is not an operator
        }
    }
}
