package tugas2;
public class MinumanAksi2 {
    public static void main(String[] args) {
        Minuman2 n1 = new Minuman2();
        System.out.println("    _______________________");
        System.out.println("    |MENGHITUNG PENDAPATAN|");
        n1.harga = 17000;
        n1.jumlah = 10;
        
        n1.cetakInfo();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Hasil Pendapatan     ="+n1.hitungPendapatan());
        n1.cetakpendapatan();
    }
}
