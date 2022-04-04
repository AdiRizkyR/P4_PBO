package C_Percobaan03;

import C_Percobaan03.C_Percobaan03_a;

public class C_Percobaan03_b {
    public static void main(String[] args) {
        C_Percobaan03_a dido = new C_Percobaan03_a();
        dido.nama = "Dido";
        dido.umur = 4;
        System.out.println("Nama : " + dido.nama);
        System.out.println("Umur : " + dido.umur + " tahun");
        dido.menangis();

        System.out.println();

        C_Percobaan03_a dodo = new C_Percobaan03_a("Dodo");
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + " tahun");
        dodo.tertawa();
    }
}
