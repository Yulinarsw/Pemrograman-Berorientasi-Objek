/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yulinar sri wahyuni
 */
public class Perhitungan {
     public int tambah(int x, int y) {
        return x + y;
    }

    public float tambah(float x, float y){
        return x + y;
    }

    public double tambah(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        Perhitungan per = new Perhitungan();

        System.out.println(per.tambah(20, 8));
        System.out.println(per.tambah(8.8, 3.653));
        System.out.println(per.tambah(9.536522628363, 7.537263223273));
    }
}
