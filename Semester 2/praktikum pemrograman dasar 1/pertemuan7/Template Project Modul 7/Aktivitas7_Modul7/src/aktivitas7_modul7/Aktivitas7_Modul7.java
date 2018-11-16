/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktivitas7_modul7;

import java.util.Scanner;

/**
 *
 * @author yohan
 */
public class Aktivitas7_Modul7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriks = new int [3][4];
        /* deklarasikan array 2 dimensi berukuran 3 x 4 */
        
        for (int x = 0; x <3; x++){
            for(int y =0; y<4; y++){
                System.out.print("Masukkan angka di baris ke "+(x + 1) + " kolom ke "+ ( y + 1 )+ " : ");
                matriks[x][y] = input.nextInt();
            }
        }
        for (int x = 0; x < 3; x++){
            for(int y = 0; y<4; y++){
                System.out.print("{" + matriks[x][y] + "}");
            }
            System.out.println("");
        }
        /* lakukan input elemen-elemen array 2 dimensi tersebut */
    }
    
}
