package modules.navegador;

public interface NavegadorRepository {
    void exibirPagina(String url);

    void adicionarNovaAba();

    void atualizarPagina();

}