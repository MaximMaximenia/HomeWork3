import java.util.Random;

public class Lesson5 {
    public static void main(String[] args) {
        int[] mass = new int[5];
        int[] mass2 = new int[5];
        double summ = 0.0,summ2=0.0;
        double arifm = 0.0,arifm2 = 0.0;
        Random random = new Random();
        System.out.println("Массив # 1");
        for (int k = 0; k < 5; k++) {
            mass[k] = random.nextInt(15);
            System.out.print(" " +mass[k] + " ");
        }
        System.out.println();
        System.out.println("Массив # 2");
        for (int k = 0; k < 5; k++) {
            mass2[k] = random.nextInt(15);
            System.out.print(" " +mass2[k] + " ");
        }
        for (int i = 0; i < 5; i++) {
            summ2 = summ2 + mass2[i];
            summ = summ + mass[i];
            arifm2 = summ2 / 5;
            arifm = summ / 5;
        }
        System.out.println();
        System.out.println("---------------------");

        if (arifm > arifm2) {
            System.out.println("Среднее арифметическое первого масива больше.");
        } else if (arifm < arifm2) {
            System.out.println("Среднее арифметическое второго масива больше.");
        }
        else {
            System.out.println("Средние арифметические масивов равны.");
        }
    }
}




