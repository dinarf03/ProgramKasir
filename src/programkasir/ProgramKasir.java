/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programkasir;

/**
 *
 * @author Dinar F V M
 */
import java.util.Scanner;
public class ProgramKasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        program kasir = new program();
        kasir.pertama();
    }
    
}
class program{
    public void pertama() {
        
        int jumlah, harga, total, diskon1, diskon2, kembali, anggota, total1;
        String nama;
        int diskon = 10;
        Scanner masuk = new Scanner(System.in);
        
        do{
            System.out.println("\n Selamat Datang");
            System.out.print("Masukan Nama : ");
            nama = masuk.next();
            System.out.print("Jumlah Barang : ");
            jumlah = masuk.nextInt();
            System.out.print("Harga barang : Rp. ");
            harga = masuk.nextInt();
            System.out.print("Punya kartu anggota? (Y=1, N=2)" );
            anggota = masuk.nextInt();
            total = jumlah * harga;
            
            if(total > 1000000) {
                diskon1 = total / diskon;
                if (anggota == 1) {
                    diskon2 = total / diskon;
                    total1 = total - diskon1 - diskon2;
                System.out.println("Total : Rp. " + total1);
            }else
                total1 = total - diskon1;
            System.out.println("Total : Rp. " + total);
        }else
                System.out.println("Total : Rp. " + total);
                System.out.print(nama +", Ingin Melakukan Transaksi Lagi? (Y=1, N=2)");
                kembali = masuk.nextInt();
     
        }while (kembali == 1);
        System.out.print("\n Terima Kasih");
        }
        
    }

