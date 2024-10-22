import java.util.Scanner;

public class TicTacToe {
    final static int ROWS = 3;
    final static int COLS = 3;

    public static void main(String[] args) {
        char[][] board = createEmptyBoard(ROWS, COLS);
        
        printBoard(board);

        playGame();

        // displayResult();        
    }

    public static char[][] createEmptyBoard(int r, int c) {
        char[][] board = new char[r][c];

        for (char[] row : board) {
            for (char cell : row)
                cell = ' ';
        }

        return board;
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            System.out.print("| ");
            for (char cell : row)
                System.out.print(cell + " | ");
            System.out.println();
          }
    }

    public static void playGame() {
        char player = 'X';
        boolean gameOver = false;
        Scanner s = new Scanner(System.in);
    }
}