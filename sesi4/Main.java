/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;


public class Main {
    public static void main(String[] args){
        
        bangundatar BangunDatar = new bangundatar();
        Persegi persegi = new Persegi (8);
        Segitiga segitiga = new Segitiga (9,6);
        Lingkaran lingkaran = new Lingkaran (20);
        
        // memanggil method luas dan keliling
        
        BangunDatar.luas();
        BangunDatar.keliling();
        
        System.out.println("Luas persegi:" + persegi.luas());
        System.out.println("Keliling persegi:" + persegi.keliling());
        System.out.println("Luas segitiga:" + segitiga.luas());
        System.out.println("Luas lingkaran:" + lingkaran.luas());
        System.out.println("Keliling lingkaran:" + lingkaran.keliling());
        
        
        
    }
    
}
