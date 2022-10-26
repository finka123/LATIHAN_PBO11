/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author hp
 */
public class BANK1 {
int saldo,simUang,ambiluang;
public BANK1(int saldo){
    this.saldo=saldo;
    System.out.println("selamat datang di bank bca");
    System.out.println("saldo saat ini: Rp" +saldo);
}
void simUang (int simUang){
 System.out.println("simpan uang : Rp"+simUang);
 System.out.println("saldo saat ini: Rp" +saldo);   
}
void ambilUang (int ambilUang){
System.out.println("ambil uang : Rp" +ambilUang);
System.out.println("saldo saat ini: Rp" +saldo);
}
}
