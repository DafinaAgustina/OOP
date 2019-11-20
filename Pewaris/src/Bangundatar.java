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
public class Bangundatar {
    public static void main (String [] args){
        int pil;
        Lingkaran L = new Lingkaran();
        Segitiga S = new Segitiga();
        Persegipanjang PP = new Persegipanjang();
        Persegi P = new Persegi();
        Scanner inp = new Scanner (System.in);
        System.out.println(" MENU");
        System.out.println("======");
        System.out.println("1. Lingkaran");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi_panjang");
        System.out.println("4. Persegi");
        System.out.println("5. Exit");
        System.out.println("pilihan");
        pil = inp.nextInt();
        switch(pil){
            case 1 : L.Lingkaran();break;
            case 2 : S.Segitiga();break;
            case 3 : PP.Persegipanjang();break;
            case 4 : P.Persegi();break;
            case 5 : System.exit(0);
            
        }
    }
    
}
