/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapi;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Biodata {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        
        String Nama;
        String Alamat;
        String Jurusan;
        String JenisKelamin;
        int TahunAngkatan;
        long Nim;
       
        
        
        System.out.println("==============");
       System.out.println("    Biodata");
       System.out.println("===============");
       
        System.out.print("nama        : ");
         Nama = input.nextLine();
         
        System.out.print("alamat      : ");
        Alamat = input.nextLine();
        
        System.out.print("jurusan     : ");
        Jurusan = input.nextLine();
        
        System.out.print("jenis kelamin : ");
        JenisKelamin = input.nextLine();

        System.out.print("tahun angkatan : ");
        TahunAngkatan = input.nextInt();
        
         System.out.print("nim         : ");
         Nim = input.nextLong();
        
        
        System.out.println("============");
        System.out.println("  Biodataku"); 
        System.out.println("============");
        System.out.println("nim            :   "       + Nim);
        System.out.println("nama           :   "       + Nama);
        System.out.println("alamat         :   "       + Alamat);
        System.out.println("jurusan        :   "       + Jurusan);
        System.out.println("tahun angkatan :   "       + TahunAngkatan);
        System.out.println("jenis kelamin  :   "       + JenisKelamin);
        
        
    }
}
