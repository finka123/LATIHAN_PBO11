/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;

/**
 *
 * @author hp
 */
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] values = {80, 50, 50, 50, 80};
    sayCongrats("Eko", values);

    sayCongrats("Budi", 80, 90, 76, 80);

  }

  static void sayCongrats(String name, int... values) {
    var total = 0;
    for (var value : values) {
      total += value;
    }
    var finalValue = total / values.length;

    if (finalValue >= 75) {
      System.out.println("Selamat " + name + ", Anda Lulus");
    } else {
      System.out.println("Maaf " + name + ", Anda Tidak Lulus");
    }
  }
}
 
    

