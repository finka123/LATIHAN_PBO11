/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

/**
 *
 * @author hp
 */
public class soal {
   public static void main (String [] args){
       var nilai = 80;
       var absen = 30;
       
       var LulusNilai = nilai >= 75;
       var lulusAbsen = absen >= 75;
       
       var lulus = LulusNilai && lulusAbsen;
       
       if ( nilai >= 75 && absen <= 75){// menghapus
       System.out.println("selamat anda lulus ");
   } else {
           System.out.println("silakan coba lagi tahun depan ");
           }
   if (nilai <= 80 && absen >= 80){
   System.out.println("nilai anda A");    
   }else if ( nilai <= 70 && absen >= 70){
     System.out.println("nilai anda B");   
   }else if ( nilai <= 60 && absen >= 60){
     System.out.println("nilai anda C"); 
   }else if ( nilai <= 50 && absen >= 50){
     System.out.println("nilai anda D"); 
   }else {
     System.out.println ("nilai anda A"); 
   }   
   }  
}
