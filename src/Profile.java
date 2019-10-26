/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Profile {
    long modelNim;
    String modelNama;
    String modelAlamat;
    String modelJurusan;
    int modelAngkatan;
    
    
 public Profile (){
     modelNim = 201869040014l;
     modelNama = "Dafina Agustina";
     modelAlamat = "Sidogiri Pasuruan";
     modelJurusan = "Teknik Informatika";
     modelAngkatan = 2018;
    
}
 
public static void main (String [] args){
    Profile myProfile = new Profile ();
    System.out.println ("Nim    = " + myProfile.modelNim);
    System.out.println ("Nama    = " + myProfile.modelNama);
    System.out.println ("Alamat   = " + myProfile.modelAlamat);
    System.out.println ("Jurusan    = " + myProfile.modelJurusan);
    System.out.println ("Angkatan    = " + myProfile.modelAngkatan);
    
}
}