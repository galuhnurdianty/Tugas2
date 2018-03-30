package tugas2;
public class Minuman2 {
    double harga;
    double jumlah;

    public Minuman2() {
        harga=15000;
        jumlah=20;
    }

    public Minuman2(double harga, double jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    void cetakInfo(){
    System.out.println("==================================");        
    System.out.println("Harga Minuman           :"+harga);
    System.out.println("Jumlah Minuman Terjual  :"+jumlah);
    }
    
    double hitungPendapatan(){
         double pendapatan;
         pendapatan=harga*jumlah;
         return pendapatan;
     }
    void cetakpendapatan(){
         System.out.println("Pendapatannya adalah :"+hitungPendapatan());
     }
}
