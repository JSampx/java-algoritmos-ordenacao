import java.util.Arrays;

// Bubble Sort Algorithm. Complexity:
// Best case O(n)
// Average case O(n^2)
// Worst case O(n^2)
public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            boolean swapped = false;
            int a;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    swapped = true; // Marca que houve troca
                }
            }if (!swapped) break; // Se nenhuma troca foi feita, o array já está ordenado
        }
        System.out.println(Arrays.toString(array));
    }
}
