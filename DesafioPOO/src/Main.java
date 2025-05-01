public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        // Testando funcionalidades do reprodutor musical
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        // Testando funcionalidades do telefone
        iphone.ligar("99999-1234");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando funcionalidades do navegador
        iphone.exibirPagina("https://apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
