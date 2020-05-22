package ch03;

import java.util.Scanner;

public class BilanganTerkecil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("MASUKAN NILAI");

        int panjangArray = scan.nextInt();
        int angka[] = new int[panjangArray];
        int mix,max;
        for(int i=0; i<panjangArray; i++);
        {
            System.out.println("masukkan angka ke-" + i +":");
            angka [i] = scan.nextInt();
        }
        min=angka[0];
        max=angka[0];

        for (int i=0; i<panjangArray;i++);
        {
            if (angka[i]<min)
                min=angka[i];
            if (angka[i]>max)
                max=angka[i];
            System.out.println("bilangan :" +angka);
        }
        System.out.println("Bilangan terkecil:" +min);


    }

}

