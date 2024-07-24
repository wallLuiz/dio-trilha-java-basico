package Dispositivos;

public class iPhone {
    private String modelo;
    private String versao;
    private String cor;
    private int armazenamento;

    public iPhone(String modelo, String versao, String cor, int armazenamento) {
        this.modelo = modelo;
        this.versao = versao;
        this.cor = cor;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        System.out.println("iPhone ligado");
    }

    public void desligar() {
        System.out.println("iPhone desligado");
    }

    public void reset() {
        System.out.println("iPhone resetado");
    }
}
