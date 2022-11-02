import java.util.Scanner;

public class Grades {
    public static void main(String[] args){

    int mat, fiz, kim, tur, trh, muz;
    double sumOfGrades;

    Scanner s = new Scanner(System.in);

    System.out.print("Matematik notu: ");
    mat = s.nextInt();

    System.out.print("Fizik notu: ");
    fiz = s.nextInt();

    System.out.print("Kimya notu: ");
    kim = s.nextInt();

    System.out.print("Türkçe notu: ");
    tur = s.nextInt();

    System.out.print("Tarih notu: ");
    trh = s.nextInt();

    System.out.print("Müzik notu: ");
    muz = s.nextInt();

    sumOfGrades = mat+fiz+kim+tur+trh+muz;

    if((sumOfGrades/6)>60)
        System.out.println("Sınıfı Geçti");
    else
        System.out.println("Sınıfta Kaldı");

}
}
