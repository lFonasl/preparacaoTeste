/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utente;

/**
 *
 * @author UserPL022Pc17
 */
public class Utente {
    
    String nome;
    String DataNascimento;
    String observacoes;

    public Utente(String nome, String DataNascimento, String observacoes) {
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.observacoes = observacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    
    
}
