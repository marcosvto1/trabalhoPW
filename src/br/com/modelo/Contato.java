package br.com.modelo;

import java.util.Calendar;

public class Contato {

    private long id;
    private String nome;
    private String email;
    private String end;
    private Calendar dataNasc;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }
    public Calendar getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    
}
