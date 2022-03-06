package quest_03;

import java.util.Scanner;
/**
 *
 * @author giovanni
 */
public class Quest_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qtd, a;                                             //declaracao de variaveis
        String text, message;
        
        System.out.println("Digite o texto a ser encriptado");  //entrada de texto
        Scanner ler = new Scanner(System.in);
        text = ler.nextLine();                                  //atribuicao do texto numa string
        
	String result = text.replaceAll("\\s+","");             //funcao para tirar os espacos em branco
	qtd = result.length();                                  //funcao para contar os caracteres
        
        a = (int) Math.ceil(Math.sqrt(qtd));                    //atribuindo a variavel "a" a raiz arredondada para cima da quantidade de caracteres da string
        int mat = a * a;                                        //variavel mat define o tamanho de uma matriz quadrada    
        int new_size = mat - qtd;                               //variavel para preencher com espaços vazios a fim de ter uma matriz totalmente preenchida
        result = String.format("%-" + mat +"s", result);        //funcao para completar o resto da string com espacos vazios
        
        for (int i = 0; i < a; i++) {          
            for (int j = i; j <= qtd;) {                        //loop para percorrer os elementos da matriz e fazer a trocas necessárias
                System.out.print(result.charAt(j));
                j = j + a;                                      //acrescenta um indice especifico de acordo com o tamanho da matriz, se a matriz for 3x3 o indice incrementara 3 unidades
            }
            System.out.print(" ");                              //print para exibir a mensagem abaixo da entrada
        }
    }    
}
