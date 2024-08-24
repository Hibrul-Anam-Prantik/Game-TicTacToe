import java.util.Scanner;

public class Play_TicTacToe_v20 {
    public static void main(String[] args) 
    {
        System.out.println("***** WELCOME!!!!! *****");
        System.out.println("        __|_|__ \n        __|_|__ \n          | |  ");
        System.out.println();
        System.out.println("\"Only two players can play at a time\"");
        System.out.println();
        TicTacToe_v41 ttt = new TicTacToe_v41();
        ttt.mode();
        System.out.println("Set Names-");
        Scanner sc = new Scanner(System.in);
        System.out.print("Name(Player-1): ");
        String p1 = sc.nextLine();
        System.out.print("Name(Player-2): ");
        String p2 = sc.nextLine();
        ttt.setPlayer(p1, p2);
        System.out.println();
        System.out.println("Use the numbers shown below, to acess each slot-\n   |11|12|13|\n   |21|22|23|\n   |31|32|33|");
        System.out.println();
        ArrayMaker am = new ArrayMaker();
        String[][] arr = am.gameMatrix();
        arr = ttt.game(arr);
        sc.close();
    }
}
