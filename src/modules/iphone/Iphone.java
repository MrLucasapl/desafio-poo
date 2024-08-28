package modules.iphone;

import modules.contato.ContatoRepository;
import modules.musica.MusicaRepository;
import modules.navegador.NavegadorRepository;

public class Iphone implements MusicaRepository, ContatoRepository, NavegadorRepository {

    @Override
    public void tocar(String nome) {
        System.out.println("Tocando música " + nome);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música ");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Página exibida " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio voz");
    }

}
