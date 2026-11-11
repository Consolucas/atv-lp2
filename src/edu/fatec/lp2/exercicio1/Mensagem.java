package edu.fatec.lp2.exercicio1;

public abstract class Mensagem {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem(Contatinho contatinho){
        this.destinatario = contatinho;
    }


    public abstract Mensagem sendMessage(String conteudo);

    protected void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }

    @Override
    public  String toString(){
        return conteudo;
    }
}
