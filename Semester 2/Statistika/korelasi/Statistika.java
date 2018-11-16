/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistika;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Statistika {
public static void main(String[] args) {
        int data, akhir;
        double jumlah_data[][] = new double[14][10];
        double langkah3A, langkah3B, langkah4, langkah5A;
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#####");

        System.out.print("Masukan jumlah data : ");
        data = in.nextInt();
        akhir = data + 1;
        for (int i = 0; i < data; i++) {
            System.out.print("X1 data ke " + (i + 1) + "\t: ");
            jumlah_data[i][0] = in.nextDouble();
            System.out.print("X2 data ke " + (i + 1) + "\t: ");
            jumlah_data[i][1] = in.nextDouble();
            System.out.print("Y data ke " + (i + 1) + "\t: ");
            jumlah_data[i][2] = in.nextDouble();
            jumlah_data[i][3] = jumlah_data[i][0] * jumlah_data[i][0];
            jumlah_data[i][4] = jumlah_data[i][1] * jumlah_data[i][1];
            jumlah_data[i][5] = jumlah_data[i][2] * jumlah_data[i][2];
            jumlah_data[i][6] = jumlah_data[i][0] * jumlah_data[i][2];
            jumlah_data[i][7] = jumlah_data[i][1] * jumlah_data[i][2];
            jumlah_data[i][8] = jumlah_data[i][0] * jumlah_data[i][1];
            //SIGMA XI
            jumlah_data[akhir][0] = jumlah_data[akhir][0] + jumlah_data[i][0];
            jumlah_data[akhir][1] = jumlah_data[akhir][1] + jumlah_data[i][1];
            jumlah_data[akhir][2] = jumlah_data[akhir][2] + jumlah_data[i][2];
            jumlah_data[akhir][3] = jumlah_data[akhir][3] + jumlah_data[i][3];
            jumlah_data[akhir][4] = jumlah_data[akhir][4] + jumlah_data[i][4];
            jumlah_data[akhir][5] = jumlah_data[akhir][5] + jumlah_data[i][5];
            jumlah_data[akhir][6] = jumlah_data[akhir][6] + jumlah_data[i][6];
            jumlah_data[akhir][7] = jumlah_data[akhir][7] + jumlah_data[i][7];
            jumlah_data[akhir][8] = jumlah_data[akhir][8] + jumlah_data[i][8];
        }

        System.out.println("");
        System.out.println("1. Langkah 1");
        System.out.println("Ha\t: Ada pengaruh yang signifikan antara X2 dan Y jika X1 tetap");
        System.out.println("Ho\t: Tidak ada pengaruh yang signifikan antara X2 dan Y jika X1 tetap");
        System.out.println("");
        System.out.println("2. Langkah 2\n"
                + "\n--------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+"
                + "\nX1\t|\tX2\t|\tY\t|\tX1^2\t|\tX2^2\t|\tY^2\t|\tX1Y\t|\tX2Y\t|\tX1X2\t|"
                + "\n--------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");
        for (int i = 0; i < jumlah_data.length; i++) {
            for (int j = 0; j < jumlah_data[i].length; j++) {
                if (jumlah_data[i][j] != 0) {
                    System.out.print(jumlah_data[i][j] + "\t|\t");
                } else {
                    break;
                }
            }
            if (jumlah_data[i][0] != 0) {
                System.out.println("");
            } else {
                break;
            }
        }

        System.out.println("SIGMA");
        for (int i = 0; i < jumlah_data[0].length; i++) {
            if (jumlah_data[akhir][i] != 0) {
                System.out.print(jumlah_data[akhir][i] + "\t|\t");
            }
        }
        System.out.println("\n\n3. Langkah 3");
        System.out.println("a. Korelasi parsial X1 dikontrol oleh Y");
        double a1, a2, b1, b2;
        a1 = (data * jumlah_data[akhir][6]) - ((jumlah_data[akhir][0]) * (jumlah_data[akhir][2]));
        System.out.println(a1);
        a2 = (data * jumlah_data[akhir][3] - Math.pow(jumlah_data[akhir][0], 2)) * (data * jumlah_data[akhir][5] - Math.pow(jumlah_data[akhir][2], 2));
        langkah3A = (a1 / Math.sqrt(a2));
        System.out.println("  RX1Y = " + df.format(langkah3A));

        System.out.println("");
        System.out.println("b. Korelasi parsial X2 dikontrol oleh Y");
        b1 = (data * jumlah_data[akhir][7]) - ((jumlah_data[akhir][1]) * (jumlah_data[akhir][2]));
        b2 = (data * jumlah_data[akhir][4] - Math.pow(jumlah_data[akhir][1], 2)) * (data * jumlah_data[akhir][5] - Math.pow(jumlah_data[akhir][2], 2));
        langkah3B = (b1 / Math.sqrt(b2));
        System.out.println("  RX2Y = " + df.format(langkah3B));

        System.out.println("");
        System.out.println("\n\n4. Langkah 4");
        System.out.println("a. Jika Analisis Korelasi antara Variabel bebas X1 dengan variabel bebas X2 ");
        double i1, i2;
        i1 = (data * jumlah_data[akhir][8]) - (jumlah_data[akhir][0] * jumlah_data[akhir][1]);
        i2 = (data * jumlah_data[akhir][3] - Math.pow(jumlah_data[akhir][0], 2)) * (data * jumlah_data[akhir][4] - Math.pow(jumlah_data[akhir][1], 2));
        langkah4 = (i1 / Math.sqrt(i2));
        System.out.println("  RX1X2 = " + df.format(langkah4));

        System.out.println("");
        System.out.println("\n\n5. Langkah 5");
        System.out.println("a.Uji Analisis Korelasi Parsial  Jika X1 Tetap ");
        double x1, x2 ;
        x1 = (langkah3B) - (langkah3A * langkah4);
        x2 = (1 - (Math.pow(langkah3A , 2))) * (1 - (Math.pow(langkah4 , 2))); 
        langkah5A = (x1 / Math.sqrt(x2));
        System.out.println("\nr parsial : "+langkah5A);
    }

}
