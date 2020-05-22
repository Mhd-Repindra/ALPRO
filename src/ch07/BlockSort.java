package ch07;

public class BlockSort {
    public static void main(String[] args) {
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Nilai Array Sebelum Diurutkan = ");
        for (int x:bil){
            System.out.print(x+" ");
        }
        System.out.println();
        new BlockSort(bil);

        System.out.print("Nilai Array Setelah Diurutkan = ");
        for(int x:bil){
            System.out.print(x+" ");
        }
    }
    BlockSort(int[] bil) {
        int w = bil.length;

        for (int y = 1;y<w;y++) {
            int key = bil [y];
            int x=y-1;

            while ((x>-1)&&(bil[x]>key)){
                bil[x+1] = bil[x];
                x--;
            }
            bil[x+1]=key;
        }
    }
}

