/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan22.perhitunganlingkarang;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */
public class IF10K10119912Latihan22PerhitunganLingkarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float phi = (float) 3.14;
        int d, luas,keliling, jari;

        System.out.println("Program Luas Lingkaran\n");
        System.out.print("Masukkan Diameter lingakaran : ");
        d =  (int) input.nextDouble();
        
        jari = d / 2;
        luas =  (int) (0.5 * phi * d);
        keliling = (int) (d * phi) ;

        System.out.print( "Jari-jari =" + (int) jari + "\nLuas Lingkaran = " + (float)luas + " \nKeliling lingkaran = "+ (float)keliling);
    }
    
}
