/**
 * Задача 1 Последовательность Коллатца
 * Найти наибольшую последовательность Коллатца для чисел в диапазоне от 1 до 1 000 000.
 */

public class Zadacha1_Collatz {

    public static void main(String[] args) {
        long n;
        int a;
        int maxN = 0; //max кол-во итераций
        int maxI = 0; //число с max кол-вом итераций
        for(int i=1;i<=1000000;i++) {
            n=i;
            a=0;
            while (n != 1) {
                if (n % 2 == 0) n=n/2;
                else n=n*3+1;
                a++;
            }
            if (a>maxN) {
                maxN = a;
                maxI = i;
            }
        }
        System.out.println(maxN);
        System.out.println(maxI);
    }
}
