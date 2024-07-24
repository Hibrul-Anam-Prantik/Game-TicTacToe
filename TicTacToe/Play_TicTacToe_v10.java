package TicTacToe;

import java.util.Scanner;

public class Play_TicTacToe_v10 {
    public static void main(String[] args) 
    {
        System.out.println("*****WELCOME!!!!!*****");
        System.out.println("");
        // TicTacToe_v10 ttt = new TicTacToe();
        // TicTacToe_v11 ttt = new TicTacToe();
        // TicTacToe_v20 ttt = new TicTacToe_2();
        // TicTacToe_v21 ttt = new TicTacToe_2_1();
        TicTacToe_v30 ttt = new TicTacToe_v30();
        System.out.println("ONLY TWO PLAYERS CAN PLAY AT A TIME.");
        // System.out.println("");
        System.out.println("Let's begin.\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Name(Player-1): ");
        String p1 = sc.nextLine();
        System.out.print("Name(Player-1): ");
        String p2 = sc.nextLine();
        ttt.setPlayer(p1,p2);
        System.out.println("");
        ArrayMaker am = new ArrayMaker();
        String[][] arr = am.gameMatrix();
        ArrayPrinter ap = new ArrayPrinter();
        arr = ttt.game(arr);
        ap.printGame(arr);
        sc.close();
    }
}
