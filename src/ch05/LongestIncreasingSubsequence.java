package ch05;

public class LongestIncreasingSubsequence {

    static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;


        for (i = 0; i < n; i++)
            lis[i] = 1;


        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;


        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];

        return max;
    }

    public static void main(String args[])
    {
        int arr[] = { 25, 42, 81, 23, 51, 70, 91, 10 };
        int n = arr.length;
        System.out.println("panjangnya adalah " + lis(arr, n) + "\n");
    }
}
