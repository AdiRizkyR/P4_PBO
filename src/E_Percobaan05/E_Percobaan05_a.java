package E_Percobaan05;

public class E_Percobaan05_a {

    int tglKegiatan;
    int blnKegiatan;
    int thnKegiatan;
    protected int maxPeserta;
    protected int jmlPeserta;
    public String namaEvent;
    final int biayaPendaftaran = 5000;
    String tempatEvent;


    public E_Percobaan05_a(String nama, int m){
        namaEvent = nama;
        maxPeserta = m;
    }

    void infoEvent(){
        System.out.println("Nama event : " + namaEvent);
        System.out.println("Maksimal Peserta : " + maxPeserta);
        System.out.println("Biaya Pendaftaran : " + biayaPendaftaran);
    }
}
