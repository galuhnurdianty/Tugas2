package tugas2;
public class Minuman2 {
    double harga;
    double jumlah;
    
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
}
