/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author yusuf
 */
class kendaraan {
    private String nama;
    private int kecepatan_maks;
    private String jenis_mesin;
    
    public kendaraan (String nama, int kecepatan_maks, String jenis_mesin) {
        this.nama= nama;
        this.kecepatan_maks= kecepatan_maks;
        this.jenis_mesin= jenis_mesin;
    }
    
    public String getNama () {
        return nama;
    }
    public void setNama (String nama) {
        this.nama= nama;
    }
    public int getKecepatanMaks() {
        return kecepatan_maks;
    }
    public void tampilkaninfokendaraan() {
        System.out.println("nama kendaraan: "+nama);
        System.out.println("kecepatan maksimal: "+kecepatan_maks+"km/h");
        System.out.println("jenis mesin: "+jenis_mesin);
    }
}

class mobil extends kendaraan {
    private int jumlah_pintu;
    
    public mobil(String nama, int kecepatan_maks, String jenis_mesin, int jumlah_pintu) {
        super(nama, kecepatan_maks, jenis_mesin);
        this.jumlah_pintu= jumlah_pintu;
    }
    
    public void tampilkaninfomobil() {
        System.out.println("jumlah pintu: "+jumlah_pintu);
    }
}
public class PraktikumPBO4 {
    
    public static void main(String[] args) {
        mobil mobilbalap= new mobil("mcqueen",200,"nascar",2);
        
        mobilbalap.tampilkaninfokendaraan();
        mobilbalap.tampilkaninfomobil();
    }
}