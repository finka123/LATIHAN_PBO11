/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author hp
 */
public class Bank1 {
 int saldo,simUang,ambiluang;
public Bank1(int saldo){
    this.saldo +=saldo;
    System.out.println("selamat datang di bank bca");
    System.out.println("saldo saat ini: Rp" +this.saldo+ "\n");
}

    int ambilUang(int saldo){
System.out.println("Ambil uang: Rp. " + saldo);
if(this.saldo >= saldo){
this.saldo -= saldo;
System.out.println("Saldo saat ini: Rp. " + this.saldo);
} else {
System.out.println("Saldo saat ini tidak mencukupi");
}
return this.saldo;
    }
}   

