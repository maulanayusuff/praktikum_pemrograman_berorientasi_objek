/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum5;

/**
 *
 * @author yusuf
 */

class Kendaraan {
    String nama;
    int kecepatan;
    
    public void tampilkanInfo() {
        System.out.println("nama kendaraan: "+nama);
        System.out.println("kecepatan maks: "+kecepatan+"km/h");
    }
}

class Mobil extends Kendaraan {
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("jenis kendaraan: mobil dengan "+jumlahPintu+" pintu");
    }
}

class SepedaMotor extends Kendaraan {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("jenis mesin: "+jenisMesin);
    }
}
   

public class PraktikumPBO5 {

    public static void main(String[] args) {
        Mobil mobil= new Mobil();
        mobil.nama= "porsche 911";
        mobil.kecepatan= 317;
        mobil.jumlahPintu= 2;
        mobil.tampilkanInfo();
        
        SepedaMotor motor= new SepedaMotor();
        motor.nama= "H2R";
        motor.kecepatan= 400;
        motor.jenisMesin= "998 cc 4-silinder";
        motor.tampilkanInfo();
    }
}