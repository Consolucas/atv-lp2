package edu.fatec.lp2.exercicio1;

public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(Contatinho contatinho, int duracao){
        super(contatinho);
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String conteudo){
        setConteudo(conteudo);
        return this;
    }
}
