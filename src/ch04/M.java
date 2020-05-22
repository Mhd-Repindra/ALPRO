package ch04;

public class M {
    public static void main (String[] args){
        int [] nilai ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlah=0;

        System.out.print("Menampilkan semua nilai array : ");

        int i,j;
        for ( i=0;i<nilai.length;i++){
            System.out.print(nilai[i]+" ");
        }

        System.out.println();

        int selisih = nilai[0]-nilai[1];
        for ( i=0;i<nilai.length;i++){

            if(i==nilai.length-1){
            }else{
                selisih = nilai[i]-nilai[i+1];

                System.out.println("Selisih "+nilai[i]+" dengan " + nilai[i+1]+" = "+selisih);
                jumlah=jumlah+selisih;
            }
        }

        System.out.println("Jumlah angka selisih  : "+jumlah);
    }
}

