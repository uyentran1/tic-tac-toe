import java.util.Scanner;

public class TicTacToe {
    final static int ROWS = 3;
    final static int COLS = 3;
    static char[][] board = createEmptyBoard(ROWS, COLS);

    public static void main(String[] args) {
        printBoard(board);
        
        // Play game
        char player = 'X';
        boolean gameOver = false;
        Scanner s = new Scanner(System.in);

        while (!gameOver) {          
            System.out.print("Player " + player + " enter: ");
            int i = s.nextInt();
            int j = s.nextInt();
            System.out.println();

            if (board[i][j] == ' ') {
                board[i][j] = player; // place the element
                gameOver = haveWon(board, player);
                if (gameOver)
                    System.out.println("Player " + player + " has won!");
                else 
                    player = (player == 'X') ? 'O' : 'X';
            } 
            else
                System.out.println("Invalid move. Try again!");
                
            printBoard(board);
        }      
    }

    public static char[][] createEmptyBoard(int r, int c) {
        char[][] board = new char[r][c];

        for (char[] row : board) {
            for (int i = 0; i < row.length; i++)
                row[i] = ' ';
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

    public static boolean haveWon(char[][] board, char player) {
        // Check rows
        for (char[] row : board) {
            if (row[0] == player && row[1] == player && row[2] == player)
                return true;
        }

        // Check columns
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
              return true;
        }

        // Check diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;

        return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }
}