/**
 * Essa classe principal da maquininha.
 * 
 * Esta classe é a main, nela será feito o layout com os valores de Op
 * 
 * @author Hebert L. B. Júnior
 * @version 1.0
 */
package maquininhaterminal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);    
    sys op = new sys();//criação de uma nova operação e inserção de valores
    
    
    int c;//menu
    
    System.out.println("===================================");
    System.out.println("\n");
    
    System.out.println("MÁQUINA DE CARTÃO \n");
    System.out.println("Selecione uma opção:    \n1 - Efetuar Venda\n2 - Estorno \n3 - Histórico e Opções\n0 - Sair"); 
    c = scanner.nextInt();
    switch (c)
    {
        case 1:
            double val = op.Inserir_Valor();
            int opc = op.CredDeb();
            if (opc == 1)
            {
                op.Credito(val);
            }
            else
            {
                op.Debito(val);
            }
            break;
            
        case 2:
            System.out.println("Será implementada");
            break;
        case 3:
            System.out.println("Será implementada");   
            break;
        case 0:
            System.out.println("Será implementada");
            break;
        default:
            System.out.println("Opção invalida");
    }
    System.out.println("\n");
    System.out.println("===================================");
    
    
    
    
    
    }
}