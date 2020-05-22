package ch06;

public class SelectionSort {
    public static void main(String[] args) {

        int[] a={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int min, temp=0;
        for(int i=0; i<a.length; i++) {

            min = i;
            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < a[min]) {

                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for(int i=0; i<a.length; i++){

            System.out.println(a[i]+" ");
        }
    }
}
