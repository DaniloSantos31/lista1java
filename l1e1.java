import java.util.Scanner;
public class l1e1{
    public static void main(String[] args){
        /*Ler  oito  elementos  numéricos  inteiros  em  um  vetor  A.  
        Construir  um  vetor  B  de mesma dimensão com os elementos do vetor A multiplicados por 3. Apresentar os elementos do vetor B. */

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int [8];
        

        for(int i = 0; i < 8; i++){
            System.out.println("Digite um valor para a posição " + i + " do vetor: ");
            vetorA [i] = input.nextInt();
        }

        int[] vetorB = new int [8];

        for(int i = 0; i < 8; i++){
            vetorB[i] = (vetorA [i] * 3);
        }
        exibeVetor(vetorB);
    }
    public static void exibeVetor(int[] vetor) {
        int i;
        for (i = 0; i < vetor.length; i++)
          System.out.print(vetor[i] + " , ");
    }
}
