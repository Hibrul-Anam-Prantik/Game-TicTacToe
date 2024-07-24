package TicTacToe;

public class ArrayPrinter {
    public int[] arr1D;
    public int len1;
    public int len2, len3;
    public int arr2D[][];
    public String[][] arr2Ds;
    // public void print1D(int len)
    public void print1D(int[] arr)
    {
        arr1D = arr;
        len1 = arr1D.length;
        // len1 = len;
        // arr1D = new int[len1];
        System.out.println("1-D Array:");
        for ( int i = 0; i < len1; i++)
        {
            System.out.print("  " + arr1D[i]);
        }
        System.out.println();
    }

    public void print2D(int[][] arr) 
    {
        arr2D = arr;
        len2 = arr2D.length;
        len3 = arr2D[0].length;
        System.out.println(" 2-D Array:");
        for ( int i = 0; i < len2; i++)
        {
            for(int j = 0; j < len3; j++)
            {
                if(arr2D[i][j] > 9){
                    System.out.print("  " + arr2D[i][j]);
                } else {
                    System.out.print("   " + arr2D[i][j]);
                }
            }
            System.out.println();
        }
    }

    public void printGame(String[][] arr) 
    {
        arr2Ds = arr;
        len2 = arr2Ds.length;
        len3 = arr2Ds[0].length;
        System.out.println("GOOD GAME");
        for ( int i = 0; i < len2; i++)
        {
            for(int j = 0; j < len3; j++)
            {
                if (j == 0) {
                    System.out.print("  |");
                }
                System.out.print(arr2Ds[i][j] + "|");
            }
            System.out.println();
        }
    }
}
