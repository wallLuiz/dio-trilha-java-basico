package Apps;

import java.util.List;
import java.util.ArrayList;

public class iPod {
    private List<String> bibliotecaDeMusica;
    private List<String> bibliotecaDeVideos;
    private int volume;

    public iPod() {
        bibliotecaDeMusica = new ArrayList<>();
        bibliotecaDeVideos = new ArrayList<>();
        volume = 50; // Volume padrão
    }

    public void reproduzirMusica(String musica) {
        System.out.println("Reproduzindo música: " + musica);
    }

    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    public void reproduzirVideo(String video) {
        System.out.println("Reproduzindo vídeo: " + video);
    }
}
