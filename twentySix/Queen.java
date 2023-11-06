package twentySix;

public class Queen {
    public static void Pattern(char board[][], int row) {
        //Base case
        if (row == board.length) {
            printBoard(board);;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            Pattern(board, row + 1);
            board[row][j] = 'X';
        }

    }

    public static void printBoard(char board[][]) {
        System.out.println("----- chase Board -----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        int n = 2;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
      Pattern(board, 0);
    }


}
