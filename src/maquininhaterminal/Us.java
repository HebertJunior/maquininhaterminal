/**
 * Essa classe representa o usuário a utilizar a maquininha.
 * 
 * Esta classe é usuário, nela terá informações como o nome do usuário, numero do cartão,
 * saldo para simular uma conta bancária
 * 
 * @author Hebert L. B. Júnior
 * @version 1.0
 */
package maquininhaterminal;

public class Us {
    
    private String nome; //nome do cliente
    private int ncard; //numero do cartão
    private double saldo;
    private int senha;

    public int getNcard() {
        return ncard;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setNcard(int ncard) {
        this.ncard = ncard;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    
    
    public Us() {
        nome = "Hebert"; //nome do cliente
        ncard = 1237; //numero do cartão
        saldo = 100;
        senha = 1234; 
    }

    public Us(String nome, int ncard, double saldo, int senha) {
        this.nome = nome;
        this.ncard = ncard;
        this.saldo = saldo;
        this.senha = senha;
    }
    
    
    
}
