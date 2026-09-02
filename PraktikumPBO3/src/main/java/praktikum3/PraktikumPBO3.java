/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum3;

/**
 *
 * @author yusuf
 */
class Hewan {
    String nama;
    int umur;
    
    public Hewan(String nama, int umur) {
        this.nama= nama;
        this.umur= umur;
    }
    public String getNama () {
        return nama;
    }
    public void setNama (String nama) {
        this.nama= nama;
    }
    public int getUmur () {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur= umur;
    }
    void suara() {
        System.out.println("hewan bersuara");
    }
    void berlari() {        
        System.out.println("hewan berlari");
    }
    void info() {
        System.out.println("nama hewan: "+ nama);
        System.out.println("umur hewan: "+umur+" tahun");
    }
}

public class PraktikumPBO3 {

    public static void main(String[] args) {
        Hewan kucing= new Hewan ("apin", 2);
        kucing.info();
        kucing.suara();
        kucing.berlari();
        
        System.out.println();
                
        Hewan anjing= new Hewan ("doggy", 4);
        anjing.info();
        anjing.berlari();
    }
}