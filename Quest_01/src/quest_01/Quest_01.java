package quest_01;

import java.util.Scanner;
/**
 *
 * @author giovanni
 */
public class Quest_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    // declarando a classe Scanner
        int aux = 0;    //declaração de variaveis
        int mediana;    
        int qtd;
            
        System.out.println("Digite a quantidade de itens que tera a lista, apenas um numero impar eh valido: ");    //entrada da quantidade de entradas
        qtd = input.nextInt();
        
        if(qtd % 2 == 0){           //verifica se o numero digitado foi impar, caso contrario dara mais uma chance antes de encerrar o programa
            System.out.println("Digite novamente a quantidade de itens que tera a lista, apenas um numero impar eh valido: ");
            qtd = input.nextInt();
            if(qtd % 2 == 0){
                System.out.println("Como a quantidade nao era impar o programa sera finalizado");
                System.exit(0);
            }
        }
        
        int arr[]= new int[qtd];    //declarando vetor após saber a quantidade de indice que ele terá
        
        for(int q = 0; q < qtd; q++){   //loop para adicionar valores aos vetores
           System.out.println("Digite o valor de indice " + (q+1)); 
           arr[q] = input.nextInt();
        }
        
        
            for (int i = 0; i < arr.length; i++){   //loop para organizar o vetor em ordem crescente
                for (int j = 0; j < arr.length; j++){
                    if (arr[i] > arr[j]){
                        aux = arr[i];
                        arr[i] = arr[j];
                        arr[j] = aux;
                    }
                }
            }
            
            mediana = arr[arr.length/2];        //como a mediana é o valor que fica ao meio, divide-se o indice por 2 para ter o indice do meio
            
            System.out.println("\n" + mediana); //impressao da variavel mediana
    }

    
}   

