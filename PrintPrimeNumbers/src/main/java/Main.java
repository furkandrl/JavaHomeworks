

public class Main {
    public static void main(String[] args) {
        boolean isPrime = true; //to catch a prime number

        for (int i = 2; i <= 100; i++) {
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
                isPrime = true;
        }
    }
}
