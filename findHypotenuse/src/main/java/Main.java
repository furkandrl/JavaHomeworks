import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner  sc = new Scanner(System.in);

        System.out.print("Enter the first edge: ");
        a = sc.nextInt();
        System.out.print("Enter the second edge: ");
        b = sc.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hypotenuse of the triangle is: "+c);

        //Bonus: Area of the triangle

        System.out.println();
        //perimeter of triangle = 2u

        double u = (a+b+c)/2;

        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Are of the triangle: "+area);
    }
}
