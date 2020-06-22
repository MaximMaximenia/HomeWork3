import java.util.Random;

public class Lesson3 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        int chet = 0, nechet = 0, i = 0;
        Random random = new Random();

        {
            for (i = 0; i < 15; i++) {
                mass[i] = random.nextInt(99);
                System.out.println(mass[i]);


            }
            for (int j = 0; j < 15; j++)
                if (mass[j] % 2 == 0) {
                    chet++;


                } else nechet++;

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("ЧЕТНЫЕ ЧИСЛА : " + chet);
            System.out.println("НЕЧЕТНЫЕ ЧИСЛА : " + nechet);
        }
    }
}

