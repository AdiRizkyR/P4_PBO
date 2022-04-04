package F_Percobaan06;

import F_Percobaan06.F_Percobaan06_a;

public class F_Percobaan06_b {
    public static void main(String[] args) {
        F_Percobaan06_a avanza = new F_Percobaan06_a("Inova", "BM3210");
        avanza.jmlRoda = 4;
        avanza.bahanBakar = "Solar";
        avanza.fullAC = true;
        System.out.println(avanza.getInfo());
    }
}
