package Apps;

import java.util.List;
import java.util.ArrayList;

public class TelefoneCelular {
    private String numeroDeTelefone;
    private List<String> contatos;
    private List<String> historicoDeChamadas;

    public TelefoneCelular() {
        contatos = new ArrayList<>();
        historicoDeChamadas = new ArrayList<>();
    }

    public void fazerChamada(String numero) {
        System.out.println("Ligando para " + numero);
        historicoDeChamadas.add("Chamando " + numero);
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
        historicoDeChamadas.add("Mensagem enviada para " + numero + ": " + mensagem);
    }

    public void receberChamada() {
        System.out.println("Recebendo chamada...");
        historicoDeChamadas.add("Chamada recebida");
    }
}
