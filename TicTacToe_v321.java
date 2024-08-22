import java.util.Scanner;

public class TicTacToe_v321 
{
    public String player1 = "O";
    public String player2 = "X";
    public String nameP1;
    public String nameP2;
    String[][] arr;
    boolean over = false;
    int term;
    ArrayPrinter ap = new ArrayPrinter();
    public void setPlayer(String p1, String p2) 
    {
        nameP1 = p1;
        nameP2 = p2;
    }
    public String[][] game(String[][] arr) 
    {
        this.arr = arr;
        Scanner sc = new Scanner(System.in);
        term = 1;
        while (term <= 9) 
        {
            // int row = sc.nextInt() - 1;
            // int col = sc.nextInt() - 1;
            int num = sc.nextInt();
            int row = (num / 10) - 1;
            int col = (num % 10) - 1;
            if (term % 2 == 0) {
                System.out.println("         - " + nameP2);
                this.arr[row][col] = player2;
                ap.printGame(this.arr);
                System.out.println();
            } else {
                System.out.println("         - " + nameP1);
                this.arr[row][col] = player1;
                ap.printGame(this.arr);
                System.out.println();
            }
            if (term >= 4) {
                check(this.arr);
            }
            if (over) {
                break;
            }
            term++;
        }

        sc.close();
        return this.arr;
    }

    public void check(String[][] arr) 
    {
        if ((arr[0][0] == player1 && arr[0][1] == player1 && arr[0][2] == player1)
                || (arr[1][0] == player1 && arr[1][1] == player1 && arr[1][2] == player1)
                || (arr[2][0] == player1 && arr[2][1] == player1 && arr[2][2] == player1)
                || (arr[0][0] == player1 && arr[1][0] == player1 && arr[2][0] == player1)
                || (arr[0][1] == player1 && arr[1][1] == player1 && arr[2][1] == player1)
                || (arr[0][2] == player1 && arr[1][2] == player1 && arr[2][2] == player1)
                || (arr[0][0] == player1 && arr[1][1] == player1 && arr[2][2] == player1)
                || (arr[0][2] == player1 && arr[1][1] == player1 && arr[2][0] == player1)) {
            System.out.println("***** CONGRATULATIONS *****\n    ***** " + nameP1 + " *****");
            over = true;
        } else if ((arr[0][0] == player2 && arr[0][1] == player2 && arr[0][2] == player2)
                || (arr[1][0] == player2 && arr[1][1] == player2 && arr[1][2] == player2)
                || (arr[2][0] == player2 && arr[2][1] == player2 && arr[2][2] == player2)
                || (arr[0][0] == player2 && arr[1][0] == player2 && arr[2][0] == player2)
                || (arr[0][1] == player2 && arr[1][1] == player2 && arr[2][1] == player2)
                || (arr[0][2] == player2 && arr[1][2] == player2 && arr[2][2] == player2)
                || (arr[0][0] == player2 && arr[1][1] == player2 && arr[2][2] == player2)
                || (arr[0][2] == player2 && arr[1][1] == player2 && arr[2][0] == player2)) {
            System.out.println("***** CONGRATULATIONS *****\n    ***** " + nameP2 + " *****");
            over = true;
        } else if (term == 9 && !over) {
            System.out.println("\nBETTER LUCK NEXT TIME!\n:(");
        }
    }
}