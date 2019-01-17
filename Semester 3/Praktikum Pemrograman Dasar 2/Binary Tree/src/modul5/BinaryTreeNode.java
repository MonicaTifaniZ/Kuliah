/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

public class BinaryTreeNode {

    BinaryTreeNode parent;
    BinaryTreeNode left;
    BinaryTreeNode right;
    int data;

    /* Set data to new_data
     * set parent, left, and right into null
     */
    BinaryTreeNode(int new_data) {
        this.data = new_data;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    /* set other as parent of this node
    * if other is not null, and other's data is bigger than this
    data then set this as other's left
    * if other is not null, and other's data is lesser than this
    data then set this as other's right
     */
    void set_parent(BinaryTreeNode other) {
        this.parent = other;
        if (other != null) {
            if (other.data > this.data) {
                other.left = this;
            } else {
                other.right = this;
            }
        }
    }

    /* set other as left of this node
    * if other is not null set other's parent to this node
     */
    void set_left(BinaryTreeNode other) {
        this.left = other;
        if (other != null) {
            other.parent = this;
        }
    }

    /* set other as right of this node
    * if other is not null set other's parent to this node
     */
    void set_right(BinaryTreeNode other) {
        this.right = other;
        if (other != null) {
            other.parent = this;
        }
    }

    /* if this node's parent is not null and parent's left is this, return true
    * otherwise return false
     */
    boolean is_left() {
        return this.parent != null && parent.left == this;
    }

    /* if this node's parent is not null and parent's right is this, return true
     * otherwise return false
     */
    boolean is_right() {
        return this.parent != null && parent.right == this;
    }

    /* if this left is not null and this right is not null, return true
     */
    boolean has_right_and_left() {
        return this.left != null && this.right != null;
    }

    /* if this left is not null but this right is null, return true
     */
    boolean only_has_left() {
        return this.left != null && this.right == null;
    }

    /* if this right is not null but this left is null, return true
     */
    boolean only_has_right() {
        if (this.right != null || this.left == null) {
           
        }
        return this.right != null && this.left == null;
    }

    boolean has_no_child() {
        return this.left == null && this.right == null;
    }

    /* if this node is it's parent left child, set parent's left = null and this parent = null
    * if this node is it's parent right child, set parent's right = null and this parent = null
     */
    void unset_parent() {
        if (this.is_left()) {
            parent.left = null;
            this.parent = null;

        } else if (this.is_right()) {
            parent.right = null;
            this.parent = null;

        }
    }

    /* set child as left of this node
    * while child's left is not null, set child into child's left
    * return child
     */
    BinaryTreeNode most_left_child() {
        BinaryTreeNode child = this.left;
        while (child.left != null) {
            child = child.left;

        }
        return child;
    }

    /* set child as right of this node
    * while child's right is not null, set child into child's right
    * return child
     */
    BinaryTreeNode most_right_child() {
        BinaryTreeNode child = this.right;
        while (child.right != null) {
            child = child.right;
        }
        return child;
    }

    /* recursively print node
    * print spaces + label + node's data
    * if node's left is not null, call left's print method with additional space and "LEFT" label
    * if node's right is not null, call right's print method with additional space and "RIGHT" label
     */
    void print(String spaces, String label) {
        System.out.println(spaces + label + this.data);
        if (this.left != null) {
            this.left.print(spaces +" ", " LEFT ");
        }
        if (this.right != null) {
            this.right.print(spaces+ " ", " RIGHT ");
        }
    }

    // Alias for print("", "NODE");
    void print() {
        this.print(" ", "NODE ");
    }

    /* recursively print node with infix mode
    * print "("
    * if node's left is not null, run left's infix method, otherwise print "null"
    * print space + this node's data + space
    * if node's right is not null, run right's infix method, otherwise print "null"
    * print ")"
     */
    void infix() {
        System.out.print("( ");
        if (this.left != null) {
            left.infix();
        } else {
            System.out.print("null");
        }
        System.out.print(" " + this.data + " ");
        if (this.right != null) {
            right.infix();
        } else {
            System.out.print("null");
        }
        System.out.print(")");
    }

    /* recursively print node with prefix mode
    * print this node's data + "("
    * if node's left is not null, run left's prefix method, otherwise print "null"
    * print space
    * if node's right is not null, run right's prefix method, otherwise print "null"
    * print ")"
     */
    void prefix() {
        System.out.print(this.data + "(");
        if (this.left != null) {
            left.prefix();
        } else {
            System.out.print("null");
        }
        System.out.print(" ");
        if (this.right != null) {
            right.prefix();
        } else {
            System.out.print("null");
        }
        System.out.print(") ");
    }

    /* recursively print node with postfix mode
     * print "("
     * if node's left is not null, run left's postfix method, otherwise print "null"
     * print space 
     * if node's right is not null, run right's postfix method, otherwise print "null"
     * print ")" + this node's data
     */
    void postfix() {
        System.out.print("( ");
        if (this.left != null) {
            left.postfix();
        } else {
            System.out.print("null");
        }
        System.out.print(" ");
        if (this.right != null) {
            right.postfix();
        } else {
            System.out.print("null");
        }
        System.out.print(")" + this.data);
    }
}
