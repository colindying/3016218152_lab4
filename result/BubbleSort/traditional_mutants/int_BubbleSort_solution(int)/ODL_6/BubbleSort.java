// This is a mutant program.
// Author : ysma

import java.util.Arrays;


public class BubbleSort
{

    public static  int[] BubbleSort_solution( int[] arr )
    {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static  void main( java.lang.String[] args )
    {
        int[] arr = new int[]{ 1, 6, 2, 2, 5 };
        BubbleSort.BubbleSort_solution( arr );
        System.out.println( Arrays.toString( arr ) );
    }

}
