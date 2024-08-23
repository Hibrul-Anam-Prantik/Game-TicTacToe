import java.util.Scanner;

public class TheGAME 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("***** WELCOME!!!!! *****");
        System.out.println("        __|_|__ \n        __|_|__ \n          | |  ");
        System.out.println();
        System.out.println("ONLY TWO PLAYERS CAN PLAY AT A TIME.");
        System.out.println();
        TicTacToe_v40 ttt = new TicTacToe_v40();
        ttt.mode();
        System.out.println();
        System.out.println("Set Names-");
        System.out.print("Name(Player-1): ");
        String p1 = sc.nextLine();
        System.out.print("Name(Player-2): ");
        String p2 = sc.nextLine();
        ttt.setPlayer(p1, p2);
        System.out.println();
        System.out.println("Use the numbers shown below, to acess each slot-\n   |11|12|13|\n   |21|22|23|\n   |31|32|33|");
        System.out.println();
        System.out.println("LET'S ROCK!\n");
        System.out.println("  |_|_|_|\n  |_|_|_|\n  | | | |");
        ArrayMaker am = new ArrayMaker();
        String[][] arr = am.gameMatrix();
        arr = ttt.game(arr);
        sc.close();
    }
}

class TicTacToe_v40 
{
   public String player1 = "O";
    public String player2 = "X";
    public String nameP1;
    public String nameP2;
    String[][] arr;
    boolean over = false;
    int term;
    int numRound;
    ArrayPrinter ap = new ArrayPrinter();
    public void setPlayer(String p1, String p2) 
    {
        nameP1 = p1;
        nameP2 = p2;
    }
    public String[][] game(String[][] arr) 
    {
        this.arr = arr;
        ArrayMaker am = new ArrayMaker();
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i < numRound) 
        {
            over = false;
            String[][] arr1 = am.gameMatrix();
            this.arr = arr1;
            System.out.println();
            System.out.println("<<<< ROUND-" +(i + 1) + " >>>>");
            term = 1;
            while (term <= 9) 
            {
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
            i ++;
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
            System.out.println("\nDRAW :)");
        }
    }

    public void mode () 
    {
        System.out.print("Game Mode?\n   1. QUICK GAME\n   2. TOURNAMENT\n   [Enter 1 or 2]\n => ");
        Scanner sc = new Scanner(System.in);
        int optMode = sc.nextInt();
        System.out.println();
        if (optMode == 2) {
            System.out.print("Number of games(ie-3, 5 or Customize):\n   1. 3 Rounds, \n   2. 5 Rounds, \n   3. Customize \n => ");
            int optRound = sc.nextInt();
            System.out.println();
            if (optRound == 1) {
                numRound = 3;
            } else if(optRound == 2) {
                numRound = 5;
            } else if (optRound == 3) {
                System.out.print("Round => ");
                numRound = sc.nextInt();
            } else {
                System.out.println("PLEASE ENTER A VALID OPTION.");
                mode();
            }
        } else if (optMode == 1) {
            numRound = 1;
        } else {
            System.out.println("PLEASE SELECT A VALID OPTION.");
            mode();
        }
        // sc.close();
    }
}

