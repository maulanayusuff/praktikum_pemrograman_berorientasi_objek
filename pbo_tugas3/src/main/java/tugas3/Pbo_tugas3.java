/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugas3;

/**
 *
 * @author yusuf
 */

class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;
    
    public Manusia (String nama, int usia, String pekerjaan) {
        this.nama= nama;
        this.usia= usia;
        this.pekerjaan= pekerjaan;
    }
    
    public String getNama () {
        return nama;
    }
    public void setNama (String nama) {
        this.nama= nama;
    }
}

class Pekerja extends Manusia {
    private int gaji;
    
    public Pekerja (String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji= gaji;
    }
    
    public int getGaji () {
        return gaji;
    }
    public void setGaji (int gaji) {
        this.gaji= gaji;
    }
    
    @Override
    public String toString() {
        return "nama: "+getNama() +
                "\nusia: "+usia +
                "\npekerjaan: "+pekerjaan +
                "\ngaji: "+gaji;
    }
    
}

public class Pbo_tugas3 {
    public static void main(String[] args) {
        Pekerja karyawan= new Pekerja("Vano",22,"data analyst",40000000);
        
        System.out.println("informasi pekerja");
        System.out.println(karyawan.toString());   
        
        karyawan.setNama("yue");
        System.out.println("\nsetelah ganti pekerja");
        System.out.println(karyawan.toString());
        
        System.out.println("\nakses langsung usia yue: "+karyawan.usia);
    }
}
