/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmodul6;

import java.util.Scanner;



/**
 *
 * @author albert
 */
public class LatihanModul6 {
    /* Bagian ini TIDAK PERLU diubah. Untuk mendeklarasikan class Mhs yang
    berisi NRP dan 3 nilai (Tugas, UTS, dan UAS) */
    private static class Mhs{
        
        int[] NRP = new int[5];
        int[] Tugas = new int[5];
        int[] UTS = new int[5];
        int[] UAS = new int[5];
        double[] nakhir = new double[5];
        String[] grade = new String[5];
        int a;
    }
    public static void main(String[] args) {
        /* Bagian ini TIDAK PERLU diubah. Untuk mendeklarasikan array mhs 
        yang bertipe Mhs */
        Scanner input = new Scanner(System.in);
        Mhs[] mhs = new Mhs[5];
        /* Menginstansiasi class Mhs untuk setiap elemen array mhs */
        for (int i=0; i<mhs.length; i++){
            mhs[i] = new Mhs();
        }
        for (int i=0; i<mhs.length; i++){
            /* Lakukan input untuk NRP, nilai tugas, UTS dan UAS, dan hitung
            nilai akhir plus grade-nya dengan ketentuan yang telah ada, lalu
            ditampilkan */
        }
    }
    
}
