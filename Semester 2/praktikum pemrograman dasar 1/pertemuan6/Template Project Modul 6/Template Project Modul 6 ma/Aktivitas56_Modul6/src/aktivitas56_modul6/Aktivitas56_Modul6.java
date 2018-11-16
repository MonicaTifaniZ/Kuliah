/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktivitas56_modul6;

import java.util.Scanner;

/**
 *
 * @author albert
 */
public class Aktivitas56_Modul6 {

    public static void main(String[] args) {
        /* Bagian ini TIDAK PERLU diubah. Bagian ini adalah mendeklarasikan
        dan menginstansiasi array A */
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        int [] angka_urut = new int[A.length];
        int temp = 0;
        double hasil = 0;
        
        for (int i = 0; i < A.length; i++) {
            System.out.print("Masukkan angka : ");
            A[i] = input.nextInt();
            angka_urut[i] = A[i];
            /* Masukkan source code untuk menginputkan angka ke dalam array di
            dalam perulangan ini, dengan tentunya mendeklarasikan class Scanner
            terlebih dahulu. */
        }
        for (int i = 0; i < A.length - 1; i++) {
            for (int y = 0; y < angka_urut.length-1; y++){
                if (angka_urut[y+1] < angka_urut[y]){
                    temp = angka_urut[y]; // temp untuk menampung nilai yang akan ditukar
                    angka_urut[y] = angka_urut[y+1];
                    angka_urut[y+1] = temp; 
                }
            }
            /* Lakukan pengurutan angka array A di sini. Anda dapat menggunakan
            algoritma pengurutan bubble sort, insertion sort, selection sort, 
            atau algoritma pengurutan lain yang menurut Anda paling mudah. */
        }
        
        /* Bagian ini adalah mencari nilai rata-rata, angka terkecil dan
        angka terbesar */
        float jumlah = 0; /* inisialisasi jumlah dengan 0 terlebih dahulu */
        int maks = A[0]; /* asumsikan nilai maksimum awalnya elemen pertama array A */
        int min = A[0]; /* asumsikan nilai minimum awalnya elemen pertama array A */
        for (int i = 1; i < A.length; i++) {
            if (A[i] > maks ){
                
            }
            /* Pencarian nilai maksimum dilakukan di sini dengan membandingkan 
            nilai maksimum dengan elemen berikutnya dalam array */
        }
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min){
                
            }
            /* Pencarian nilai minimum dilakukan di sini dengan membandingkan 
            nilai maksimum dengan elemen berikutnya dalam array */
        }
        for (int i = 0; i < A.length; i++) {
            
            hasil = hasil + A[i];
           
            /* Lakukan penjumlahan elemen-elemen array A */
        }
        System.out.println("");
        System.out.println("Angka tertinggi : " +angka_urut[angka_urut.length-1]);
        System.out.println("Angka terendah  : " +angka_urut[0]);
        System.out.println("Rata - rata \t : " +(hasil/angka_urut.length));
        /* Tampilkan nilai maksimum, minimum, dan rata-rata data dari array */
    }

}
