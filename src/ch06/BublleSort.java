package ch06;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int temp;
        for(int i=0; i<a.length; i++){

            for(int j=0; j<a.length-1; j++){

                if (a[j] > a[j+1]){

                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        for(int i=0; i<a.length; i++){

            System.out.println(a[i]+" ");
        }
    }
}

