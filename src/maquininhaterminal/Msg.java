
package maquininhaterminal;

import java.util.Scanner;

public class Msg {
    
    
    public void limpa_tela()
    {
         for (int i = 0; i < 10; i++) {
            System.out.println();
         }
    }
    
    public void Continuar()
    {
        Scanner ent = new Scanner(System.in);
        System.out.println("PRESSIONE ENTER PARA CONTINUAR >>");
        System.out.println("===================================");
        String op = ent.nextLine();
        limpa_tela();
        
        
    }
    
    public void Menu_Principal()
    {
        System.out.println("===================================");
        System.out.println("MÁQUINA DE CARTÃO \n");
        System.out.println("1 - Efetuar Venda\n2 - Estorno \n3 - Histórico e Opções\n0 - Sair\n\nSelecione uma das opções acima:    ");
        System.out.println("\n===================================");
    }
    
    public void Msg_Padrao(String msg)
    {
        System.out.println("===================================");
        System.out.println("MÁQUINA DE CARTÃO \n");
        System.out.println(msg);
        System.out.println("===================================");
    }
    
     public double Inserir_Valor_txt()
    {
          Scanner ent = new Scanner(System.in);
          double val = 0;
          
          limpa_tela();
          Msg_Padrao("Digite o valor:");
          try
          {
            val = ent.nextDouble();  
          }
          catch (Exception e)
          {
            limpa_tela();
            Msg_Padrao("Digite um valor válido");
            ent.nextLine();
          } 
          
          while (val < 0.49)
          {
            limpa_tela();
            Msg_Padrao("Digite um valor maior que R$0.49:");
                try
                {
                  val = ent.nextDouble();  
                }
                catch (Exception e)
                {
                  limpa_tela();
                  Msg_Padrao("Digite um valor válido");
                  ent.nextLine();
                } 
          }
        
        return val;
    }
    
    public int CredDeb_txt()
    {     
        Scanner ent = new Scanner(System.in);
        int op = 0;
        limpa_tela();
        Msg_Padrao("Digite a opção de pagamento:\n1 - CRÉDITO\n2 - DÉBITO");
        
        try
        {
          op = ent.nextInt();  
        }
        catch (Exception e)
        {
           Msg_Padrao("Digite um valor válido.");         
        }
        
        while (op != 1 && op != 2)
        {
           try
           {   
             Msg_Padrao("Digite a opção de pagamento: \n1 - CRÉDITO\n2 - DÉBITO\n0 - Cancelar");
             op = ent.nextInt();  
           }
           catch (Exception e)
           {
            limpa_tela();
            Msg_Padrao("Digite um valor válido.");         
           }
        }
        return op;
    }
    
    
    
    public Msg() {
    }
 
}
