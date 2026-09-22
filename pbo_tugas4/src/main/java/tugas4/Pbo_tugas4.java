/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugas4;

/**
 *
 * @author yusuf
 */

class Hewan {
    String nama;
    String jenis;
    
    public void tampilkanInfo() {
        System.out.println("nama hewan: "+nama);
        System.out.println("jenis: "+jenis);
    }
}

class Kucing extends Hewan {
    public void suara(){
        System.out.println("miaw");
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        suara();
    }
}

class Anjing extends Hewan {
    public void suara(){
        System.out.println("guk guk");
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        suara();
    }
}

public class Pbo_tugas4 {

    public static void main(String[] args) {
        Kucing kucing= new Kucing();
        kucing.nama= "luna";
        kucing.jenis= "munchkin";
        kucing.tampilkanInfo();
        
        Anjing anjing= new Anjing();
        anjing.nama= "bond";
        anjing.jenis= "great pyrenees";
        anjing.tampilkanInfo();
    }
}