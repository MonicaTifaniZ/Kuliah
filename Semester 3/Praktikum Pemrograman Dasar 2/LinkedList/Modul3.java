/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pertemuan3;

/**
 *
 * @author confus1on
 */
import java.util.Scanner;

public class Modul3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data;
        LinkedList a = new LinkedList();
        int banyak;
        
        System.out.print("Masukkan Banyak data yang ingin di input : ");
        banyak = input.nextInt();
        input.nextLine();
        
        for(int i=1; i<=banyak; i++)
        {
            System.out.print("Masukkan Data ke-"+i + " : ");
            data = input.nextInt();
            a.push(new LinkedListNode(data));
        }
        a.print();
        System.out.println("After Quick Short");
//        a.quickSort(a.head);
        a.bubbleSortList();
        a.print();
//        System.out.print("masukkan data yang ingin dicari : ");
//        data = input.nextInt();
//        
//        if (a.find_node_by_data(data)) {
//            System.out.println("Data " + data + " Ditemukan");
//        }
//        else
//        {
//            System.out.println("Data tidak ditemukan");
//        }
        
        /* System.out.println("Hapus Data : " + a.head.data);
        a.delete(a.head);
        a.print(); // should show 5 6 7
        System.out.println("Hapus Data : " + a.tail.prev.data);
        a.delete(a.tail.prev);
        a.print(); // should show 5 7
        System.out.println("Hapus Data : " + a.tail.data);
        a.delete(a.tail);
        a.print(); // should show 5
        System.out.println("Hapus Data : " + a.head.data);
        a.delete(a.head);
        a.print(); // should show nothing */
    }
}
