package Apps;

import java.util.List;
import java.util.ArrayList;

public class DispositivoDeInternet {
    private String navegador;
    private String clienteDeEmail;
    private List<String> aplicativosDeInternet;

    public DispositivoDeInternet() {
        aplicativosDeInternet = new ArrayList<>();
    }

    public void navegar(String url) {
        System.out.println("Navegando para: " + url);
    }

    public void enviarEmail(String destinatario, String assunto, String corpo) {
        System.out.println("Enviando e-mail para " + destinatario + " com assunto: " + assunto);
    }

    public void baixarAplicativo(String aplicativo) {
        System.out.println("Baixando aplicativo: " + aplicativo);
        aplicativosDeInternet.add(aplicativo);
    }
}
