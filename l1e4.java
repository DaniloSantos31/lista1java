/*Ler 15 elementos numéricos inteiros de um vetor A. Construir um vetor B de mesmo tipo, 
observando a seguinte lei de formação: todo elemento do vetor B deve ser o quadrado  do  elemento  correspondente  do  vetor  A.  
Apresentar  os  elementos  dos vetores A e B dispostos lado a lado.*/

import java.util.Scanner;
public class l1e4 {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int[] vetA = new int [15];
        for(int i = 0; i < 15; i++){
            System.out.println("DIgite um valor para a posição " + i + " do vetor A");
            vetA[i] = input.nextInt();
        }
        
        int[] vetB = new int [15];
        for(int i = 0; i < 15; i++){
            vetB[i] = (vetA[i] * vetA[i]);
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
