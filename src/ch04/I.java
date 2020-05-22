package ch04;


public class I {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlah=0;

        System.out.print("Menampilkan semua nilai array : ");

        int i,j;
        for ( i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();

        int selisih = array[0]-array[1];
        for ( i=0;i<array.length;i++){
            if(i==array.length-1){
            }else{
                selisih = array[i]-array[i+1];

                System.out.println("Selisih "+array[i]+" dengan "+array[i+1]+" : "+selisih);

            }
        }

    }
}
