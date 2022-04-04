package F_Percobaan06;

public class F_Percobaan06_a {
    private String nama;
    private String noBM;
    int jmlRoda;
    protected String bahanBakar;
    public boolean fullAC;

    public F_Percobaan06_a(String nama, String noBM){
        this.nama = nama;
        this.noBM = noBM;
        this.jmlRoda = 4;
        this.bahanBakar = "Bensin";
        this.fullAC = true;
    }

    protected String getInfo(){
        String info = "Mobil : " + nama +
                "\nNomor BM : " + noBM +
                "\nJumlah Roda : " + jmlRoda +
                "\nJenis Bahan Bakar : " + bahanBakar +
                "\nFull AC : " + fullAC;
        return info;
    }
}
