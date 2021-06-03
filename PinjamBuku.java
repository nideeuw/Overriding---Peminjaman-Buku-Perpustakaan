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
public class PinjamBuku extends Data{
    PinjamBuku(){
    }
    
    void nama(){
        System.out.println(" PEMINJAMAN BUKU PERPUSTAKAAN SMK TELKOM MALANG");
        System.out.println(" ");
    }
    void buku(){
        System.out.println("- The Lost Hero karya Rick Riordan");
    }
    void waktu(){
        System.out.println("    Tanggal meminjam        : 03-06-2021");
        System.out.println("    Tanggal mengembalikan   : 09-06-2021");
    }
}
