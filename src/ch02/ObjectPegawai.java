package ch02;

public class ObjectPegawai {
    public static void main(String[] args) {
        ObjectPegawai pgw1 = new ObjectPegawai ();
        ObjectPegawai pgw2 = new ObjectPegawai();

        pgw1.nik = "123";
        pgw1.nama = "Budi";
        pgw1.jabatan = "Staff";
        pgw1.isAktif = true;

        pgw2.nik = "124";
        pgw2.nama = "Cici";
        pgw2.jabatan = "Administrasi";
        pgw2.isAktif = true;

        pgw1.cetak();
        System.out.println("=========");
        pgw2.cetak();
    }
}

