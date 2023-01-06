import java.util.Arrays;

public class LiveCoding {
    public static void main(String[] args) {
        int[] abs = {0, 2, 3, 0, 1, 15, 45, 33};

        sortedNullEndMassive(abs);


    }

    public static void sortedNullEndMassive(int[] mass) {
        int count = 0;

        int[] sortedNullMassive = new int[mass.length];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 0) {
                sortedNullMassive[count] = mass[i];
                count++;
            }


        }
        System.out.println(Arrays.toString(sortedNullMassive));
    }

}
