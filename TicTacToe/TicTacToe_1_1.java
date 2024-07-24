package TicTacToe;

import java.util.Scanner;

public class TicTacToe_1_1 
{
    public int player1 = 1;
    public int player2 = 2;
    int[][] arr = new int[3][3];
    boolean over = false;
    int term;
    public int[][] game() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the \"Row\" & \"Column\" number following the matrix rules:");
        term = 1;
        while (term <= 9) 
        {
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;
            if (term % 2 == 0) {
                System.out.println("         - Player-2");
                arr[row][col] = 2;
            } else {
                System.out.println("         - Player-1");
                arr[row][col] = 1;
            }
            if (term >= 4) {
                check();
            }
            if (over) {
                break;
            }
            term++;
        }

        sc.close();
        return arr;
    }

    public void check() 
    {
        if ((arr[0][0] == player1 && arr[0][1] == player1 && arr[0][2] == player1)
                || (arr[1][0] == player1 && arr[1][1] == player1 && arr[1][2] == player1)
                || (arr[2][0] == player1 && arr[2][1] == player1 && arr[2][2] == player1)
                || (arr[0][0] == player1 && arr[1][0] == player1 && arr[2][0] == player1)
                || (arr[0][1] == player1 && arr[1][1] == player1 && arr[2][1] == player1)
                || (arr[0][2] == player1 && arr[1][2] == player1 && arr[2][2] == player1)
                || (arr[0][0] == player1 && arr[1][1] == player1 && arr[2][2] == player1)) {
            System.out.println("*****Congratulations*****\n    *****Player1*****");
            over = true;
        } else if ((arr[0][0] == player2 && arr[0][1] == player2 && arr[0][2] == player2)
                || (arr[1][0] == player2 && arr[1][1] == player2 && arr[1][2] == player2)
                || (arr[2][0] == player2 && arr[2][1] == player2 && arr[2][2] == player2)
                || (arr[0][0] == player2 && arr[1][0] == player2 && arr[2][0] == player2)
                || (arr[0][1] == player2 && arr[1][1] == player2 && arr[2][1] == player2)
                || (arr[0][2] == player2 && arr[1][2] == player2 && arr[2][2] == player2)
                || (arr[0][0] == player2 && arr[1][1] == player2 && arr[2][2] == player2)) {
            System.out.println("*****Congratulations*****\n    *****Player2*****");
            over = true;
        } else if (term == 9 && !over) {
            System.out.println("Better Luck Next Time!\n:(");
        }
    }
}
