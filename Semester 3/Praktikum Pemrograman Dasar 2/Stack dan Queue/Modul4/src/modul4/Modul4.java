/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author yohan
 */
public class Modul4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.print(); // should show nothing
        System.out.println(a.qpop()); // should show null
        System.out.println(a.spop()); // should show null
        a.push(new LinkedListNode(5));
        a.push(new LinkedListNode(4));
        a.print(); // should show "5 4"
        System.out.println(a.spop().data); // should show "4"
        a.push(new LinkedListNode(4));
        System.out.println(a.qpop().data); // should show "5"
        a.print(); // should show "4"
    }
    
}
