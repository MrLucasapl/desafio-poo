import modules.iphone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone();
        
        meuIphone.selecionarMusica("Minha Música Favorita");
        meuIphone.tocar("Turma do Tigrão");
        meuIphone.pausar();

        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
    }
}
