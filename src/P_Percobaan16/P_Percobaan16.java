package P_Percobaan16;

import _konsepoop.Orang;

public class P_Percobaan16 {

    public static void main(String[] args) {
        Orang daru = new Orang("Daru Nugroho", 20);
        cetakOrang(daru);
    }

    private static void cetakOrang(Orang orang){
        System.out.println("Nama = " + orang.nama);
        System.out.println("Umur = " + orang.umur + " tahun");
    }
}
