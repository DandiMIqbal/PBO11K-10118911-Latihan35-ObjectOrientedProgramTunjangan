/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan35;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class Tunjangan {
    
    public String status;
    public double total_gaji, gaji, tunjangan = 0;
    
    public boolean cekTunjangan(){
        return status.toLowerCase().equals("menikah");
    }
    
    public double hitungTunjangan(){
        return gaji*35/100;
    }
    
    public double hitungGaji(){
        if (cekTunjangan()) {
            tunjangan = hitungTunjangan();
        }
        total_gaji = gaji + tunjangan;
        return total_gaji;
    }
    
}
