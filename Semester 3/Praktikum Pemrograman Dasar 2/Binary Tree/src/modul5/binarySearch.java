/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

import java.util.Scanner;

/**
 *
 * @author Monica
 */
public class binarySearch {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        int angka = 0, jumangka, cari;
        char ulang = 'y';

        System.out.println("    ** Binary Search in Binary Tree **");
        System.out.println("-------------------------------------");
        System.out.print("Masukan jumlah angka\t: ");
        jumangka = sc.nextInt();
        for (int i = 0; i < jumangka; i++) {
            System.out.print("Angka ke " + (i + 1) + "\t: ");
            angka = sc.nextInt();
            bt.push(new BinaryTreeNode(angka));
        }
        System.out.println("--------------------------------");
        bt.print();
        do {
            System.out.println("--------------------------------");
            System.out.print("Masukan angka yang anda cari : ");
            cari = sc.nextInt();
            bt.findNode(cari);
            do {
                System.out.print("Cari Angka lagi? (Y / T)\t");
                ulang = sc.next().charAt(0);
            } while (ulang != 't' && ulang != 'y');
            
        } while (ulang == 'y');

    }

}
