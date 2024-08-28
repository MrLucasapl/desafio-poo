package modules.contato;

public interface ContatoRepository {
    void ligar(String numero);

    void atender();

    void iniciarCorreioVoz();
}
