/*Ler  20  elementos  numéricos  inteiros  para  um  vetor  A  e  construir  um  vetor  B  
de mesma dimensão com os mesmos elementos de A. Eles devem estar invertidos, ou seja,
o primeiro elemento de A passa a ser o último de B, o segundo elemento de A passa a ser o penúltimo de B,
e assim por diante. Apresentar os elementos dos dois vetores.*/

import java.util.Scanner;
public class l1e5 {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int[] vetA = new int[20];
        for(int i = 0; i < 20; i++){
            System.out.println("Digite um valor para a posição " + i + " do vetor A");
            vetA[i] = input.nextInt();
        }
        
        int[] vetB = new int[20];
        for(int i = 0; i < 20; i++){
            int temp = vetA[i];
                vetA[i] = vetB[19 - i];
                vetB[19 - i] = temp;
                vetA[i] = temp;
        }
        exibeVetores(vetA, vetB);
    }
    
    public static void exibeVetores(int[] vetorA, int[] vetorB) {
        System.out.println("Vetor A\tVetor B");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + "\t" + vetorB[i]);
        }
    }
    
}
