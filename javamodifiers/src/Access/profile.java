/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access;

/**
 *
 * @author acer
 */
public class profile {
    String fname = "dafina";
    String lname = "agustina";
    String email = "daf@gmail.com";
    int age = 17;
    public static void main (String [] args){
        profile mydata=new profile ();
        System.out.println ("name =  " + mydata.fname + " " + mydata.lname);
        System.out.println ("email = " + mydata.email);
        System.out.println (" umur = " + mydata.age);
    
    }
}
