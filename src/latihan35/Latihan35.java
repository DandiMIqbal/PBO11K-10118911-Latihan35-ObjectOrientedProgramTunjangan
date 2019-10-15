/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan35;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class Latihan35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Tunjangan ps = new Tunjangan();
        System.out.println("======= Program Tunjangan =======");
        System.out.print("Berapa gaji pokok anda perbulan ?\t: Rp. ");
        ps.gaji = scanner.nextDouble();
        System.out.print("Status Anda ? (Menikah/Belum)\t: ");
        ps.status = scanner.next();
        ps.hitungGaji();
        System.out.println("\n====== Hasil Perhitungan Gaji Anda ======");
        System.out.println("Gaji Pokok\t\t: Rp "+ps.gaji);
        System.out.println("Tunjangan\t\t: Rp "+ps.tunjangan);
        System.out.println("Total Gaji\t\t: Rp "+ps.total_gaji);
        System.out.println("\n(Developed by : Dandi Muhammad Iqbal)");
    }
    
}
