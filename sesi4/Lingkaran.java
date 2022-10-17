/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;


public class Lingkaran extends bangundatar {
    int r;
    
    public Lingkaran(int r){
        this.r = r;
        
    }
    
    public float luas(){
        return(float)(Math.PI * r * r);
        
    }
    public float keliling(){
        return (float) (2 * Math.PI * r);
    }
    
}
