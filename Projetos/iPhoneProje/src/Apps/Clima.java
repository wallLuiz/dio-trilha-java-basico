package Apps;

import java.util.List;
import java.util.ArrayList;

public class Clima {
    private String localizacao;
    private float temperaturaAtual;
    private List<String> previsao;

    public Clima() {
        previsao = new ArrayList<>();
    }

    public void atualizarClima() {
        System.out.println("Atualizando clima...");
        temperaturaAtual = 25.0f; // Exemplo de temperatura
        previsao.add("Temperatura: " + temperaturaAtual + "°C");
        previsao.add("Chuva leve prevista para hoje.");
    }

    public List<String> exibirPrevisao() {
        System.out.println("Previsão do tempo:");
        return previsao;
    }

    public void configurarLocalizacao(String local) {
        this.localizacao = local;
        System.out.println("Localização configurada para: " + local);
    }
}
