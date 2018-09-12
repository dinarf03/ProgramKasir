/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramKasir2;

/**
 *
 * @author Dinar F V M
 */
import java.util.Scanner;
public class ProgramKasir2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner (System.in); {
        String nama,kodeBuku;
        int jumlahBeli;
        double harga,totalBayar=0,diskon=0,bonus;
        
        System.out.println("========================");
        System.out.println ("Selamat Datang");
        System.out.println("========================");
        System.out.print("Nama Pembeli: ");
        nama=s.nextLine();
        
        System.out.print("kode Buku : ");
        kodeBuku=s.nextLine();
        
        System.out.print("harga : ");
        harga=s.nextDouble();
        
        System.out.print("jumlah Beli : ");
        jumlahBeli=s.nextInt();
        
        totalBayar=harga*jumlahBeli;
        
        if (jumlahBeli>5){
            System.out.print("Bonus : Sampul Buku");
        }
        if(totalBayar>100000){
            diskon=0.1*totalBayar;
        }
        if (totalBayar>200000) {
            diskon=0.2*totalBayar;
        }
        if (totalBayar>500000) {
            diskon=0.5*totalBayar;
        }
        totalBayar=totalBayar-diskon;
        
        System.out.println("========================");
        System.out.println("Diskon : RP "+diskon);
        System.out.println("Total Bayar : RP "+totalBayar);
        System.out.println("========================");
        
        System.out.println("Terima Kasih");
    }
    }
}
