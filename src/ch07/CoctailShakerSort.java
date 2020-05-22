package ch07;


public class CoctailShakerSort {
    void CooctailShort (int a[]){

        boolean swapped = true;
        int start = 0;
        int end = a.length;

        while (swapped == true){
            swapped = false;

            for (int i = start; i < end - 1; i++){
                if (a[i] > a[i + 1]){
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
            swapped = false;
            end = end - 1;

            for (int i = end - 1; i >= start; i--){
                if (a[i] > a[i +1]){
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            start = start + 1;
        }
    }

    void printArray(int a[]){
        int n = a.length;
        for (int i = 0; i < n; i++)
            System.out.println(a[i] +" ");
        System.out.println();
    }

    public static void main(String[] args) {
        CoctailShakerSort ob = new CoctailShakerSort();
        int a[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        ob.CooctailShort(a);
        System.out.println("Sorted Array");
        ob.printArray(a);
    }
}
