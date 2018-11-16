/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktivitas6_modul7;

import java.util.Scanner;

/**
 *
 * @author yohan
 */
public class Aktivitas6_Modul7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* praktikan menginputkan jumlah kolom dan jumlah baris berdasarkan 
        kasus aktivitas 6, diketahui user harus menginputkan 5 angka ke dalam
        baris pertama array 2 dimensi, dan begitu seterusnya untuk baris kedua
        dan ketiga */
        System.out.print("Berapa jumlah kolom? : ");
        int Nkol = input.nextInt();
        System.out.print("Berapa jumlah baris? : ");
        int Nbar = input.nextInt();
        int[][] matriks = new int[Nbar][Nkol];

        for (int i = 0; i < Nbar; i++) {
            for (int j = 0; j < Nkol; j++) {
                System.out.print("Matriks baris ke ["+(i + 1)+"][" +(j + 1)+ "] : ");
                matriks[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < Nbar; i++) {
            for (int j = 0; j < Nkol; j++) {

                System.out.print(matriks[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }

}
