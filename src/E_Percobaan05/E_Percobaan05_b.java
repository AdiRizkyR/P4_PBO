package E_Percobaan05;

import E_Percobaan05.E_Percobaan05_a;

public class E_Percobaan05_b {
    public static void main(String[] args) {
        E_Percobaan05_a even = new E_Percobaan05_a("Yuk ngaji", 200);
        even.tglKegiatan = 10;
        even.blnKegiatan = 11;
        even.thnKegiatan = 2018;
        even.infoEvent();
        System.out.println("============================");
        System.out.println("Tanggal Kegiatan : " + even.tglKegiatan + "/" + even.blnKegiatan + "/" + even.thnKegiatan);
        even.jmlPeserta = 100;
        System.out.println("Jumlah Peserta : " + even.jmlPeserta);
    }
}
