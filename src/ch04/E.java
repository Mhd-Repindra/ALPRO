package ch04;

public class E {
    public static void main (String[] args){
        int [] nilai ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int angka_sama = 12;

        System.out.println("Menampilkan SEMUA nilai array : ");

        for (int i=0;i<nilai.length;i++){
            System.out.print(nilai[i]+" ");
        }
        System.out.println("\n");
        System.out.print("Hanya yang memiliki angka 2 di array = ");

        for (int i=0;i<nilai.length;i++){
            if (nilai.equals(angka_sama)){
                System.out.print(nilai[i]+" ");
            }
        }
    }
}

