package edu.fatec.lp2.exercicio1;

public class Main {
    public static void main(String[] args) {
        Contatinho ana = new Contatinho("Ana","11999999999");
        Contatinho bia = new Contatinho("Bia", "119575879");
        Contatinho jorge = new Contatinho("jorge", "11357798568");
        Contatinho theo = new Contatinho("theo", "1135589775");
        Whatsapp whats =new Whatsapp(3, 3);
        whats.AdicionarContato(ana);
        whats.AdicionarContato(bia);
        whats.listarContatos();
        whats.AdicionarContato(jorge);
        whats.listarContatos();
        System.out.println(whats.AdicionarContato(theo));

        MsgTexto texto = new MsgTexto(ana);
        Mensagem retorno = texto.sendMessage("oi");
        System.out.println(texto.getNumChar());
        System.out.println(texto == retorno);
        System.out.println(whats.AdicionarMensagem(retorno));
        whats.ListarMensagens();

        MsgAudio audio = new MsgAudio(jorge,45);
        Mensagem retorno2 = audio.sendMessage("audio.mp3");
        System.out.println(whats.AdicionarMensagem(retorno2));
        whats.ListarMensagens();

        MsgFoto foto = new MsgFoto(bia,88);
        Mensagem retorno3 = foto.sendMessage("foto.png");
        whats.AdicionarMensagem(retorno3);
        whats.ListarMensagens();

    }
}
