package TicTacToe;

import java.util.Scanner;

public class Play_TicTacToe_v1_3 {
    public static void main(String[] args) 
    {   
        System.out.println("*****WELCOME!!!!!*****");
        System.out.println();
        TicTacToe_v3_2_1 ttt = new TicTacToe_v3_2_1();
        System.out.println("ONLY TWO PLAYERS CAN PLAY AT A TIME.");
        System.out.println();
        System.out.println("Set Names-");
        Scanner sc = new Scanner(System.in);
        System.out.print("Name(Player-1): ");
        String p1 = sc.nextLine();
        System.out.print("Name(Player-1): ");
        String p2 = sc.nextLine();
        ttt.setPlayer(p1,p2);
        System.out.println();
        System.out.println("Use the method shown below to access each slot-\n   |11|12|13|\n   |21|22|23|\n   |31|32|33|");
        System.out.println();
        System.out.println("LET'S ROCK!\n");
        ArrayMaker am = new ArrayMaker();
        String[][] arr = am.gameMatrix();
        arr = ttt.game(arr);
        sc.close();
    }
}