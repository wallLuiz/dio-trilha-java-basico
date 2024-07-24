package Apps;

import java.util.List;
import java.util.ArrayList;

public class GoogleMaps {
    private String localizacaoAtual;
    private String destino;

    public void navegar(String destino) {
        System.out.println("Navegando para: " + destino);
    }

    public String buscarLocal(String local) {
        System.out.println("Buscando local: " + local);
        return local;
    }

    public List<String> obterRotas(String destino) {
        List<String> rotas = new ArrayList<>();
        rotas.add("Rota 1 para " + destino);
        rotas.add("Rota 2 para " + destino);
        System.out.println("Obtendo rotas para: " + destino);
        return rotas;
    }
}
