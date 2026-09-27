/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo_tugas5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yusuf
 */
class Produk {
    String nama;
    double harga;
    
    public Produk (String nama, double harga) {
        this.nama= nama;
        this.harga= harga;
    }
    
    public double hitungDiskon() {
        return 0;
    }
    
    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }
}

class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.10; 
    }
}

class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.15; 
    }
}

class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.20; 
    }
}

class KeranjangBelanja {
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        listProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (Produk p : listProduk) {
            total += p.getHargaSetelahDiskon(); 
        }
        return total;
    }

    public void tampilkanKeranjang() {
        System.out.println("Detail Keranjang Belanja");
        for (Produk p : listProduk) {
            System.out.println("Nama Produk : " + p.nama);
            System.out.println("Harga Awal  : Rp" + p.harga);
            System.out.println("Diskon      : Rp" + p.hitungDiskon());
            System.out.println("Harga Akhir : Rp" + p.getHargaSetelahDiskon());
            System.out.println("");
        }
        System.out.println("Total Pembayaran: Rp" + hitungTotalHarga());
    }
}

public class Pbo_tugas5 {

    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Buku Pemrograman Java", 100000);
        Produk elektronik = new Elektronik("Radio", 500000);
        Produk pakaian = new Pakaian("Kemeja Putih", 200000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        keranjang.tampilkanKeranjang();
    }
}
