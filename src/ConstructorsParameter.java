/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ConstructorsParameter {
    long modelNim ;
    String modelNama;
    String modelAlamat;
    String modelJurusan;
    int modelAngkatan;
    
    public ConstructorsParameter (long Nim, String Nama, String Alamat, String Jurusan,int Angkatan ){
        modelNim = Nim;
        modelNama = Nama;
        modelAlamat = Alamat;
        modelJurusan = Jurusan;
        modelAngkatan = Angkatan;
        
    }
    
    public static void main (String [] args) {
        ConstructorsParameter myConstructorsParameter = new ConstructorsParameter (201869040014l,"Dafina Agustina","Sidogiri Pasuruan","Teknik Informatika",2018);
        System.out.println ("Nim    =  " + myConstructorsParameter.modelNim  );
        System.out.println ("Nama    =  " + myConstructorsParameter.modelNama  );
        System.out.println ("Alamat    =  " + myConstructorsParameter.modelAlamat  );
        System.out.println ("Jurusan    =  " + myConstructorsParameter.modelJurusan  );
        System.out.println ("Angkatan    =  " + myConstructorsParameter.modelAngkatan  );
        
    }
}
