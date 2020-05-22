package ch04;

public class J {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Menampilkan semua nilai array : ");

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();

        int selisih = array[0]-array[1];
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if((array[i]%2==0)&&(array[j]%2==0)){
                    selisih = array[i]-array[j];

                    System.out.println("Selisih "+array[i]+" dengan "+array[j]+" : "+selisih);

                }
            }
        }
    }
}
