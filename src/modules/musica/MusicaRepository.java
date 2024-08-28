package modules.musica;

public interface MusicaRepository {
    void tocar(String nome);

    void pausar();

    void selecionarMusica(String musica);
}
