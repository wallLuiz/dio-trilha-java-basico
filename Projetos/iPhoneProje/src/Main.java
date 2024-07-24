import Dispositivos.iPhone;
import Apps.*;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos objetos
        iPhone iphone = new iPhone("iPhone 12", "14.5", "Preto", 128);

        TelefoneCelular telefone = new TelefoneCelular();
        telefone.fazerChamada("123456789");
        telefone.enviarMensagem("123456789", "Olá, tudo bem?");
        telefone.receberChamada();

        iPod ipod = new iPod();
        ipod.reproduzirMusica("Bohemian Rhapsody");
        ipod.pausarMusica();
        ipod.reproduzirVideo("Bohemian Rhapsody Video");

        DispositivoDeInternet internet = new DispositivoDeInternet();
        internet.navegar("http://www.google.com");
        internet.enviarEmail("destinatario@example.com", "Assunto", "Corpo do e-mail");
        internet.baixarAplicativo("Whatsapp");

        Galeria galeria = new Galeria();
        galeria.adicionarFoto("foto1.jpg");
        galeria.visualizarFoto("foto1.jpg");
        galeria.criarAlbum("Vacaciones");

        GoogleMaps maps = new GoogleMaps();
        maps.navegar("Praia");
        System.out.println("Local: " + maps.buscarLocal("Praia"));
        System.out.println("Rotas: " + maps.obterRotas("Praia"));

        Clima clima = new Clima();
        clima.configurarLocalizacao("São Paulo");
        clima.atualizarClima();
        System.out.println("Previsão: " + clima.exibirPrevisao());
    }
}
