package ch04;

public class K {
    public static void main (String[] args){
        int [] nilai ={83, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Menampilkan semua nilai array : ");

        for (int i=0;i<nilai.length;i++){
            System.out.print(nilai[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("angka setelahya bernilai besar :");

        int max = nilai[0];
        for (int i=0;i<nilai.length;i++){
            for (int j=1;j<nilai.length-1;j++){
                if(nilai[j]>nilai[i]){
                    max = nilai[j];

                    System.out.print(nilai[i] +"<"+max+" ; ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}