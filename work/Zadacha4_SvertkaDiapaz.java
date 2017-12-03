/**
 * Задача 4. Свертка числовых диапазонов
 * Написать программу, осуществляющую свертку числовых диапазонов (обратная задача к 3).
 */

import java.util.Scanner;

public class Zadacha4_SvertkaDiapaz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        String strOut="";
        char znak;
        int FirstZapInd = scan.indexOf(',');
        int j;
        int n;
        String strArr[] = scan.split(",");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
            //System.out.println(numArr[i]);
        }

        if (FirstZapInd == -1)
        {
            System.out.print(scan);
        }
        else {
            for (int i=0;i<numArr.length;i++) {
                j = i;
                n = 0;
                while (i < numArr.length-1 && numArr[i] == numArr[i + 1] - 1) {
                    i++;
                    n++;
                }
                if (n > 1) znak = '-';
                else znak = ',';
                strOut = strOut + numArr[j] + znak + numArr[i];
                if (i+1<numArr.length) strOut = strOut + ',';
                }
        }
        System.out.print(strOut);
    }
}
