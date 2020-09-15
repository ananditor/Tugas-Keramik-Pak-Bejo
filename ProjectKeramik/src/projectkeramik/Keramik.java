/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkeramik;

/**
 *
 * @author ananditoK3519013
 */
public class Keramik {
    /* membuat atribut */
    int luas = 1000000;
    int ukuran;
    int isi;
    int harga;
    
    /* membuat methods */
    void hitungKeramik(){
        int satuan;
        satuan = this.luas / this.ukuran;
        System.out.println("Dibutuhkan " + satuan + " keramik ");
    }
    void hitungBox(){
        int box;
        box = (this.luas / this.ukuran)/this.isi;
        System.out.println("Sejumlah " + box + " box");
    }
    void hitungHarga(){
        int total;
        total = ((this.luas / this.ukuran)/this.isi) * this.harga;
        System.out.println("Jadi, total harganya adalah Rp." + total);
    }
}
