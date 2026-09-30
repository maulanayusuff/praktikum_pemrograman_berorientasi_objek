/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package responsiPBO;

/**
 *
 * @author yusuf
 */

class Produk {
    private String namaProduk;
    private double harga;
    
    public Produk(String namaProduk, double harga) {
        this.namaProduk= namaProduk;
        this.harga= harga;
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk= namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        this.harga= harga;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Produk: "+namaProduk);
        System.out.printf("Harga: %.0f\n",harga);
    }
}

class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai= namaPegawai;
        this.gaji= gaji;
    }
    
    public String getNamaPegawai() {
        return namaPegawai;
    }
    
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai= namaPegawai;
    }
    
    public double getGaji() {
        return gaji;
    }
    
    public void setGaji(double gaji) {
        this.gaji= gaji;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: "+namaPegawai);
        System.out.printf("Gaji: %.0f\n",gaji);
    }
}

class Elektronik extends Produk {
    private int garansi;
    
    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga);
        this.garansi= garansi;
    }
    
    public int getGaransi() {
        return garansi;
    }
    
    public void setGaransi(int garansi) {
        this.garansi= garansi;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: "+garansi+" tahun");
    }
}

class Makanan extends Produk {
    private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa= tanggalKadaluarsa;
    }
    
    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    
    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa= tanggalKadaluarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: "+tanggalKadaluarsa);
    }
}

class PegawaiTetap extends Pegawai{
    private double tunjangan;
    
    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan= tunjangan;
    }
    
    public double getTunjangan() {
        return tunjangan;
    }
    
    public void setTunjangan(double tunjangan) {
        this.tunjangan= tunjangan;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.printf("Tunjangan: %.0f\n",tunjangan);
    }
}

class PegawaiKontrak extends Pegawai{
    private int lamaKontrak;
    
    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak= lamaKontrak;
    }
    
    public int getLamaKontrak() {
        return lamaKontrak;
    }
    
    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak= lamaKontrak;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: "+lamaKontrak+" bulan");
    }
}

public class Responsi_pbo {

    public static void main(String[] args) {
        Produk p1= new Elektronik("Handphone", 4000000, 5);
        Produk p2= new Makanan("roti", 20000, "10-10-2026");
        
        Pegawai peg1= new PegawaiTetap("Yusuf", 20000000, 5000000);
        Pegawai peg2= new PegawaiKontrak("Maul", 10000000, 6);
                
        System.out.println("Output Produk");
        p1.tampilkanInfo();
        System.out.println();
        
        System.out.println("Output Pegawai");
        peg1.tampilkanInfo();
        System.out.println();
        
        System.out.println("Output Polimorfisme");
        p2.tampilkanInfo();
        System.out.println();
        peg2.tampilkanInfo();
    }
}
              