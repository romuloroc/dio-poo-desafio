public class Usuario {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();
    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica("Musica 1");

    iphone.ligar("123456789");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    iphone.exibirPagina("www.google.com");
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
  }
}
