import java.util.Scanner;

public class App {

    public static void QuickSort(int[] vetor, int esq, int dir) {
        int pivo, aux, i, j;
        int meio;
        i = esq;
        j = dir;
        meio = (int) ((i + j) / 2);
        pivo = vetor[meio];
        do {
            while (vetor[i] < pivo)
                i = i + 1;
            while (vetor[j] > pivo)
                j = j - 1;
            if (i <= j) {
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
                i = i + 1;
                j = j - 1;
            }
        } while (j > i);
        if (esq < j)
            QuickSort(vetor, esq, j);
        if (i < dir)
            QuickSort(vetor, i, dir);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] dados = new int[10];

        System.out.println("Entre com " + dados.length + " números");

        for (int i = 0; i < dados.length; i++)
            dados[i] = console.nextInt();
        QuickSort(dados, 0, dados.length - 1);

        System.out.println("\n\nNúmeros ordenados:\n");

        for (int i = 0; i < dados.length; i++)
            System.out.println(dados[i]);
        console.close();
    }
}
