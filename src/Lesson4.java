import java.util.Random;

public class Lesson4 {
    public static void main(String[] args) {

        int[] mass = new int[20];
        int i = 0;
        Random random = new Random();
        for (i = 0; i < 20; i++) {
            mass[i] = random.nextInt(20);
            System.out.print(mass[i] + "  ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------");
        for (i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                mass[i] = 0;
            }
            System.out.print(mass[i] + "  ");


        }
    }
}


