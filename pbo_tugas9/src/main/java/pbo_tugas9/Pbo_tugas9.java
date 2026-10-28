/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo_tugas9;

/**
 *
 * @author yusuf
 */
abstract class Hewan {
    abstract void suara();
    
    void info() {
        System.out.println("ini adalah hewan");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk Guk");
    }
}

public class Pbo_tugas9 {

    public static void main(String[] args) {
        Hewan kucing= new Kucing();
        Hewan anjing= new Anjing();
        
        kucing.suara();
        kucing.info();
        
        anjing.suara();
        anjing.info();
    }
}
