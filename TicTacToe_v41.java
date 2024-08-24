import java.util.Scanner;

public class TicTacToe_v41 
{
    public String player1 = "O";
    public String player2 = "X";
    public String nameP1;
    public String nameP2;
    String[][] arr;
    boolean over;
    int term;
    int numRound;
    ArrayPrinter ap = new ArrayPrinter();
    Scanner sc = new Scanner (System.in);
    public int winTour1 = 0;
    public int winTour2 = 0;
    boolean tournament = false;
    public void setPlayer(String p1, String p2) 
    {
        nameP1 = p1;
        nameP2 = p2;
    }

    public String[][] game(String[][] arr) 
    {
        System.out.println("LET'S ROCK!\n");
        System.out.println("  |_|_|_|\n  |_|_|_|\n  | | | |");
        System.out.println();
        this.arr = arr;
        ArrayMaker am = new ArrayMaker();
        int i = 0;
        while (i < numRound) 
        {
            over = false;
            String[][] arr1 = am.gameMatrix();
            this.arr = arr1;
            // System.out.println();
            if (numRound > 1) {
                System.out.println("<<<< ROUND-" +(i + 1) + " >>>>");
            }
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
        if (tournament) {
            tournamentResult(arr);
        } else {
            System.out.println("\nPlay Again?\n   1. Yes\n   2. No.");
            System.out.print(" => ");
            int x = sc.nextInt();
            System.out.println();
            if (x == 1) {
                mode();
                // System.out.println("LET'S ROCK AGAIN!");
                this.arr = game(arr);
            } else {
                System.out.println(">>>> HAPPY GAMING <<<<");
                System.out.println("          :)");
            }
        }
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
                || (arr[0][2] == player1 && arr[1][1] == player1 && arr[2][0] == player1)) 
        {
            over = true;
            if (numRound > 1) {
                System.out.println("       >>>>>> " + nameP1 + " WON \n");
                winTour1 ++;
            } else {
                System.out.println("<<<<< " + nameP1 + " WON >>>>>");
            }
        } else if ((arr[0][0] == player2 && arr[0][1] == player2 && arr[0][2] == player2)
                || (arr[1][0] == player2 && arr[1][1] == player2 && arr[1][2] == player2)
                || (arr[2][0] == player2 && arr[2][1] == player2 && arr[2][2] == player2)
                || (arr[0][0] == player2 && arr[1][0] == player2 && arr[2][0] == player2)
                || (arr[0][1] == player2 && arr[1][1] == player2 && arr[2][1] == player2)
                || (arr[0][2] == player2 && arr[1][2] == player2 && arr[2][2] == player2)
                || (arr[0][0] == player2 && arr[1][1] == player2 && arr[2][2] == player2)
                || (arr[0][2] == player2 && arr[1][1] == player2 && arr[2][0] == player2)) 
        {
            over = true;
            if (numRound > 1) {
                System.out.println("       >>>>>> " + nameP2 + " WON\n");
                winTour2 ++;
            } else {
                System.out.println("<<<<< " + nameP2 + " WON >>>>>");
            }
        } else if (term == 9 && !over) {
            if (numRound > 1) {
                System.out.println("\n       >>>>>> NOBODY WON\n");
            } else {
                System.out.println("\n* NOBODY WON *");
            }
        }
    }

    public void mode () 
    {
        System.out.print("Game Mode?\n   1. Quick Game\n   2. Tournament\n   [Enter 1 or 2]\n => ");
        int optMode = sc.nextInt();
        System.out.println();
        if (optMode == 2) {
            System.out.print("Number of Games:\n   1. 3 Games \n   2. 5 Games \n   3. Customize \n => ");
            int optRound = sc.nextInt();
            System.out.println();
            if (optRound == 1) {
                numRound = 3;
            } else if(optRound == 2) {
                numRound = 5;
            } else if (optRound == 3) {
                System.out.print("Round => ");
                numRound = sc.nextInt();
                System.out.println();
            } else {
                System.out.println("* Please enter a valid option! *");
                System.out.println();
                mode();
            }
            tournament = true;
        } else if (optMode == 1) {
            numRound = 1;
        } else {
            System.out.println("* Please select a valid option! *");
            System.out.println();
            mode();
        }
    }

    public String[][] tournamentResult(String[][] arr) 
    {
        if (winTour1 > winTour2) {
            System.out.println("***** CONGRATULATIONS *****\n >>>>> \"" + nameP1 + "\" WON THE TOURNAMENT <<<<< ");
            System.out.println("\nPlay Again?\n   1. Yes\n   2. No.");
            System.out.print(" => ");
            int x = sc.nextInt();
            System.out.println();
            if (x == 1) {
                mode();
                this.arr = game(arr);
            } else {
                System.out.println(">>>> HAPPY GAMING <<<<");
                System.out.println("          :)");
            }
        } else if (winTour2 > winTour1) {
            System.out.println("***** CONGRATULATIONS *****\n >>>>> \"" + nameP2 + "\" WON THE TOURNAMENT <<<<< ");
            System.out.println("\nPlay Again?\n   1. Yes\n   2. No.");
            System.out.print(" => ");
            int x = sc.nextInt();
            System.out.println();
            if (x == 1) {
                mode();
                this.arr = game(arr);
            } else {
                System.out.println(">>>> HAPPY GAMING <<<<");
                System.out.println("          :)");
            }
        } else {
            System.out.println("***** DRAW *****\n >>>>> Both \"" + nameP1 + "\" & \"" + nameP2 + "\" WON THE TOURNAMENT <<<<< ");
            System.out.println("\nPlay Again?\n   1. Yes\n   2. No.");
            System.out.print(" => ");
            int x = sc.nextInt();
            System.out.println();
            if (x == 1) {
                mode();
                this.arr = game(arr);
            } else {
                System.out.println(">>>> HAPPY GAMING <<<<");
                System.out.println("          :)");
            }
        }
        return this.arr;
    }
}
