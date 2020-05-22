package ch02;

ublic class Pegawai {
    String nik;
    String nama;
    String jabatan;
    boolean isAktif;

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public boolean isAktif() {
        return isAktif;
    }

    public void cetak() {
        System.out.println("NIK : " + nik);
        System.out.println("NAMA : " + nama);
        System.out.println("JABATAN : " + isAktif);
    }
}
