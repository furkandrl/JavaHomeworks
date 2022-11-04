import java.util.Scanner;

public class EventSuggestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Temperature (in Celsius): ");
        int temperature = in.nextInt();

        if(temperature <5){
            System.out.println("Suggestion: Skiing");
        }else if(temperature >=5 && temperature <15){
            System.out.println("Suggestion: Cinema");
        }else if(temperature >=15 && temperature <=25){
            System.out.println("Suggestion: Picnic");
        }else if(temperature > 25){
            System.out.println("Suggestion: Swimming");
        }
    }
}
