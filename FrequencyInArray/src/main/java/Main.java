import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi: "+ Arrays.toString(arr));
        int[] freq = new int[arr.length];
        int visited = -1; //aynı elemanı bir daha saymamak için

        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = visited;
                }
            }
            if(freq[i] != visited){
                freq[i] = count;
            }
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] != visited){
                System.out.println(arr[i]+" sayısı "+freq[i]+" kez tekrar etti.");
            }
        }

    }
}
