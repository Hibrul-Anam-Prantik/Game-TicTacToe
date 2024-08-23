import java.util.Scanner;

public class ArrayMaker {
    public int[] arr1D;
    public int len;
    public int[][] arr2D;
    public int len1, len2;
    public String[][] game;
    public void makeArr1D() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of the Array: ");
        len = sc.nextInt();
        arr1D = new int[len];
        for(int i = 0; i <len; i++)
        {
            System.out.print("  Element-" + (i+1) + ": "); 
            arr1D[i] = sc.nextInt();
        }
        System.out.println("Successfully built a 1-D Array!!");
        sc.close();
    }

    public void makeArr2D() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row of the Array: ");
        len1 = sc.nextInt();
        System.out.print("Column of the Array: ");
        len2 = sc.nextInt();
        arr2D = new int[len1][len2];
        for(int i = 0; i < len1; i++)
        {
            System.out.println("Elements of Row-" + (i+1) + ": "); 
            for(int j = 0; j < len2; j++)
            {
                System.out.print("  Element-" + (j+1) + ": ");
                arr2D[i][j] = sc.nextInt();
            }
        }
        System.out.println("Successfully built a 2-D Array!!");
        sc.close();
    }
    String[][] gameMatrix() 
    {
        game = new String[3][3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                game[i][j] = " ";
            }
        }
        return game;
    }
}
