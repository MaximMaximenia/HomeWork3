import java.util.Random;

public class Lesson6 {
    public static void main(String[] args) {
        int[] mass = new int[4];
        Random random = new Random();
        for (int k = 0; k < 4; k++) {
            mass[k] = random.nextInt(10);
            System.out.print(" " + mass[k] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        if (mass[0] < mass[1] & mass[1] < mass[2]& mass[2]< mass[3]) {
            System.out.println("Массив является возрастающим");

        } else {
            System.out.println("Массив не является возрастающим");
        }

    }
}



