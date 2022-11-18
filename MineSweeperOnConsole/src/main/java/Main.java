import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row, col;
        System.out.println("Welcome");
        System.out.println("Enter the size");
        System.out.println("Rows: ");
        row = scan.nextInt();
        System.out.println("Columns: ");
        col = scan.nextInt();

        MineSweeper mine = new MineSweeper(row, col);
        mine.run();
    }
}
