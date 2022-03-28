public class A_Percobaan01 {
    //class global
    public int nrp;
    public String nama;
    public void info (){
        System.out.println("Ini siswa RPL Polbeng");
    }

    //eksekusi
    public static void main(String[] args) {
        A_Percobaan01 it = new A_Percobaan01();
        it.nrp = 5;
        it.nama = "Andi";
        it.info();
    }
}
