public class Iphone implements AparelhoTelefônico, NavegadorInternet, RepodutorMusicial {

    @Override
    public void ligar() {
        System.out.println("Ligando.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligacao.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina do navegador.");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba do navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina do navegador.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica.");
    }
}
