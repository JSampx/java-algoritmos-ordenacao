import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] lista = {5, 6, 3, 1, 7, 8};
        //BubbleSort.bubbleSort(lista);
        //SelectionSort.selectionSort(lista);
        System.out.println(Arrays.toString(MergeSort.mergeSort(lista)));

    }
}