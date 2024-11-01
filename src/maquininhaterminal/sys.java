/**
 * Essa classe será responsável pelas operações da maquininha.
 * 
 * Escolha entre crédito ou débito, passagem de tela, confirmação de senha.
 * 
 * @author Hebert L. B. Júnior
 * @version 1.0
 */
package maquininhaterminal;

import java.time.LocalDateTime;
import java.util.Scanner;

public class sys {
    
    Us cliente = new Us();
    Op oper = new Op();
    Msg msg = new Msg();
    Scanner ent = new Scanner(System.in);
    
    
    public void Comprar(double valor)
    {
       oper.setValor(valor);
       
    }
    
    public void CredDeb(int op)
    {     
        if (op == 1)
            {
                Credito(oper.getValor());
            }
        else if (op == 2)
            {
                Debito(oper.getValor());
            } 
        else
            {
                System.out.println("Operação finalizada!");
            }

    }
    
    public void Credito(double val)
    {
        int psswd = 0;
        int senha = cliente.getSenha();
        double valor;
        System.out.println("CRÉDITO");
        System.out.println();
        System.out.println("Digite sua senha:");
        
        try
        {
            psswd = ent.nextInt();
        }
        catch (Exception e)
                {
                    System.out.println("Digite uma senha válida:");
                }
        
        if (senha == psswd)
        {
            System.out.println("Transação Concluída!"); 
            recibo();
        }
        else
        {
            System.out.println("Senha incorreta!");
        }
    }
      public void Debito (double val)
    {
        int psswd = 0;
        int senha = cliente.getSenha();
        double valor;
        System.out.println("Débito");
        System.out.println();
        System.out.println("Digite sua senha:");
        
        try
        {
            psswd = ent.nextInt();
        }
        catch (Exception e)
                {
                    System.out.println("Digite uma senha válida:");
                }
        
        if (senha == psswd)
        {
            System.out.println("Transação Concluída!");
            recibo();
            
        }
        else
        {
            System.out.println("Senha incorreta!");
        }
    }
    public void recibo()
    {        
        String nome = cliente.getNome();
        String tempo = oper.getHora();
        double total = oper.getValor();
        
        msg.limpa_tela();
        System.out.print("============================\n");
        System.out.print("RECIBO\n");
        System.out.println("Nome:   " + nome + "\nData e hora: " + tempo + "\nTotal: R$" + total);
        System.out.print("============================\n");
        msg.Continuar();
        msg.limpa_tela();

    
        
    }
}
