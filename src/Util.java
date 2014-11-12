/**
 * @author Reuben
 * A collection of utility methods for a Tic-Tac-Toe program
 */
public class Util {

    static int numRows = 3;
    static int numColumns = 3;

    public static char[][] modBoard(char[][] board, int row, int column, int turn){
        board[row][column] = (turn%2 == 0)?('O'):('X');
        return board;
    }

    public static boolean checkEmpty(char[][] board, int row, int column){
        return (board[row][column] == ' ');
    }

    public static boolean checkWin(char[][] board) {
        for(int row = 0; row < numRows; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != ' '){
                return true;
            }
        }
        for(int column = 0; column < numColumns; column++) {
            if (board[0][column] == board[1][column] && board[1][column] == board[2][column]  && board[0][column] != ' ') {
                return true;
            }
        }
        return (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') || (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[1][1] != ' ');
    }

    public static void drawBoard(char[][] board){
        for(int row = 0; row < numRows; row++){
            for(int column = 0; column < numColumns; column++){
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkDraw(char[][] board){
        for(int row = 0; row < numRows; row++){
            for(int column = 0; column < numColumns; column++){
                if(board[row][column] == ' '){
                    return false;
                }
            }
        }
    return true;
    }
}
