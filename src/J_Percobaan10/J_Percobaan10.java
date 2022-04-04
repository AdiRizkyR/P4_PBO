package J_Percobaan10;

public class J_Percobaan10 {

    private static int bilA, bilB;

    public static void main(String[] args) {
        bilA = 3;
        bilB = 5;
        int hasilTambah = tambah();
        System.out.println("Hasil Tambah = " + hasilTambah);
    }

    private static int tambah(){
        return (bilA + bilB);
    }
}
