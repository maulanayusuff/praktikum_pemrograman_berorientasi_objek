/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo_tugas2;

/**
 *
 * @author yusuf
 */
class Mobil{
    private String merk;
    private String model;
    private int tahun;
    private String warna; //atribut warna
    
    public Mobil(String merk, String model, int tahun, String warna){
        this.merk= merk;
        this.model= model;
        this.tahun= tahun;
        this.warna= warna;
    }
    public String getmerk() {
        return merk;
    }
    public void setmerk (String merk) {
        this.merk= merk;
    }
    public String getmodel() {
        return model;
    }
    public void setmodel (String model) {
        this.model= model;
    }
    public int gettahun() {
        return tahun;
    }
    public void settahun (int tahun) {
        this.tahun = tahun;
    }  
    public String getwarna() {
        return warna;
    }
    public void setwarna (String warna) {
        this.warna= warna;
    }
    void displayInfo() {
        System.out.println("merk mobil: "+merk);
        System.out.println("model mobil: "+model);
        System.out.println("tahun mobil: "+tahun); 
        System.out.println("warna mobil: "+warna); 
    }
    void startEngine() { //method startEngine
       System.out.println("mesin mobil "+merk+" menyala");
    }
}
        
public class Pbo_tugas2 {
    public static void main(String[] args) {
        Mobil balap1= new Mobil ("toyota 86", "sport coupe", 2017,"grey");
        Mobil balap2= new Mobil ("porsche 911", "sport coupe", 2023,"pink");
        balap1.displayInfo();
        balap1.startEngine();
        System.out.println();
        balap2.displayInfo();
        balap2.startEngine();
        
        System.out.println();
        System.out.println("mengubah warna toyota 86 menjadi white");
        balap1.setwarna("white");
        System.out.println("setelah warna diubah");
        balap1.displayInfo();
    }
}
