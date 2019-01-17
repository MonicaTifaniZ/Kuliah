/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author yohan
 */
public class Modul6 {

    public static void main(String[] args) {
        Tree t = new Tree(new TreeNode(1));
        t.root.add_child(new TreeNode(2), 1);
        t.root.add_child(new TreeNode(3), 1);
        t.root.add_child(new TreeNode(4), 2);
        t.root.children.get(0).add_child(new TreeNode(5), 1);
        t.root.children.get(2).add_child(new TreeNode(6), 1);
        t.root.children.get(2).add_child(new TreeNode(7), 2);
        t.print();
    }
    
}
