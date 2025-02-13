public class MergeSort {
    /*
    Merge sort é um algoritmo de ordenação basedo em 'Dividir para conquistar'.
    Baseia-se na divisão de um array em partes menores e ordenação dos itens em
    subarrays auxiliares para, no final, fazer a mesclagem(merge) em um único array.
     */


    public static int[] mergeSort(int[] arr) {
        /*
                Método que divide o array original em dois subarrays
         */
        if (arr.length < 2) {
            return arr;
        }

        int[] esquerda, direita;


        int pivot = arr.length / 2;

        esquerda = new int[pivot];
        direita = new int[arr.length - pivot];

        System.arraycopy(arr, 0, esquerda, 0, pivot);
        System.arraycopy(arr, pivot, direita, 0, arr.length - pivot);

        esquerda = mergeSort(esquerda);
        direita = mergeSort(direita);

        return merge(esquerda, direita);

    }

    private static int[] merge(int[] esquerda, int[] direita) {
        /*
        Método que mescla os dois arrays auxiliares
         */
        int[] mesclado = new int[esquerda.length + direita.length];
        int i = 0, j = 0, k = 0; //variáveis auxiliares

        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                mesclado[k++] = esquerda[i++];
            } else {
                mesclado[k++] = direita[j++];
            }
        }
        while (i < esquerda.length) {
            mesclado[k++] = esquerda[i++];
        }

        while (j < direita.length) {
            mesclado[k++] = direita[j++];
        }
        return mesclado;
    }
}
