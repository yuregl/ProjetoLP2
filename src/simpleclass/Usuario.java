package simpleclass;

import java.io.Serializable;


public class Usuario implements Serializable{
    private String nomeUsuario;
    private String senha;
    private int partidasGanhas;
    private int partidasJogadas;

    public Usuario(String nomeUsuario, String senha){
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.partidasGanhas = 0;
        this.partidasJogadas = 0;
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPartidasGanhas() {
        return partidasGanhas;
    }

    public void setPartidasGanhas(int partidasGanhas) {
        this.partidasGanhas = partidasGanhas;
    }

    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    public void setPartidasJogadas(int partidasJogadas) {
        this.partidasJogadas = partidasJogadas;
    }
    
    public void ganhouPartida(){
        this.partidasGanhas++;
    }
    
    public void partidaNova(){
        this.partidasJogadas++;
    }
}
