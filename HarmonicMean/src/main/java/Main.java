public class Main {
    public static void main(String[] args) {
        double harmonicMean = 0;
        double harmonicSeries = 0;
        double[] arr = { 1, 2, 3, 4, 5, 6};
        for (double i : arr) {
                harmonicSeries += (1 / i);
                harmonicMean = arr.length / harmonicSeries;
        }
        System.out.println("Harmonic mean: " + harmonicMean);
    }
}
