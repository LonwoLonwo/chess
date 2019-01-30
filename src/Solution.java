import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) {

        int SIZE = 8;

        String[][] matrix = new String[SIZE][SIZE];

        for(int i = 0; i < SIZE; i++)
        {
            for(char c = 'a', counter = 0; counter < SIZE; c++, counter++)
            {
                matrix[i][counter] = (i + 1) + "" + c;
            }
        }

        for(int i = 0; i < matrix.length; i++)
        {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}
