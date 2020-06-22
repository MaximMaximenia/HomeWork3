
import java.util.Random;


public class Lesson8 {
    public static void main(String[] args) {
        Random random = new Random();
        int ch = 0;
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        System.out.print("МАССИВ #1: ");
        for (int i = 0; i < 10; i++) {

            array1[i] = random.nextInt(9);

            System.out.print(array1[i] + " ");

        }
        System.out.println();
        System.out.print("МАССИВ #2: ");
        for (int i = 0; i < 10; i++) {

            array2[i] = random.nextInt(9);

            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.print("МАССИВ #3:  ");
        for (int i = 0; i < 10; i++) {

            array3[i] = (double) array1[i] / array2[i];

            System.out.print(array3[i] + " ; ");
        }
        for (int i = 0; i < 10; i++) {
            if (array3[i] % 1 == 0)
                ch++;

        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("КОЛ-ВО ЦЕЛЫХ ЧИСЕЛ В МАССИВЕ #3 :"+ch);
    }
}
