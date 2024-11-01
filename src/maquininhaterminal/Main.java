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
    Msg msg = new Msg();
    
    int c = -2;//menu

    while (c != 0) 
    {
        msg.Menu_Principal();
        c = scanner.nextInt();
        switch (c)
        {  
            case 1 -> {
                msg.limpa_tela();
                op.Comprar(msg.Inserir_Valor_txt());
                op.CredDeb(msg.CredDeb_txt());
                msg.Continuar();
            }
            case 2 -> {
                msg.limpa_tela();
                msg.Msg_Padrao("Será implementada!");
                msg.Continuar();
                msg.limpa_tela();
            }
            case 3 -> {
                msg.limpa_tela();
                msg.Msg_Padrao("Será implementada!");
                msg.Continuar();
                msg.limpa_tela();
            }
            case 0 -> {
                msg.limpa_tela();
                msg.Msg_Padrao("FINALIZANDO...");
                msg.limpa_tela();
                c = 0;
                return;
            }
            default -> {
                msg.limpa_tela();
                msg.Msg_Padrao("Opção inválida");
                msg.limpa_tela();
            }
        } 
    }
    
    System.out.println("\n");
    System.out.println("===================================");
    
    
    
    
    
    }
}
