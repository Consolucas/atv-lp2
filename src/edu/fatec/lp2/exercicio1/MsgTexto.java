package edu.fatec.lp2.exercicio1;

public class MsgTexto extends Mensagem {
    private  int numChar;


    public MsgTexto(Contatinho destinatario){
        super(destinatario);
    }

    @Override
    public Mensagem sendMessage(String conteudo){
        numChar= conteudo.length();
        setConteudo(conteudo);
        return this;
    }

    public int getNumChar(){
        return numChar;
    }
}
