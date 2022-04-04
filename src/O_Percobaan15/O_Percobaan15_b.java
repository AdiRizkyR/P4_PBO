package O_Percobaan15;

import O_Percobaan15.O_Percobaan15_a;

public class O_Percobaan15_b {
    public static void main(String[] args) {
        O_Percobaan15_a badu = new O_Percobaan15_a();
        badu.nama = "Badu";
        badu.umur = 12;
        System.out.println("Nama : " + badu.nama);
        System.out.println("Umur : " + badu.umur + " tahun");
        badu.tertawa();

        System.out.println();

        O_Percobaan15_a dodo = new O_Percobaan15_a("Dodo", 10);
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + " tahun");
        dodo.menangis();

        System.out.println();

        O_Percobaan15_a jono = new O_Percobaan15_a("Jono", 12, 168, 76);
        System.out.println("Nama : " + jono.nama);
        System.out.println("Umur : " + jono.umur + " tahun");
        System.out.println("Tinggi Badan : " + jono.tinggiBadan + " cm");
        System.out.println("Berat Badan : " + jono.beratBadan + " kg");
        jono.tertawa();
    }
}
