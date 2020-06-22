
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Lesson10 {
    public static void main(String[] args) {
        int y = 0;
        Random random = new Random();
        System.out.print("ВВЕДИТЕ ДЛИННУ МАССИВА/МАКСИМАЛЬОЕ ЗНАЧЕНИЕ( >3 ): ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int ch = 0;
        if (x < 3) {
            System.out.println("НЕДОПУСТИМОЕ ЗНАЧЕНИЕ,ЕЩЕ РАЗ:");
            s.nextInt();

        }
        int[] mass = new int[x];

        System.out.println();
        System.out.println("МАССИВ 1 : ");
        for (int i = 0; i < x; i++) {

            mass[i] = random.nextInt(x);
            if (mass[i] % 2 == 0 ) {
                ch++;
            }
            System.out.print( +mass[i] + " ");

        }
        if (ch==0){
            System.out.println();
            System.out.println("ЧЕТНЫХ ЧИСЕЛ НЕТУ");}
        int[] mass2 = new int[ch];
        System.out.println();
        System.out.println("МАССИВ 2 : ");

        for (int i = 0; i < x; i++) {
            if (mass[i] % 2 == 0) {
                mass2[y] = mass[i];
                System.out.print(+mass2[y]+" ");
                y++;

            }
        }
    }
}