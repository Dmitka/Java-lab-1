/**
 * Задача 3. Развертка числовых диапазонов
 * Написать программу, которая принимает через командную строку несколько числовых диапазонов и выдает на экран список чисел.
 * Например: ''1,2,4-7,18-21'' -> 1,2,4,5,6,7,18,19,20,21.
 */

import java.util.Scanner;

public class Zadacha3_RazvertkaDiapaz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        Integer len= scan.length();
        int zapInd=0;
        int tirInd;
        String strOut="";
        String strTmp1;
        String strTmp2;
        String podstrTmp2;
        int zapIndPosl=0;

        if (scan.indexOf('-')==-1)
        {
            System.out.print(scan);
        }
        else {
            for (int i = 0; i < len; i++) {
                if (scan.charAt(i) == ',') zapInd = i + 1;
                if (scan.charAt(i) == '-') {
                    tirInd = i;
                    strTmp1 = scan.substring(zapInd, tirInd); //число перед тире
                    podstrTmp2 = scan.substring(tirInd);                                         //определяем положение
                    zapIndPosl = len;                                                             //первой запятой после тире
                    if (podstrTmp2.indexOf(',') > -1) zapIndPosl = podstrTmp2.indexOf(',') + tirInd;  //или конец строки
                    strTmp2 = scan.substring(tirInd + 1, zapIndPosl); //число после тире
                    strOut = strOut + ",";
                    for (int j = Integer.parseInt(strTmp1) + 1; j < Integer.parseInt(strTmp2); j++) {
                        strOut = strOut + j + ",";
                    }
                } else strOut = strOut + scan.charAt(i);
            }
            System.out.print(strOut);
        }
    }
}
