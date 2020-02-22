/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillah.minggu.ke.pkg3;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BismillahMingguKe3 {


    public static void main(String[] args) throws IOException {
  
        DataInputStream in = new DataInputStream (System.in);
        
        
            String Jaraktempuh = null;
            String Waktutempuh = null;
        try {
            System.out.print("Masukkan Jarak Tempuh(km) :");
            Jaraktempuh = in.readLine();
            
            System.out.print("Masukkan Waktu Tempuh (jam) :");
            Waktutempuh = in.readLine();
            
        } catch(IOException ioe) {
            System.out.println();
        }
        double JarakTempuh;
        double WaktuTempuh;
        
        JarakTempuh = Double.parseDouble(Jaraktempuh);
        WaktuTempuh = Double.parseDouble(Waktutempuh);
        
        double Kecepatan = JarakTempuh/WaktuTempuh;
        System.out.println("Kecepatan : "+ Kecepatan);
        
        int threshold = 40;
        
        System.out.print("Kecepatan : "+ Kecepatan);
        int kecepatan = 40;
        if (kecepatan > (threshold+1)) {
            System.out.print(String.format("kecepatan : %d lebih dari: %d maka laju kendaraan cepat", kecepatan, threshold));
        } else if (kecepatan == 40) {
            System.out.print(String.format("kecepatan : %d sama dengan: %d maka laju kendaraan biasa", kecepatan, threshold));
        } else {
             System.out.print(String.format("kecepatan : %d kurang dari: %d maka laju kendaraan lambat", kecepatan, threshold));
        }
    }
}