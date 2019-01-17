/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

import java.util.Scanner;

/**
 *
 * @author yohan
 */
public class Modul5 {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        char ulang = 0, ulangpr;
        int pilih, data, angka, pilihm, pilmen;

        do {
            ulang = 't';
            System.out.println("-----------------------------");
            System.out.println("        Binnary Tree");
            System.out.println("-----------------------------");
            System.out.println("1. Tambah Angka ");
            System.out.println("2. Lihat Angka");
//            System.out.println("3. Hapus Angka");
            do {
                System.out.print("Pilih menu : ");
                pilih = sc.nextInt();
                if (pilih < 0 || pilih > 2) {
                    System.out.println("Salah Ulangi ! ");
                }
            } while (pilih < 0 || pilih > 2);

            switch (pilih) {
                case 1:
                    do {
                        ulang = 't';
                        System.out.print("Masukkan jumlah data : ");
                        data = sc.nextInt();
                        for (int i = 0; i < data; i++) {
                            System.out.print("Angka ke " + (i + 1) + " :");
                            angka = sc.nextInt();
                            bt.push(new BinaryTreeNode(angka));
                        }
                        do {
                            System.out.print("Tambah antrian lagi? (Y / T)\t");
                            ulangpr = sc.next().charAt(0);
                        } while (ulangpr != 't' && ulangpr != 'y');
                    } while (ulangpr == 'y');
                    do {
                        System.out.print("Kembali ke menu awal ? (Y / T)\t");
                        ulang = sc.next().charAt(0);
                    } while (ulang != 'y' && ulang != 't');
                    break;

                case 2:
                    ulang = 't';
                    System.out.println("----------------------------");
                    System.out.println("    Angka Yang Tersedia");
                    System.out.println("1. Lihat dengan Infix Mode");
                    System.out.println("2. Lihat dengan Prefix Mode");
                    System.out.println("3. Lihat dengan Postfix Mode");
                    System.out.println("4. Lihat dengan Mode Biasa");
                    System.out.println("----------------------------");
                    do {
                        System.out.print("Pilih menu : ");
                        pilihm = sc.nextInt();
                        if (pilihm < 0 || pilihm > 4) {
                            System.out.println("Salah! Ulangi ");
                        }
                    } while (pilihm < 0 || pilihm > 4);

                    switch (pilihm) {
                        case 1:
                            System.out.println("  Infix Mode ");
                            System.out.println("-------------");
                            bt.infix();
                            do {
                                System.out.print("Kembali ke menu awal ? (Y / T)\t");
                                ulang = sc.next().charAt(0);
                            } while (ulang != 'y' && ulang != 't');
                            break;

                        case 2:
                            System.out.println("  Prefix Mode");
                            System.out.println("---------------");
                            bt.prefix();
                            do {
                                System.out.print("Kembali ke menu awal ? (Y / T)\t");
                                ulang = sc.next().charAt(0);
                            } while (ulang != 'y' && ulang != 't');
                            break;

                        case 3:
                            System.out.println("  Postfix Mode");
                            System.out.println("----------------");
                            bt.postfix();
                            do {
                                System.out.print("Kembali ke menu awal ? (Y / T)\t");
                                ulang = sc.next().charAt(0);
                            } while (ulang != 'y' && ulang != 't');
                            break;

                        case 4:
                            System.out.println(" Angka");
                            System.out.println("----------");
                            bt.print();
                            do {
                                System.out.print("Kembali ke menu awal ? (Y / T)\t");
                                ulang = sc.next().charAt(0);
                            } while (ulang != 'y' && ulang != 't');
                            break;
                    } 
                    break;

//                case 3:
//                    ulang = 't';
//                    System.out.println("                Hapus Angka");
//                    System.out.println(" 1. Hapus Node yang Tidak memiliki Child");
//                    System.out.println(" 2. Hapus Node dengan 1 Child ");
//                    System.out.println(" 3. Hapus Node dengan 2 Child");
//                    do {
//                        System.out.print("Pilih :");
//                        pilmen = sc.nextInt();
//                        if (pilmen < 0 || pilmen > 3) {
//                            System.out.println("Ulang!! ");
//                        }
//                    } while (pilmen < 0 || pilmen > 3);
//
//                    switch (pilmen) {
//                        case 1:
//                            System.out.println(" Node Yang tidak memiliki Child");
//                            BinaryTreeNode deleted = bt.root.most_left_child();
//                            System.out.println(deleted.data);
//                            bt.delete(deleted);
//                            do {
//                                System.out.print("Kembali ke menu awal ? (Y / T)\t");
//                                ulang = sc.next().charAt(0);
//                            } while (ulang != 'y' && ulang != 't');
//                            break;
//
//                        case 2:
//                            System.out.println(" Hapus Node dengan 1 Child");
//                            deleted = bt.root.most_right_child().parent;
//                            System.out.println(deleted.data);
//                            System.out.println(deleted.only_has_right());
//                            System.out.println(deleted.only_has_left());
//                            bt.delete(deleted);
//                            do {
//                                System.out.print("Kembali ke menu awal ? (Y / T)\t");
//                                ulang = sc.next().charAt(0);
//                            } while (ulang != 'y' && ulang != 't');
//                            break;
//
//                        case 3:
//                            System.out.println(" Hapus Node dengan 2 Child");
//                            deleted = bt.root;
//                            System.out.println(deleted.data);
//                            bt.delete(deleted);
//                            do {
//                                System.out.print("Kembali ke menu awal ? (Y / T)\t");
//                                ulang = sc.next().charAt(0);
//                            } while (ulang != 'y' && ulang != 't');
//                            break;
//
//                    }

            }

//        bt.print(); // should show structured tree
//        bt.infix(); // should show tree in infix mode
//        bt.prefix(); // should show tree in prefix mode
//        bt.postfix(); // should show tree in postfix mode
//        // delete a node with no child
//        BinaryTreeNode deleted = bt.root.most_left_child(); //Node 12
//        System.out.println(deleted.data); // should show "12"
//        bt.delete(deleted);
//        bt.print(); // should show structured tree without "12"
//        // delete a node with a single child
//        deleted = bt.root.most_right_child().parent; // Node "27"
//        System.out.println(deleted.data); // should show "27"
//        System.out.println(deleted.only_has_right());
//        System.out.println(deleted.only_has_left());
//        bt.delete(deleted);
//        bt.print(); // should show structured tree without "27"
//        // delete root (has two children)
//        deleted = bt.root; // Node "20"
//        System.out.println(deleted.data); // should show "20"
//        bt.delete(deleted);
//        bt.print(); // should show structured tree without "20"
        } while (ulang == 'y' || ulang == 'Y');
    }

}
