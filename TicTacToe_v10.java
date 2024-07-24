

import java.util.Scanner;

public class TicTacToe_v10 
{
    public int player1 = 0;
    public int player2 = 1;
    int[][] arr = new int[3][3];
    // int p1 = 0, p2 = 0;
    public int[][] game() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\"0\" for Player-1 & \"1\" for Player-2");
        for(int i = 0; i < arr[0].length; i++) 
        {
            System.out.println("Row-" + (i+1));
            for(int j = 0; j < arr.length; j++)
            {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] % 2 == 0) {
                    System.out.println("      -Player-1");
                } else {
                    System.out.println("      -Player-2");
                }
            }
        }
        sc.close();
        check();
        return arr;
    }
    public void check()
    {
        if ((arr[0][0] == player1 && arr[0][1] == player1 && arr[0][2] == player1) || (arr[1][0] == player1 && arr[1][1] == player1 && arr[1][2] == player1) || (arr[2][0] == player1 && arr[2][1] == player1 && arr[2][2] == player1) || (arr[0][0] == player1 && arr[1][0] == player1 && arr[2][0] == player1) || (arr[0][1] == player1 && arr[1][1] == player1 && arr[2][1] == player1) || (arr[0][2] == player1 && arr[1][2] == player1 && arr[2][2] == player1) || (arr[0][0] == player1 && arr[1][1] == player1 && arr[2][2] == player1)) {
            System.out.println("*****Congratulations*****\n    *****Player1*****");
        } else if ((arr[0][0] == player2 && arr[0][1] == player2 && arr[0][2] == player2) || (arr[1][0] == player2 && arr[1][1] == player2 && arr[1][2] == player2) || (arr[2][0] == player2 && arr[2][1] == player2 && arr[2][2] == player2) || (arr[0][0] == player2 && arr[1][0] == player2 && arr[2][0] == player2) || (arr[0][1] == player2 && arr[1][1] == player2 && arr[2][1] == player2) || (arr[0][2] == player2 && arr[1][2] == player2 && arr[2][2] == player2) || (arr[0][0] == player2 && arr[1][1] == player2 && arr[2][2] == player2)) {
            System.out.println("*****Congratulations*****\n    *****Player2*****");
        } else {
            System.out.println("Better Luck Next Time!\n:(");
        }
    }
}
