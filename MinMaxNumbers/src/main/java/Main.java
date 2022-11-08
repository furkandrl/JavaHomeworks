import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("How many numbers are you going to enter?: ");
        int num = in.nextInt();

        //to initialize first min and max
        int min = Integer.MAX_VALUE; //any number will be smaller than this value
        int max = Integer.MIN_VALUE; //any number will be greater than this value

        for(int i = 1; i <= num; i++){
            System.out.println("Enter number "+ i);
            int temp = in.nextInt();
            if(temp < min){
                min = temp;
            }else if(temp > max){
                max = temp;
            }
        }

        System.out.println("Smallest number is: "+min);
        System.out.println("Biggest number is: "+max);
    }
}
