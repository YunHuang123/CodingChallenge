
public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                         {1, 2, 3},
                         {1, 2, 3}};

    }

    public int[][] newArray(int[][] arr)
    {
        int [][] array = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr[0].length; i ++)
        {
            for (int j = 0; j < arr.length; j ++)
            {
                array[j][i] = arr[i][j];
            }
        }
        return array;
    }

    public boolean columnDuplicate(int[][] arr)
    {
        for (int x = 0; x < arr.length; x ++)
        {
            for (int i = 0; i < arr[0].length; i ++)
            {
                for (int j = 0; j < arr[0].length; j ++)
                {
                    if (arr[0])
                }
            }
        }
    }
}
