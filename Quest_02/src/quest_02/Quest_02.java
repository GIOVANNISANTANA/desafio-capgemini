package quest_02;

import java.util.Scanner;
/**
 *
 * @author giovanni
 */
public class Quest_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // declarando a classe Scanner  
        int ind, x, diferenca = 0;                  // declarando variaveis
        
        System.out.println("Quantos números vão entrar no vetor? ");    //entrada de dados, tamanho do vetor e diferença procurada 
        ind = input.nextInt();                                         
        int n[] = new int[ind];                                         //declaração do vetor com a quantidade de indices
        System.out.println("Qual valor da diferença procurada? ");
        x = input.nextInt();        
        
        for (int a = 0; a < ind; a++) {            //loop para adicionar os valores ao vetor
            System.out.println("Digite o valor de indice " + (a+1));
            n[a] = input.nextInt();
        }
        
            for (int i = 0; i < n.length; i++){         //loop para organização do vetor em ordem decrescente
                for (int j = 0; j < n.length; j++){
                    if (n[i] > n[j]){
                        int aux = n[i];
                        n[i] = n[j];
                        n[j] = aux;
                    }
                }
            }
        
            for (int i = 0; i < n.length; i++){         //loop para testar as diferenças do vetor, caso enconte 1 unidade é adicionada a variavel diferenca
                for (int j = 0; j < n.length; j++){
                    if ((n[i] - n[j]) == x){
                        diferenca++;
                    }
                }         
            }
            
            System.out.println("\n" + diferenca);       //impressao do valor diferenca pulando uma linha
    }
}
