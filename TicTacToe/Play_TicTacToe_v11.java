package TicTacToe;

import java.util.Scanner;

public class Play_TicTacToe_v11 {
    public static void main(String[] args) 
    {
        System.out.println("*****WELCOME!!!!!*****");
        System.out.println("");
        TicTacToe_v3 ttt = new TicTacToe_v3();
        System.out.println("ONLY TWO PLAYERS CAN PLAY AT A TIME.");
        System.out.println("");
        System.out.println("Let's Begin!\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Name(Player-1): ");
        String p1 = sc.nextLine();
        System.out.print("Name(Player-1): ");
        String p2 = sc.nextLine();
        ttt.setPlayer(p1,p2);
        System.out.println("");
        ArrayMaker am = new ArrayMaker();
        String[][] arr = am.gameMatrix();
        arr = ttt.game(arr);
        sc.close();
    }
}
