public class Lesson2 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 100; i = i + 2) {
            x++;
        }
        int[] mass = new int[x];
        for (int j = 0; j < x; j++) {
            mass[j] = j * 2 + 1;
            System.out.print(mass[j] + " ");
        }
        System.out.println();
        for (int g = x-1; g >= 0; g--) {

            System.out.print(mass[g]+" ");
        }
    }
}
