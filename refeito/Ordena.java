package refeito;

import java.util.Arrays;

public class Ordena {
    public static void main(String[] args) {
        
        String nomes [] = {"Carlos", "Kely", "Moyra", "Millena","Linda", "Jéssica", "Eduardo"}; 
        String aux;
        
        Arrays.sort(nomes);
        for(int i = 0; i < nomes.length-1; i++){
            for(int j = 0; j < nomes.length-1; j++){
                if (nomes[j].compareTo(nomes[j+1]) > 0 ) {
                    aux = nomes[j];
                    nomes [j] = nomes [j+1] ;
                    nomes [j+1] = aux;
                }  
            }
        }
        for(int i = 0; i < nomes.length; i++){
            System.out.print("["+nomes[i]+"] ");
        }
    }
}
