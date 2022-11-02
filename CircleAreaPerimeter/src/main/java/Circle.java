import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius value: ");
        int r = input.nextInt();

        double area = pi * r * r;
        double perimeter = 2 * pi * r;

        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
    }
}
