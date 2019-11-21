/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapi;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author acer
 */
public class profileBufferReader {
    public static void main (String[]args){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        String alamat;
        String jurusan;
        String jeniskelamin;
        String tahunangkatan;
        String nim;
        try{
        
        System.out.print("============");
        System.out.print("  Profile");
        System.out.print("============");
        
        System.out.print("nama        : ");
         nama = input.readLine();
         
        System.out.print("alamat      : ");
        alamat = input.readLine();
        
        System.out.print("jurusan     : ");
        jurusan = input.readLine();
        
        System.out.print("jenis kelamin : ");
        jeniskelamin = input.readLine();

        System.out.print("tahun angkatan : ");
        tahunangkatan = input.readLine();
        
         System.out.print("nim         : ");
         nim = input.readLine();
    
        
        
        
        
        
        System.out.println("nim            :   "       + nim);
        System.out.println("nama           :   "       + nama);
        System.out.println("alamat         :   "       + alamat);
        System.out.println("jurusan        :   "       + jurusan);
        System.out.println("tahun angkatan :   "       + tahunangkatan);
        System.out.println("jenis kelamin  :   "       + jeniskelamin);
        
    }catch(IOException ex){
        
        System.out.println("Terjadi Kesalahn pada INput");
    }
    
    }
}
