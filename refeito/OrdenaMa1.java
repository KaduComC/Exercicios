package refeito;

import java.util.Scanner;

public class OrdenaMa1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int matriz[] = new int[20];
        int aux;
        
        for(int i = 0; i < matriz.length; i++){
            System.out.print("Digite um número inteiro: ");
            matriz[i] = input.nextInt();
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(matriz[i] < matriz[j]){
                    aux = matriz[i];
                    matriz[i] = matriz[j];
                    matriz[j] = aux;
                }
            }
        }
        System.out.print("\n\nMatriz em ordem Crescente:");
        for(int i = 0; i < matriz.length; i++){
            System.out.print("["+matriz[i]+"] ");
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(matriz[i] > matriz[j]){
                    aux = matriz[i];
                    matriz[i] = matriz[j];
                    matriz[j] = aux;
                }
            }
        }
        System.out.print("\n\nMatriz em ordem Decrescente:");
        for(int i = 0; i < matriz.length; i++){
            System.out.print("["+matriz[i]+"] ");
        }

        input.close();
    }   
}