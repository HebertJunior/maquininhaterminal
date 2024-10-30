/**
 * Essa classe representa o objeto da operação da maquininha.
 * 
 * Esta classe é o objeto operação, que terá informações sobre o valor, data e hora da operação
 * e métodos para mostrar ela.
 * 
 * @author Hebert L. B. Júnior
 * @version 1.0
 */

package maquininhaterminal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Op {
    
   
    private double valor; //o valor da compra
    
    LocalDateTime dh = LocalDateTime.now();//retorna a data e hora atual
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm");
    String hora = dh.format(formatter);

    public Op() {
        
    }

    public Op(double valor) {
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public double getValor() {
        return valor;
    }

    public String getHora() {
        return hora;
    }
 
    


  
}
