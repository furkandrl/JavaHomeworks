import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");
        int n = in.nextInt();//dizinin boyutu
        int position=1;//eklenecek elamanın sırası
        int [] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++){
            System.out.print( position +". Elemanı : ");
            position+=1;
            numbers[i]=in.nextInt();
        }
        System.out.println("Girdiğiniz dizi: "+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sıralanmış dizi: "+Arrays.toString(numbers));
    }
}
