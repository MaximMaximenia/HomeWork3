import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class DopOdnomerArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ВВЕДИТЕ ДЛИННУ МАССИВА : ");
        Random r = new Random();
        int x = sc.nextInt();
        int[] mass = new int[x];
        System.out.println("МАССИВ:");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < x; i++) {
            mass[i] = r.nextInt(20);
            System.out.print(" " + mass[i]);
        }
        //#1---------------------------------------------------------------------
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------");

        int kratn3 = 1;
        for (int i = 0; i < x; i++) {
            if (mass[i] % 3 == 0) {
                kratn3 = mass[i] * kratn3;
            }

        }
        System.out.println("ПРОИЗВЕДЕНИЕ ЭЛЕМЕНТОВ КРАТНЫХ 3 : " + kratn3);
//#2---------------------------------------------------------------------
        int sum = 0;
        for (int i = 1; i < x; i += 2) {
            sum += mass[i];
        }
        double srAr = (double) (sum) / (x / 2);
        System.out.println("СРЕДНЕЕ АРИФМЕТИЧЕСКОЕ ЭЛЕМЕНТОВ С НЕЧЕТНЫМИ НОМЕРАМИ: " + srAr);
//#3---------------------------------------------------------------------
        int c = 10;
        int count = 0;
        int sum2 = 0;
        double srAr2;
        for (int i = 0; i < x; i++) {
            if (mass[i] > x) {
                sum2 = +mass[i];
                count++;
            }
        }
        srAr2 = (double) sum2 / count;
        System.out.println("СРЕДНЕЕ АРИФМ.ЭЛЕМЕНТОВ ПЕРВОСХОДЯЩИХ [C]: " + srAr2);
//#4---------------------------------------------------------------------
        int lessOdd = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] % 2 == 1) {
                if (mass[i] < lessOdd)
                    lessOdd = mass[i];
            }
        }
        System.out.println("НАИМЕНЬШИЙ НЕЧЕТНЫЙ ЭЛЕМЕНТ : " + lessOdd);
        //#5---------------------------------------------------------------------
        System.out.print("ИЗЕМЕНЕННЫЙ МАССИВ ( КАЖЫЙ 2рой ЭЛЕМЕНТ = 0 ) : ");
        for (int i = 0; i < x; i++) {
            if (i % 2 == 1) {
                mass[i] = 0;
            }
            System.out.print(" " + mass[i]);
        }
        //#6---------------------------------------------------------------------
        boolean equal = false;
        System.out.println();
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < x; j++) {
                if (mass[i] == mass[j]) {
                    equal = true;
                    break;
                }
            }

        }
        if (equal = true) {
            System.out.println("ЭЛЕМЕНТЫ МАССИВА РАЗЛИЧНЫ");
        } else {
            System.out.println("ВСЕ ЭЛЕМЕНТЫ МАССИВА РАВНЫ");
        }

        //#7---------------------------------------------------------------------
        System.out.print("ЗАДАЙТЕ ЗНАЧЕНИЕ ДЛЯ ПОИСКА : ");
        int number = sc.nextInt();
        int timeFindNum = 0;
        for (int i = 0; i < x; i++) {
            if (mass[i] == number) {
                timeFindNum++;
            }
        }
        System.out.println("ВАШЕ ЧИСЛО ВСТРЕТИЛОСЬ  " + timeFindNum + " РАЗ ");

//#8---------------------------------------------------------------------
        int maxmass = 0;
        for (int i = 0; i < x; i++) {
            if (maxmass < mass[i]) {
                maxmass = mass[i];
            }
        }
        int secondMax = 0;
        int zero = mass[0];
        for (int i = 0; i < x; i++) {
            if (secondMax < mass[i] && mass[i] != maxmass) {
                secondMax = mass[i];
            }
        }
        System.out.println("ВТОРОЙ ПО ВЕЛИЧИНЕ ЭЛЕМЕНТ МАССИВА  :  " + secondMax);

        //#9---------------------------------------------------------------------
        int lessEven = mass[2];
        for (int i = 0; i < x - 2; i += 2) {
            if (mass[i] > mass[i + 2]) {
                lessEven = mass[i + 2];
            }
        }
        System.out.println("НАИМЕНЬШИЙ ЭЛЕМЕНТ С ЧЕТНЫМ ИНДЕКСОМ: " + lessEven);

        //#10---------------------------------------------------------------------
        for (int i = 0; i < x; i++) {
            if (mass[i] == maxmass) {
                mass[i] = zero;
                zero = mass[i];
            }

        }
    }
}
