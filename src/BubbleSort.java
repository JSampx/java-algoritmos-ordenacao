import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            boolean go = false;
            int a;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    go = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
