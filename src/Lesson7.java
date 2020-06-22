
import java.util.Random;
public class Lesson7 {
    public static void main(String[] args) {
        int[] mass = new int[12];
        Random random = new Random();
        int k = 0;
        int max = mass[0];
        for (k = 0; k < 12; k++) {
            mass[k] = random.nextInt(15);
            System.out.print(" " + mass[k] + " ");
            if (mass[k] > max) {
                max = mass[k];
            }
        }
        System.out.println();
        System.out.println("--------------------------------------------|");
        for (int i = 0; i < 12; i++)
            if (mass[i] ==max) {
                System.out.println("МАКС ЗНАЧЕНИЕ НАХОДИТСЯ ПОД ИНДЕКСОМ: "+ i);
            }
    }}