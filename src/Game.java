/**
 * @author Reuben
 * A game of Tic Tac Toe for two players
 */
import java.util.*;

public class Game {

    public static void main(String[] args) {
        while (true) {

            char[][] board = {
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},

            };
            int turn = 1;
            boolean gameOver = false;

            Scanner in = new Scanner(System.in);

            boolean hasMove = false;
            while (!hasMove && !gameOver) {
                System.out.print("Player " + ((turn % 2 == 0) ? ("2") : ("1")) + (", enter desired space coordinates."));
                int row = in.nextInt();
                int column = in.nextInt();

                if (Util.checkEmpty(board, row, column)) {
                    Util.modBoard(board, row, column, turn);
                    Util.drawBoard(board);
                    if (Util.checkWin(board)) {
                        System.out.println("Congratulations player " + ((turn % 2 == 0) ? ("2") : ("1")) + (", you win!"));
                        gameOver = true;
                    }
                    if (Util.checkDraw(board)) {
                        System.out.println("Draw!");
                        gameOver = true;
                    }
                    hasMove = false;
                    turn++;
                } else {
                    System.out.println("Space already taken! Try again!");
                }
            }
            System.out.println("Play again? y/n");
            if(in.next().equals("n")){
                return;
            }
        }

    }

}
