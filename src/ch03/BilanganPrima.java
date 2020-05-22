package ch03;


import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan angka");

        int angka = input.nextInt();
        int temp;
        boolean prima = true;

        for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
            temp angka % pembagi;
            if(temp == 0){
                prima = false;
                break;
            }
        }
        if(prima && ((angka > 0)&&(angka !=1)))
            System.out.println(angka + "adalah bilangan prima");
        else
            System.out.println(angka + "bukanlah bilangan prima");
    }
}

