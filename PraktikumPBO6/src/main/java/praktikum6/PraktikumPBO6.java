/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author yusuf
 */
class Hewan { //membuat class induk hewan
    public void bersuara() { //membuat method bersuara
        System.out.println("hewan bersuara"); //output jika method bersuara dipanggil
    }
       public void makan(String makanan) { //membuat method makan
        System.out.println("hewan makan "+makanan); //output jika method makan dipanggil
    }
    public void makan(String makanan, int jumlah) { //membuat method makan2
        System.out.println("hewan makan "+jumlah+" porsi "+makanan); //output jika method makan2 dipanggil
    }
}

class Kucing extends Hewan { 
    @Override
    public void bersuara() {
        System.out.println("miaw");
    }
}

class Anjing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("guk guk");
    }
}

public class PraktikumPBO6 {

    public static void main(String[] args) {
        Hewan kucing1= new Kucing(); 
        kucing1.bersuara(); 
        
        Kucing kucing= new Kucing();
        kucing.makan("ikan");
        kucing.makan("ikan", 3);
        
        Anjing anjing= new Anjing();
        anjing.bersuara();
        anjing.makan("daging", 4);
    }
}