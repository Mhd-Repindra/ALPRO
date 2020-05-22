package ch04;


public class L {
    public static void main (String[] args){
        int [] nilai ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Menampilkan semua nilai array : ");

        for (int i=0;i<nilai.length;i++){
            System.out.print(nilai[i]+" ");
        }
        System.out.println();

        int jumlah = nilai[0]+nilai[1];
        for (int i=0;i<nilai.length;i++){

            if(nilai[i]%2==0){
                jumlah = nilai[i]+nilai[i+1];

                if(jumlah%2==0){
                    System.out.println(nilai[i]+" + "+nilai[i+1]+" = "+jumlah);
                }
            }
        }
    }
}

