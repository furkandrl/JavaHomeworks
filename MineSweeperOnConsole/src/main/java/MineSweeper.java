import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNum, colNum, size;
    int [][] map;//stores the mines
    int [][] board;//player plays on
    boolean game = true;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int rowNum, int colNum){
        this.rowNum=rowNum;
        this.colNum=colNum;
        this.map= new int[rowNum][colNum];
        this.board=new int[rowNum][colNum];
        this.size= rowNum * colNum;
    }
    public void run(){
        int success=0;
        prepareGame();
        //print(map); if you want to see the mines before playing the game
        System.out.println("Game Started!");
        while(game){
            print(board);
            System.out.print("Enter a row number: ");
            int row = (scan.nextInt()-1);
            System.out.print("Enter a column number: ");
            int col = (scan.nextInt()-1);
            if(map[row][col] != -1){
                checkMine(row, col);
                success++;
                if(success ==(size- (size/4))){
                    System.out.println("You successfully cleared all mines!");
                    break;
                }
            }else{
                game = false;
                System.out.println("Game Over");
            }

        }
    }

    public void checkMine(int r, int c){//checks the adjacent cells of entered cell, if there is any mine
        if(board[r][c] == 0) {
            if ((c < colNum-1) && map[r][c + 1] == -1) { //to right
                board[r][c]++;
            }
            if ((r > 1) && map[r - 1][c] == -1) { //to up
                board[r][c]++;
            }
            if ((r<rowNum-1) && map[r + 1][c] == -1) { //to down
                board[r][c]++;
            }
            if ((c>1) && map[r][c - 1] == -1) {//to left
                board[r][c]++;
            }
            if ((r>1) && (c< colNum-1) && map[r - 1][c + 1] == -1) { //to up right
                board[r][c]++;
            }
            if ((r< rowNum-1) && (c< colNum-1) && map[r + 1][c + 1] == -1) { //to down right
                board[r][c]++;
            }
            if ((r>1) && (c>1) && map[r - 1][c -1] == -1) { //to up left
                board[r][c]++;
            }
            if ((c>1) && (r< rowNum-1)&& map[r + 1][c - 1] == -1) { //to down left
                board[r][c]++;
            }
            if(board[r][c] ==0){//if there is no mine in adjacent, -2 is printed on the selected cell
                board[r][c]=-2;
            }
        }
    }

    public void prepareGame(){
        int randRow, randCol, count=0;
        while(count != (size/4)){
            randRow = rand.nextInt(rowNum);
            randCol = rand.nextInt(colNum);
            if(map[randRow][randCol] !=-1){
                map[randRow][randCol] =-1;
                count++;
            }
        }
    }

    public void print(int [][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] >=0)
                    System.out.print(" ");
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
