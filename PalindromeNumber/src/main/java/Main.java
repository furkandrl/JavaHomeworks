import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    var in = new Scanner(System.in);

        System.out.print("Enter a number to check if it is palindrome: ");
        int check = in.nextInt();

        if(isPalindrome(check)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is NOT palindrome");
        }
    }

    static boolean isPalindrome(int num){
        int temp = num;
        int reversedNumber = 0;
        int lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber;
            temp /= 10;
        }
        return reversedNumber == num;
    }
}
