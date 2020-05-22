package ch04;


public class B {
    public static void main (String[] args){
        int [] data ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int dicari = 26 ;

        System.out.println ("posisi " + dicari + " dalam larik data : " + cari ( data, data.length, dicari));
    }

    public static int cari (int [] data, int n, int k) {
        int posisi = 0,i ;
        boolean ketemu ;

        if (n<=0)
            posisi = -1;
        else {
            ketemu = false ;
            i = 1 ;
            while ( (i <n-1) && ! ketemu )
                if (data [i] == k ) {
                    posisi = i ;
                    ketemu = true;
                }
                else
                    i++;
            if (!ketemu)
                posisi = -1;
        }
        return posisi ;
    }
}