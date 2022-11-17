public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 8, 2, 9, 8, 22, 1, 22, 9, 1};
        int[] duplicated = new int[arr.length];
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    if (!isFound(duplicated, arr[i])) {
                        duplicated[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicated) {
            if ((value != 0) && (value % 2 == 0)) {
                System.out.println(value);
            }
        }
    }
        static boolean isFound(int[] arr, int value) {
            for (int i : arr) {
                if (i == value) {
                    return true;
                }
            }
            return false;
        }
    }

