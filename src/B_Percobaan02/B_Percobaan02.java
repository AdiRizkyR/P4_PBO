package B_Percobaan02;

public class B_Percobaan02 {
    String nama;
    int umur;
    String warnaRambut;
    String warnaKulit;
    int tinggiBadan;
    int beratBadan;

    public B_Percobaan02(){
    }

    public B_Percobaan02(String nama){
        this.nama = nama;
    }

    public void menangis(){
        System.out.println("hu.....hu.....");
    }

    public void tertawa(){
        System.out.println("ha.....ha.....");
    }

    public static void main(String[] args) {
        B_Percobaan02 dido = new B_Percobaan02();
        dido.nama = "Dido";
        dido.umur = 4;
        System.out.println("Nama : " + dido.nama);
        System.out.println("Umur : " + dido.umur + " tahun");
        dido.menangis();

        System.out.println();

        B_Percobaan02 dodo = new B_Percobaan02("Dodo");
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + " tahun");
        dodo.tertawa();
    }
}
