/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Persegi extends Bangundatar  {
    public void Persegi(){
        double sp,lp,kp;
        Scanner c = new Scanner (System.in);
        System.out.println("PERSEGI");
        System.out.println("=========");
        System.out.println("Masukkan sisi");
        sp = c.nextDouble();
        lp = sp*sp;
        kp = 4*sp;
        System.out.println("Luas Persegi adalah : "+lp);
        System.out.println("Keliling Persegi adalah : "+kp);
    }
    
}
