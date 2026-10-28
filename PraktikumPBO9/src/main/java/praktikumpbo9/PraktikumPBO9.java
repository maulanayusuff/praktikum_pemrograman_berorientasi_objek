/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikumpbo9;

/**
 *
 * @author yusuf
 */
abstract class Kendaraan {
    abstract void berjalan();
    
    void info() {
        System.out.println("ini adalah kendaraan");
    }
} 
class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("mobil sedang berjalan dengan cepat");
    }
}
class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("sepeda sedang berjalan dengan pelan");
    }
}
class Kereta extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("kereta sedang berjalan dengan sangat cepat");
    }
}
public class PraktikumPBO9 {
    public static void main(String[] args) {
        Kendaraan mobil= new Mobil();
        Kendaraan sepeda= new Sepeda();
        Kendaraan kereta= new Kereta();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
        
        kereta.berjalan();
        kereta.info();
    }
}
