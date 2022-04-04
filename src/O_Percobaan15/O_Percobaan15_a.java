package O_Percobaan15;

public class O_Percobaan15_a {

    String nama;
    int umur;
    String warnaRambut;
    String warnaKulit;
    int tinggiBadan;
    int beratBadan;

    public O_Percobaan15_a(){
    }

    public O_Percobaan15_a(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public O_Percobaan15_a(String nama,int umur, int tinggiBadan, int beratBadan){
        this (nama, umur);
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    public void menangis(){
        System.out.println("hu....hu....");
    }

    public void tertawa(){
        System.out.println("ha...ha...");
    }
}
