/**
 * Задача 5. Вывод числа символами
 * Напишите программу, которая будет считывать из командной строки число (например 41072819) и выводить его в таком виде *
 */

import java.util.Scanner;

public class Zadacha5_ChisloVSimvol {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String scan = scanner.nextLine();
            //Integer len= scan.length();
            //int[] str=new int[]{0,1,2,3,4,5,6,7,8,9};
            String[] strOut = new String[7];
            String[] n0 = new String[7];
            n0[0] = "  ***  ";
            n0[1] = " *   * ";
            n0[2] = "*     *";
            n0[3] = "*     *";
            n0[4] = "*     *";
            n0[5] = " *   * ";
            n0[6] = "  ***  ";
            String[] n1 = new String[7];
            n1[0] = " * ";
            n1[1] = "** ";
            n1[2] = " * ";
            n1[3] = " * ";
            n1[4] = " * ";
            n1[5] = " * ";
            n1[6] = "***";
            String[] n2 = new String[7];
            n2[0] = " *** ";
            n2[1] = "*   *";
            n2[2] = "*  * ";
            n2[3] = "  *  ";
            n2[4] = " *   ";
            n2[5] = "*    ";
            n2[6] = "*****";
            String[] n3 = new String[7];
            n3[0] = " *** ";
            n3[1] = "*   *";
            n3[2] = "    *";
            n3[3] = "   * ";
            n3[4] = "    *";
            n3[5] = "*   *";
            n3[6] = " *** ";
            String[] n4 = new String[7];
            n4[0] = "   * ";
            n4[1] = "  ** ";
            n4[2] = " * * ";
            n4[3] = "*  * ";
            n4[4] = "*****";
            n4[5] = "   * ";
            n4[6] = "   * ";
            String[] n5 = new String[7];
            n5[0] = "*****";
            n5[1] = "*    ";
            n5[2] = "*    ";
            n5[3] = " *** ";
            n5[4] = "    *";
            n5[5] = "*   *";
            n5[6] = " *** ";
            String[] n6 = new String[7];
            n6[0] = " *** ";
            n6[1] = "*   *";
            n6[2] = "*    ";
            n6[3] = "**** ";
            n6[4] = "*   *";
            n6[5] = "*   *";
            n6[6] = " *** ";
            String[] n7 = new String[7];
            n7[0] = "*****";
            n7[1] = "    *";
            n7[2] = "   * ";
            n7[3] = "  *  ";
            n7[4] = " *   ";
            n7[5] = "*    ";
            n7[6] = "*    ";
            String[] n8 = new String[7];
            n8[0] = " *** ";
            n8[1] = "*   *";
            n8[2] = "*   *";
            n8[3] = " *** ";
            n8[4] = "*   *";
            n8[5] = "*   *";
            n8[6] = " *** ";
            String[] n9 = new String[7];
            n9[0] = " ****";
            n9[1] = "*   *";
            n9[2] = "*   *";
            n9[3] = " ****";
            n9[4] = "    *";
            n9[5] = "    *";
            n9[6] = "    *";

            for (int i = 0; i < 7; i++)
                strOut[i] = "";

            for (int i = 0; i < 7; i++) {
                for(int j=0;j<scan.length();j++)
                {
                    if (scan.charAt(j)=='0') strOut[i]=String.valueOf(strOut[i])+String.valueOf(n0[i])+" ";
                    if (scan.charAt(j)=='1') strOut[i]=String.valueOf(strOut[i])+String.valueOf(n1[i])+" ";
                    if (scan.charAt(j)=='2') strOut[i]=String.valueOf(strOut[i])+String.valueOf(n2[i])+" ";
                    if (scan.charAt(j)=='3') strOut[i]=String.valueOf(strOut[i])+String.valueOf(n3[i])+" ";
                    if (scan.charAt(j)=='4') strOut[i]=String.valueOf(strOut[i])+String.valueOf(n4[i])+" ";
                    if (scan.charAt(j)=='5') strOut[i]=String.valueOf(strOut[i])+String.valueOf(n5[i])+" ";
                    if (scan.charAt(j)=='6') strOut[i]=String.valueOf(strOut[i])+String.valueOf(n6[i])+" ";
                    if (scan.charAt(j)=='7') strOut[i]=String.valueOf(strOut[i])+String.valueOf(n7[i])+" ";
                    if (scan.charAt(j)=='8') strOut[i]=String.valueOf(strOut[i])+String.valueOf(n8[i])+" ";
                    if (scan.charAt(j)=='9') strOut[i]=String.valueOf(strOut[i])+String.valueOf(n9[i])+" ";
                }
                System.out.println(strOut[i]);
            }

        }
    }