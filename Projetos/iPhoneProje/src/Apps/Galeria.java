package Apps;

import java.util.List;
import java.util.ArrayList;

public class Galeria {
    private List<String> fotos;
    private List<String> albuns;

    public Galeria() {
        fotos = new ArrayList<>();
        albuns = new ArrayList<>();
    }

    public void visualizarFoto(String foto) {
        System.out.println("Visualizando foto: " + foto);
    }

    public void adicionarFoto(String foto) {
        fotos.add(foto);
        System.out.println("Foto adicionada: " + foto);
    }

    public void criarAlbum(String nome) {
        albuns.add(nome);
        System.out.println("Álbum criado: " + nome);
    }
}
