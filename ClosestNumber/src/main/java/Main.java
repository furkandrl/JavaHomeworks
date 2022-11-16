import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int greatestSmaller = Integer.MIN_VALUE;
        int smallestGreater = Integer.MAX_VALUE;

        int[] arr ={56, 34, 1, 8, 101, -2, -33, 15, 12, 788, -1, -778, 2, 0};

        System.out.print("The array= "+ Arrays.toString(arr));
        System.out.println();
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        for(int i : arr){
            if(i < n){
                if(i > greatestSmaller){
                    greatestSmaller =i;
                }
            }else if(i > n){
                if(i < smallestGreater){
                    smallestGreater = i;
                }
            }
        }

        System.out.println("The greatest number smaller than the number you entered:"+greatestSmaller);
        System.out.println("The smallest number greater than the number you entered:"+smallestGreater);
    }

}
