package edu.fatec.lp2.exercicio1;

public class Whatsapp {
    private Contatinho[] contatos;
    private Mensagem[] mensagens;

    public Whatsapp(Integer tamanhoCon, Integer tamanhoMen){
        contatos = new Contatinho[tamanhoCon];
        mensagens = new Mensagem[tamanhoMen];
    }

    public void listarContatos(){
        for (Contatinho contato : contatos){
            if(contato!=null) {
                System.out.println(contato.getNome());
            }
        }
    }

    public boolean AdicionarContato(Contatinho contatinho){
        for(int i = 0;i < contatos.length; i++){
            if(contatos[i]==null){
                contatos[i] = contatinho;
                return true;
            }
        }
        return false;

    }

    public  boolean AdicionarMensagem(Mensagem mensagem){
        for(int i =0; i< mensagens.length; i++){
            if(mensagens[i] == null){
                mensagens[i] = mensagem;
                return true;
            }
        }
        return false;
    }

    public void ListarMensagens(){
        for(Mensagem mensagem : mensagens){
            if( mensagem != null){
                System.out.println(mensagem.toString());
            }
        }
    }
}
