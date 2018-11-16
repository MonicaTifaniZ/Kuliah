/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmodul7;

/**
 *
 * @author yohan
 */
public class LatihanModul7 {

    public static void main(String[] args) {
        double[][] matriks = new double[4][6];
        /* rad : besar sudut x dan y pada kolom 0 dan 1 */
        for (int i=0, rad = 45; i<matriks.length; i++, rad += 90){
            for (int j=0; j<matriks[0].length; j++){
                
                if (j<2){
                    matriks [i][j] = rad;
                }
                else {
                    if (j == 2){
                        matriks[i][j] = Math.sin(matriks[i][0])* Math.cos(matriks[i][1]);
                    }
                    else if(j ==3){
                        matriks[i][j] = Math.cos(matriks[i][0])* Math.sin(matriks[i][1]);
                    }
                    else if(j==4){
                        matriks[i][j] = Math.sin(matriks[i][0])* Math.sin(matriks[i][0]);
                    }
                    else if (j==5){
                        matriks[i][j] = Math.cos(matriks[i][1])* Math.cos(matriks[i][1]);
                    }
                }
                /* pemrosesan array dua dimensi dengan ketentuan : 
                1. x dan y pada kolom pertama dan kedua diinisialisasi dengan 
                nilai rad
                2. Dari kolom ketiga sampai seterusnya melakukan perhitungan,
                gunakan Math.sin() dan Math.cos() untuk mencari nilai sin dan
                cos dari nilai rad
                */
            }
        }
        for (int i=0; i<matriks.length; i++){
            for (int j=0; j<matriks[0].length; j++){
                System.out.print(matriks[i][j] +"\t\t");/* cetak elemen-elemen array dua dimensi */
            }
            System.out.println();
        }
    }
    
}
