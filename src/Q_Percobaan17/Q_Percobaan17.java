package Q_Percobaan17;

import _konsepoop.Orang;

public class Q_Percobaan17 {

    public static void main(String[] args) {
        Orang dosen = getOrang("Depandi Enda", 29);
        cetakOrang(dosen);
    }

    private static void cetakOrang(Orang orang){
        System.out.println("Nama = " + orang.nama);
        System.out.println("Umur = " + orang.umur + " tahun");
    }

    private static Orang getOrang(String nama, int umur){
        Orang orang = new Orang(nama, umur);
        return orang;
    }

}
