/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hp;

/**
 *
 * @author hp
 */
public class HandphoneBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Handphone Hpku = new Handphone();
       
       Hpku.Hp = "Handphone Hidup...";
       Hpku.Hp = "Kring,Kring,Kring...panggilan dilakukan";
       Hpku.Hp = "Dung, dung...sms berhasil dikirim";
       Hpku.Hp = "Handphone Mati...";
       
       Hpku.printhidupkan();
       Hpku.printlakukanpanggilan();
       Hpku.printkirimSMS();
       Hpku.printmatikan();
   
    }
    
}
