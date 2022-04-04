package _konsepoop;

public class Orang {

    public String nama;
    public int umur;
    String warnaRambut;
    String warnaKulit;
    int tinggiBadan;
    int beratBadan;

    public Orang(){
    }

    public Orang(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public Orang(String nama,int umur, int tinggiBadan, int beratBadan){
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
