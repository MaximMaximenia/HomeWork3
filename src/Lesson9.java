
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;


public class Lesson9 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print("ВВЕДИТЕ ДЛИННУ МАССИВА: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int summ = 0;
        int summ2 = 0;

        if (x < 0) {
            System.out.println("НЕДОПУСТИМОЕ ЗНАЧЕНИЕ");

        }
        int[] mass = new int[x];
        System.out.println();

        for (int i = 0; i < x; i++) {
            mass[i] = random.nextInt(15);
            System.out.print(mass[i] + " ");


            if (i < x / 2) {
                summ += mass[i];

            } else {
                summ2 += mass[i];
            }


        }
        System.out.println();
        if (summ>summ2){
            System.out.println("ПЕРВАЯ ПОЛОВИНА МАССИВА БОЛЬШЕ ");

        }
        else{
            System.out.println("ВТОРАЯ ПОЛОВИНА МАССИВА БОЛЬШЕ ");

        }}}
