public class Main {
    public static void main(String[] args) {
        int M[][] = { { 2, 3, 4 }, { 5, 6, 7 }};

        // find number of rows and columns in matrix M
        int n = M.length, m = M[0].length;

        // create empty transpose matrix of size m*n
        int transpose[][] = new int[m][n];

        // traverse matrix M
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //assign M_transpose[j][i] as M[i][j]
                transpose[j][i] = M[i][j];
            }
        }

        // output the transpose matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
