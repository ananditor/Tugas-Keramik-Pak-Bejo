/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkeramik;

/**
 *
 * @author anand
 */
public class ProjectKeramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi -> proses meembuat objek */
        Keramik k1 = new Keramik();
        k1.ukuran = 900;
        k1.isi = 10;
        k1.harga = 54000;
        k1.hitungKeramik();
        k1.hitungBox();
        k1.hitungHarga();
        
        Keramik k2 = new Keramik();
        k2.ukuran = 1600;
        k2.isi = 5;
        k2.harga = 65000;
        k2.hitungKeramik();
        k2.hitungBox();
        k2.hitungHarga();
        
        Keramik k3 = new Keramik();
        k3.ukuran = 1200;
        k3.isi = 8;
        k3.harga = 60000;
        k3.hitungKeramik();
        k3.hitungBox();
        k3.hitungHarga();
    }
    
}
