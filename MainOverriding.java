/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author MOKLET-2
 */
public class MainOverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Data identitas = new Data();
        PinjamBuku buku = new PinjamBuku();
        Data identitas1 = new PinjamBuku();
        
        identitas1.nama();
        buku.Data();
        identitas.noAnggota();
        identitas.nama();
        identitas.nis();
        identitas.alamat();
        System.out.println(" ");
        identitas.buku();
        identitas.waktu();
        identitas1.buku();
        identitas1.waktu();
        
    }
    
}
