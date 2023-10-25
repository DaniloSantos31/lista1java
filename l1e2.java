import java.util.Scanner;

public class l1e2 {
    public static void main(String[] args) {
        /*
         * Ler dois vetores A e B com 20 elementos numéricos inteiros. Construir um
         * vetor C,
         * sendo cada elemento de C a subtração do elemento correspondente de A com B.
         * Apresentar os elementos do vetor C
         */

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um valor para a posição " + i + " do vetor: ");
            vetorA[i] = input.nextInt();
        }

        int[] vetorB = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um valor para a posição " + i + " do vetor: ");
            vetorB[i] = input.nextInt();
        }

        int[] vetorC = new int[20];

        for (int i = 0; i < 20; i++) {
            vetorC[i] = (vetorA[i] - vetorB[i]);
        }
        exibeVetor(vetorC);
    }

        public static void exibeVetor(int[] vetor) {
            int i;
            for (i = 0; i < vetor.length; i++)
              System.out.print(vetor[i] + " , ");

    }

}
