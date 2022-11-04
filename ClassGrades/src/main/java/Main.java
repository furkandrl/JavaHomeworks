import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, muz;
        double sumOfGrades;

        Scanner s = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        mat = s.nextInt();
        if(mat < 0 || mat > 100){
            mat=0;
        }

        System.out.print("Fizik notu: ");
        fiz = s.nextInt();
        if(fiz < 0 || fiz > 100){
            fiz=0;
        }

        System.out.print("Kimya notu: ");
        kim = s.nextInt();
        if(kim < 0 || kim > 100){
            mat=0;
        }

        System.out.print("Türkçe notu: ");
        tur = s.nextInt();
        if(tur < 0 || tur > 100){
            tur=0;
        }

        System.out.print("Müzik notu: ");
        muz = s.nextInt();
        if(muz < 0 || muz > 100){
            muz=0;
        }

        double avg = (mat + fiz + kim + tur + muz) / 5;

        if (avg > 55) {
            System.out.println("Sınıfı Geçti");
            System.out.println("ortalamanız: " + avg);
        } else
            System.out.println("Sınıfta Kaldı");
    }


    }

