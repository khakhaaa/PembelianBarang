package Project;
import java.util.Scanner;

public class PembelianBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String barang;
        String buku;
        String pensil;
        int harga = 0;
        int jumlah = 0;
        int total=0;
        
        System.out.print("Masukkan jumlah item yang dibeli: ");
        int jumlahItem = input.nextInt();
        
        for(int i=1; i <= jumlahItem; i++){
            System.out.print("nama barang: ");
            barang = input.next();
            
            System.out.print("harga: ");
            harga = input.nextInt();
            
            System.out.print("jumlah:");
            jumlah = input.nextInt();
            System.out.println("=======================");
            
            total += jumlah*harga;
        }
        System.out.println("Jumlah item yang dibeli: "+jumlahItem);
        System.out.println("Total pembelian: "+total);
    }
}
