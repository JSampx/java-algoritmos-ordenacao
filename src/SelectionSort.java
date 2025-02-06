import java.util.Arrays;
// Selection Sort Algorithm. Complexity:
// Best case O(n)
// Average case O(n^2)
// Worst case O(n^2)
public class SelectionSort {
    public static void selectionSort(int[] array) {
        int index, aux;

        for (int i = 0; i < array.length - 1; i++) {
            index = i;  // Assume que o menor elemento está em i

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;  // Atualiza o índice do menor elemento
                }
            }

            if (index != i) { // Se encontrou um menor, faz a troca
                aux = array[index];
                array[index] = array[i];
                array[i] = aux;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
