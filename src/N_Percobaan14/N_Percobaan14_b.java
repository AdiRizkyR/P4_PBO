package N_Percobaan14;

import N_Percobaan14.N_Percobaan14_a;

public class N_Percobaan14_b {
    public static void main(String[] args) {
        N_Percobaan14_a badu = new N_Percobaan14_a();
        badu.nama = "Badu";
        badu.umur = 12;
        System.out.println("Nama : " + badu.nama);
        System.out.println("Umur : " + badu.umur + " tahun");
        badu.tertawa();

        System.out.println();

        N_Percobaan14_a dodo = new N_Percobaan14_a("Dodo", 10);
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + " tahun");
        dodo.menangis();
    }
}
