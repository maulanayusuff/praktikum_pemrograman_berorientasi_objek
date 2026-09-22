/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo_tugas4;

/**
 *
 * @author yusuf
 */

class Kendaraan {
    String nama;
    String jenis;
    
    public void tampilkanInfo() {
        System.out.println("nama kendaraan: "+nama);
        System.out.println("jenis: "+jenis);
    }
}

class KendaraanDarat extends Kendaraan {
    String bahanBakar;
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("bahan bakar: "+bahanBakar);
    }
}

class Mobil extends KendaraanDarat {
    String merkMobil;

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("merk mobil: "+merkMobil);
    }
}

class SepedaMotor extends KendaraanDarat {
    String merkMotor;

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("merk motor: "+merkMotor);
    }
}

public class Pbo_tugas4_2 {
    
    public static void main(String[] args) {
        Mobil mobil= new Mobil();
        mobil.nama= "senna";
        mobil.jenis= "supercar";
        mobil.bahanBakar= "bensin";
        mobil.merkMobil= "mclaren";
        mobil.tampilkanInfo();
        
        SepedaMotor motor= new SepedaMotor();
        motor.nama= "panigale v4";
        motor.jenis= "balap";
        motor.bahanBakar= "bensin";
        motor.merkMotor= "ducati";
        motor.tampilkanInfo();
    }
}