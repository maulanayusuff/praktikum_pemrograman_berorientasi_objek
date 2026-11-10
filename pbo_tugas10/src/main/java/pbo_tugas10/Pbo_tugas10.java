/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo_tugas10;

/**
 *
 * @author yusuf
 */
public class Pbo_tugas10 {
    public static void main(String[] args) {
        Pembayaran laptop= new Elektronik();
        Pembayaran bakso= new Makanan();
        
        System.out.println("pajak elektronik (harga 15000000): " + laptop.hitungPajak(15000000));
        System.out.println("pajak makanan (harga 9000): " + bakso.hitungPajak(9000));
    }
}
