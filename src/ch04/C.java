package ch04;

public class C {
    public static void main (String[] args){
        int [] nilai ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan nilai array : ");

        for (int i=0;i<nilai.length;i++){
            System.out.print(nilai[i]+" ");
        }
        System.out.println("\n");
        System.out.print("Menampilkan angka ganjil = ");

        for (int i=0;i<nilai.length;i++){
            if (nilai[i]%2!=0){
                System.out.print(nilai[i]+" ");
            }
        }
    }
}

