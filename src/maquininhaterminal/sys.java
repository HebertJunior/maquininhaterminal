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
    Scanner ent = new Scanner(System.in);
    
    public void limpa_tela()
    {
         for (int i = 0; i < 10; i++) {
            System.out.println();
         }
    }
    
    public double Inserir_Valor()
    {
        double val = 0;
        
          limpa_tela();
          System.out.println("Digite o valor:");
          try
          {
            val = ent.nextDouble();  
          }
          catch (Exception e)
          {
            System.out.println("");
            System.out.println("Digite um valor válido");         
          } 
          
          while (val < 0.49)
          {
            limpa_tela();
            System.out.println("Digite um valor maior que R$0.49:");
                try
                {
                  val = ent.nextDouble();  
                }
                catch (Exception e)
                {
                  System.out.println("Digite um valor válido");
                  ent.nextLine();
                } 
          }
        
        oper.setValor(val);
        return val;
    }
    
    public int CredDeb()
    { 
        limpa_tela();
        int op = 0;
        System.out.println("Digite a opção de pagamento:");
        System.out.println("1 - CRÉDITO\n2 - DÉBITO");
        
        try
        {
          op = ent.nextInt();  
        }
        catch (Exception e)
        {
            System.out.println("Digite um valor válido.");         
        }
        
        while (op != 1 && op != 2 )
        {
           try
           {   
             limpa_tela();
             System.out.println("Digite a opção de pagamento:");
             System.out.println("1 - CRÉDITO\n2 - DÉBITO");
             op = ent.nextInt();  
           }
           catch (Exception e)
           {
            System.out.println("Digite um valor válido.");         
           }
        }
        
        return op;
    }
    
    public void Credito(double val)
    {
        int psswd = 0;
        int senha = cliente.getSenha();
        double valor;
        limpa_tela();
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
            limpa_tela();
            System.out.println("Transação Concluída!"); 
            recibo();
        }
        else
        {
            limpa_tela();
            System.out.println("Senha incorreta!");
        }
    }
      public void Debito (double val)
    {
        int psswd = 0;
        int senha = cliente.getSenha();
        double valor;
        limpa_tela();
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
            limpa_tela();
            System.out.println("Transação Concluída!");
            recibo();
            
        }
        else
        {
            limpa_tela();
            System.out.println("Senha incorreta!");
        }
    }
      
    public void recibo()
    {
        String nome = cliente.getNome();
        String tempo = oper.getHora();
        double total = oper.getValor();
        
        System.out.print("============================\n");
        System.out.print("RECIBO\n");
        System.out.println("Nome:   " + nome + "\nData e hora: " + tempo + "\nTotal: R$" + total);
        System.out.print("============================\n");
        
    
        
    }
}
