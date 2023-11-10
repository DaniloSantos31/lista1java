import java.util.Scanner;
public class l1e3 {
  /*Ler dois vetores A com cinco elementos e B com dez elementos (valores numéricos inteiros). 
  Construir um vetor C, que é a junção dos dois outros vetores. Dessa forma, C deve ter a capacidade de  armazenar  15 elementos. 
  Apresentar os  elementos do vetor C.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor para a posição " + i + " do vetorA");
            vetorA[i] = input.nextInt();
        }

        int[] vetorB = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor para a posição " + i + " do vetorB");
            vetorB[i] = input.nextInt();
        }

        int[] vetorC = new int[15];
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorC[i + vetorA.length] = vetorB[i];
        }

        exibeVetor(vetorC);
    }

    public static void exibeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " , ");
        }
    }
}
