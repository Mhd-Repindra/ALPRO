package ch06;

public class InsertionSort {
    public static void main(String[] args) {

        int[] a={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int temp, j;
        for(int i=1; i<a.length; i++){

            temp=a[i];
            j=i;
            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        for(int i=0; i<a.length; i++){

            System.out.println(a[i]+" ");
        }
    }
}
