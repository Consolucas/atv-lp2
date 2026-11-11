package edu.fatec.lp2.exercicio1;

public class MsgFoto extends  Mensagem{
    private int tamanho;

    public MsgFoto(Contatinho contatinho, int tamanho){
        super(contatinho);
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String conteudo){
        setConteudo(conteudo);
        return this;
    }
}
