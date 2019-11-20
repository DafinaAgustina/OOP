/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author acer
 */
public class Segitiga extends Bangundatar {
    public void Segitiga(){
        double ls,as,ts,ss,ks;
        Scanner a = new Scanner (System.in);
        System.out.println(System.in);
        System.out.println("SEGITIGA");
        System.out.println("=========");
        System.out.println("Masukkan alas");
        as = a.nextDouble();
        System.out.println("Masukkan tinggi");
        ts = a.nextDouble();
        System.out.println("Masukkan sisi");
        ss = a.nextDouble();
        ls = (as*ts)/2;
        ks = (ss*2)+as;
        System.out.println("Luas Segitiga adalah :"+ls);
        System.out.println("Keliling segitiga adalah :"+ks);
        
        
    }
}
