/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author Ade
 */
public class latihan2 {

    public static void main(String[] args) {
        int a, b = 2, c = 3;
        int d, e = 1, f = 2, g = 3;
        int h, i = 4, j = 5, k = 6, l = 7;
        int m, n = 8, o = 3;
        int p, q = 10, r = 11, s = 12;
        int t, u = 5, v = 3, w = 10, x = 8;
        System.out.println("a=b&c adalah " + (a = b & c));
        System.out.println("d=e&(f&g) adalah " + (d = e & (f & g)));
        System.out.println("(i&j)&(k&l) adalah " + (h = (i & j) & (k & l)));
        System.out.println("m=n|o adalah " + (m = n | o));
        System.out.println("p=q&(r&s) adalah " + (p = q & (r & s)));
        System.out.println("t=(u&v)&(w&x) adalah " + (t = (u & v) & (w & x)));
    }
}
